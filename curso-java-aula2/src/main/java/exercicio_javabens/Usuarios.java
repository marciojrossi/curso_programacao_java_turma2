package exercicio_javabens;


public class Usuarios {

	private String usuario;
	private String email;
	private String senha;
		
	public String getUsuario() 
	{
		return usuario;
	}

	public void setUsuario(String usuario)
	{
		this.usuario = usuario;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getSenha() 
	{
		return senha;
	}

	public void setSenha(String senha) 
	{
		if(!ValidadorSenha.validar(senha))
		{
		   throw new IllegalArgumentException("senha invalida");
		}
		   this.senha = senha;
		
	}

}

