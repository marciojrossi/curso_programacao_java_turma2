package exercicio_javabens;

import org.junit.Assert;
import org.junit.Test;


public class CriarUsuarioTest {

	@Test(expected = IllegalArgumentException.class)
	public void testarComSenhaValida()
	{
		String SenhaValida = "1aaaa";
		String SenhaInvalida = "aaaaa";
		
		Usuarios usuario = new Usuarios();
		usuario.setUsuario("Nometeste");
		usuario.setEmail("email.com.br");
		usuario.setSenha(SenhaValida);
		usuario.setSenha(SenhaInvalida);
		
		Assert.assertEquals(SenhaValida,  usuario.getSenha());
		
	}

		
	
	}


