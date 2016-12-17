package exercicio_javabeans_calculobonificacao;

public class Validarsalario {
	public static boolean validarsalario(double salario, double salarioant)
	{
		if (salario >= salarioant)
		{
		  return true;
		}
		return false;
	}

	public static boolean validarbonificacao(double bonificacao, double bonificacaoant)
	{
		if (bonificacao >= bonificacaoant)
		{
		  return true;
		}
		return false;
	}
	
}
