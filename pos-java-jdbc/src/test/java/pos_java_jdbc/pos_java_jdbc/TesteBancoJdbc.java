package pos_java_jdbc.pos_java_jdbc;

import org.junit.jupiter.api.Test;

import dao.UserPosDAO;
import model.Userposjava;

public class TesteBancoJdbc{
	
	@Test
	public void initBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(5L);
		userposjava.setNome("Matheus Carvalho");
		userposjava.setEmail("matheuscarvalho@gmail.com");
		
		
		userPosDAO.salvar(userposjava);
	}

}
