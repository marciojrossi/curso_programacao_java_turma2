package exercicio_Arrays;


public class Biblioteca 
 {
	Livro livro = new Livro();
	
	public boolean adicionar(Livro livro)
	{
		Livro LivroEncrontrado = buscar(livro.getCodigo());
		if (LivroEncrontrado != null)
     		return false;
        livro[quantidadeLivros++] = livro;
        return true;
	}
	
	public Livro buscar(String codigo)
	{
		for (int i = 0; i < quantidadeLivros; i++)
		{
			Livro livro = livros[i];
			if(codigo.equalsIgnoreCase(livro.getCodigo()))
			  {	
			   return livro;		
			  }	
		}
	}
	
	public Livro remover(String codigo)
	{
		for (int i = 0; i < quantidadeLivros; i++)
		{
			Livro livro = livros[i];
			if(codigo.equalsIgnoreCase(livro.getCodigo()))
			  {	
			   return livro;		
			  }	
		}
	 }
	
	public lista(String codigo)
		{
			for (int i = 0; i < quantidadeLivros; i++)
			{
				Livro livro = livros[i];
				if(codigo.equalsIgnoreCase(livro.getCodigo()))
				  {	
				   return livro;		
				  }	
			}
		}	
 }
    
    
		
	

