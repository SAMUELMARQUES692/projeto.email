package enviando.email;

public class AppTest {
	
	

	@org.junit.Test
	public void testeEmail() throws Exception {
		
		ObjetoEnviaEmail enviarEmail = 
				new ObjetoEnviaEmail("samuelmarquesjavaweb@gmail.com", 
										"Samuel Rodrigues Marques", 
											"Testando e-mail com java", 
												"Este texto é a descrição do meu e-mail");
		
		enviarEmail.enviarEmail();
		
		
		
		Thread.sleep(5000);
		
	}
	
}
