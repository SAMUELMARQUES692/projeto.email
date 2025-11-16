package enviando.email;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class AppTest {
	
	private String userName = "samuelmarquesjavaweb@gmail.com";
	private String senha = "lory fxmq ebwf oeyi";

	@org.junit.Test
	public void testeEmail() {
		
		try {
		
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");/*Autorização*/
		properties.put("mail.smtp.starttls", "true");/*Autenticação*/
		properties.put("mail.smtp.host", "smtp.gmail.com");/*Servidor gmail Google*/
		properties.put("mail.smtp.port", "465");/*Porta do servidor*/
		properties.put("mail.smtp.socketFactory.port", "465");/*Expecificação da porta a ser conectada pelo socket*/
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");/*Classe socket de conexão ao SMTP*/
		
		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName,senha);
			}		
		});
		
		Address[] toUser = InternetAddress.parse("samuelmarquesjavaweb@gmail.com");
		
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(userName));/*Quem esta enviando*/
		message.setRecipients(Message.RecipientType.TO, toUser);/*Email de destino*/
		message.setSubject("Chegou um email enviado com java");/*Assunto do email*/
		message.setText("Olá programador, você acaba de receber um email enviado com o Java do curso formação Java Web do Alex");
		
	
		Transport.send(message);
		
		}catch (Exception e) {
			e.printStackTrace();
		}	
		
	}
	
	
}
