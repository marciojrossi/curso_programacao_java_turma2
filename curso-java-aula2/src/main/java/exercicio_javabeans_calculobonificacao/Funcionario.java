package exercicio_javabeans_calculobonificacao;

public class Funcionario {
	
	private String nome;
	private double salario;
    private String cargo;
    private double bonificacao;
    
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if(Validarsalario.validarsalario(salario, this.salario))
		{
		    this.salario = salario;
		}
		else  
		throw new IllegalArgumentException("salario invalido");
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getBonificacao() {
       return bonificacao;
	}
	public void setBonificacao(double bonificacao) {
		if(Validarsalario.validarbonificacao(bonificacao,this.bonificacao))
	      { 
			this.bonificacao = bonificacao;
	      }
		else
		  throw new IllegalArgumentException("bonificação invalido");
	}
    
}
