package notas_alunos;

public class Alunos {
    String nome;
    double notas[];
     
     public Alunos(){
    	  //this.nome = nome;
          this.notas = new double [3];
     }
	  public double Getmedias(){
		  double total = 0;
		  for (int ii = 0; ii < notas.length; ii++){
	           total += notas[ii];}
	      
		  return(total/notas.length);
	  }   
	    public void setNome(String nome)
	    {
	    	this.nome = nome;
	    }
		public String getNome()
		{
			return nome;
		}
        public void setNotas(double[] getNotas)
        {
        	if (notas.length != 3)
        	   {
        		System.out.println("Não foram lançadas todas as notas");
        	   }
        	this.notas = notas;
        }
	}


