package exemploteste;



import org.junit.Assert;
import org.junit.Test;

import br.com.dextrainig.monitor.Monitor;

public class monitorteste {

	Monitor monitor;
	@Test
	public void testarcriacaomonitorcomconstrutor(){
		monitor = new Monitor(20,"1","Preta");}
		
	public void testarcriacaomonitor(){
			monitor = new Monitor();
			
		
		System.out.println(monitor);
		Assert.assertNotNull(monitor);
	}


}
