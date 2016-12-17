
public class ExemploArrayMultidimensional {

	public static void main(String[] args) {
		int valores[][] = new int[3] [3];
	    int outrosValores[][] = new int[3][3];
	    
	    outrosValores[0][20] = 10;
	    outrosValores[0][20] = 15;
	    
	    valores[0][1] = 10;
	    valores[0][3] = 11;
	    
	    for(int linha = 0; linha <valores.length; linha++){
	    	for(int coluna = 0; coluna <valores.length; coluna++){
	    		System.out.println("[" + linha + "]["+coluna+"]=");
	    		System.out.println(valores[linha] [coluna]);
	    	}
	    } 	
	    	for(int Linha = 0; Linha < outrosValores.length; Linha++){
		    	for(int coluna = 0; coluna < outrosValores.length; coluna++){
		    		System.out.println("[" + Linha + "]["+coluna+"]=");
		    		System.out.println(outrosValores[Linha] [coluna]);
		    	}	    	
	    	}
	    	
	}
}

