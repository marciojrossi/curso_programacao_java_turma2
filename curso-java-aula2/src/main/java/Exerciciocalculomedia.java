import java.util.Scanner;


public class Exerciciocalculomedia {

	public static void main(String[] args) {
     
	    
	    int v[] = new int[3];
  
		Scanner scanner = new Scanner(System.in);
		
    	  for(int i = 0; i < v.length ; i++){ 
		      System.out.println("Entre com o  valor");
		       v[i] = scanner.nextInt() ;
		  }
		  scanner.close();

	    
	    int total = 0;   
        System.out.println("Media dos Valores':");
	       for(int i = 0; i < v.length; i++){
	           int valor = v[i];
               total += v[i];	 
	           System.out.println("[" + i + "]= "+ valor);
   
	       }
	       System.out.println("Media dos Valores :" +  total/v.length);

	}

}
