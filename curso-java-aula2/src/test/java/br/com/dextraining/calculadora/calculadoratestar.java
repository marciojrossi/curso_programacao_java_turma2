package br.com.dextraining.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class calculadoratestar {
	
	Calculadora calculadora = new Calculadora();
	@Test
	public void testarSoma(){
		double resultado = calculadora.somar(10, 15);
		Assert.assertEquals(Double.valueOf(25), Double.valueOf(resultado)); 
	}
	
	@Test
	public void testarSubtracao(){
		double resultado = calculadora.subtrair(15, 15);
		Assert.assertEquals(Double.valueOf(0), Double.valueOf(resultado));
	}
	
	@Test
	public void testarDivisao(){
		double resultado = calculadora.dividir(15, 5);
		Assert.assertEquals(Double.valueOf(3), Double.valueOf(resultado));
		
	}
	
	@Test
	public void testarMultiplicacao(){
		double resultado = calculadora.multiplicar(10, 15);
		Assert.assertEquals(Double.valueOf(150), Double.valueOf(resultado));
	}

}
