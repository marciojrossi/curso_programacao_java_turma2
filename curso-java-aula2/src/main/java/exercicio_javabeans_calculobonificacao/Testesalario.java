package exercicio_javabeans_calculobonificacao;

import org.junit.Assert;
import org.junit.Test;


public class Testesalario {
	Funcionario funcionario = new Funcionario();	
	@Test

	public void testarsalario()
	{
		funcionario.setSalario(1000);
		Assert.assertEquals(Double.valueOf(1000),Double.valueOf(funcionario.getSalario()));						
	}

	@Test(expected=IllegalArgumentException.class)
	public void testarbonificacao()
	{
		funcionario.setSalario(1000);
		funcionario.setSalario(500);
		
	}

	
	
}
