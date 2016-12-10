package br.com.dextraining.conta;


public class Conta {
	double valortotal;
	public double sacar(double valor) {
		if ( valor > valortotal) {
		   System.out.println("Valor Superior ao limite !");}
		else{		   
		     valortotal =- valor;
		     System.out.println("Valor Sacado " + valor);
		     }
		    return valor; 
	}
	
	public double Depositar(double valor) {
		if (valor <= 0){
			System.out.println("Valor invalido !");
    		} 
		else
		   valortotal =+ valor;
		 return valor;	
	}

	public void saldo() {
		System.out.println("Seu Saldo e !"+ valortotal );	
			
	}


}
