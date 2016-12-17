package arrays;

public class exemploarray {

	public static void main(String[] args) {
       int tamanho = 5;
		int valores[] = new int[5];
       int outrosValores[] = {1, 2, 3, 4, 5};
       String nomes[] = new String[tamanho];
       System.out.println("conteudo de 'valores':");
       for(int i = 0; i < tamanho; i++){
           int valor = valores[i];
    	   System.out.println("[" + i + "]= "+ valor);
    	   }
       System.out.println("conteudo de 'outros valores':");
       for(int i = 0; i < tamanho; i++){
           int valor = valores[i];
    	   System.out.println("[" + i + "]= "+ outrosValores[i]);
    	   }   
	}

	}


