package notas_alunos;

import java.util.Scanner;

public class notasaluno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a quantidade de Alunos");
		int quantidadeAlunos = scanner.nextInt();
		Alunos Alunos[] = new Alunos[quantidadeAlunos];
        double notas[] = new double[3];
		for (int indicealunoatual = 0; indicealunoatual < quantidadeAlunos; indicealunoatual++) 
		{
			Alunos[indicealunoatual] = new Alunos();
			System.out.println("Entre com o Alunos");
			scanner.nextLine();
			Alunos[indicealunoatual].nome = scanner.nextLine();

			for (int indicenota = 0; indicenota < 3; indicenota++) 
			{
				System.out.println("Entre Com a nota " + (indicenota + 1)+" : ");
				Alunos[indicealunoatual].notas[indicenota] = scanner.nextInt();

			}
		}
		for (int i = 0; i < quantidadeAlunos; i++) {
			System.out.print("\nAluno : " + Alunos[i].nome);
			for (int ii = 0; ii < 3; ii++) {
				System.out.print("; " + Alunos[i].notas[ii]);
			}

			System.out.print(" - Media " + Alunos[i].Getmedias());
		}
	}
}
