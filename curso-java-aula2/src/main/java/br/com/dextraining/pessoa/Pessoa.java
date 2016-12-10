package br.com.dextraining.pessoa;

public class Pessoa {
     String nome;
	 String rg;
	 String cpf;
	 
	 public Pessoa(String nome, String rg, String cpf){
		 this.nome = nome;
		 this.cpf = cpf;
		 this.rg = rg;
	 }

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + "]";
	} 
	 
}
