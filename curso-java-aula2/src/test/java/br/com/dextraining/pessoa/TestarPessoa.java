package br.com.dextraining.pessoa;

import java.util.Scanner;

public class TestarPessoa {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o Nome :");
		String nome = scanner.nextLine();
		System.out.println("Informe o RG :");
		String rg = scanner.nextLine();
		System.out.println("Informe o CPF :");
		String cpf = scanner.nextLine();
		
		Pessoa pessoa = new Pessoa(nome,rg,cpf);
		System.out.println(pessoa);
		
		scanner.close();
		
	}

}
