package exemploteste;

import org.junit.Assert;
import org.junit.Test;
public class exemploteste {
	
	@Test
	public void testarSoma(){		
		int valor1 = 10;
		int valor2 = 20;
		int resultado = valor1 + valor2;
		Assert.assertEquals(30, resultado);
	}
    @Test
    public void testarsubtracao(){}
}
