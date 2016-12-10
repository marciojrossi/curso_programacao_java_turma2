package br.com.dextrainig.monitor;

public class Monitor {

	public int brilho;
	public int polegadas;
	public String cor;
	public String numeroSerie;
	public boolean Ligado;
	
	public Monitor() {
		polegadas = 10;
		numeroSerie = "ABC";
		cor = "Preta";
		Ligado = false;
		brilho = 50;
	}
	
	
	public Monitor(int polegadas, String numeroSerie, String cor) {
		this.polegadas = polegadas;
		this.numeroSerie = numeroSerie;
		this.cor = cor;
		this.Ligado = false;
		this.brilho = 50;
		
	}
	public void ligar() {
        System.out.println("ligando...");  
		Ligado = true;
	}
    public void desliga(){
    	System.out.println("Desligando...");
    	Ligado = false;}
         
   public int aumentarBrilho(){
	   if (brilho < 100){
	   brilho++;}
	   return brilho;
   }
   
   public int diminuirBrilho(){
       if (brilho > 0){
	   brilho--;}
       return brilho;}
   
   public int trocarBrilho(int brilho){
	   this.brilho = brilho;
	   return brilho;
   }
}  
