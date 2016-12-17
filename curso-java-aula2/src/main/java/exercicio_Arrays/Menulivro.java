package exercicio_Arrays;

import java.util.Scanner;



public class Menulivro {
	int valortotal;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca();
		System.out.println("Entre com o Codigo do Livro");
		String codigo = scanner.nextLine();

		int opcao = mostrarMenu(scanner);
		while (opcao != 5) {
			if (opcao == 1) {
		       biblioteca.adicionar(codigo);						
			} else if (opcao == 2) {
				biblioteca.buscar(codigo);
				
			} else if (opcao == 3) {
				biblioteca.remover(codigo);
				
			} else if (opcao == 4) {
				biblioteca.lista(codigo);
				
			} else {
				System.out.println("Opcao invalida!");
			}
			opcao = mostrarMenu(scanner);
		}
		scanner.close();
	}

	private static int mostrarMenu(Scanner scanner) {
		System.out.println("1. Adicionar Livro");
		System.out.println("2. Buscar    Livro");
		System.out.println("3. Remover   Livro");
		System.out.println("4. Listar    Livros");
		System.out.println("5. Sair");
		return scanner.nextInt();}
	


}
