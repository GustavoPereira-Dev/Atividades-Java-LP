package instanciaclasse.eleicao;

class Eleitor {	 	 
	 int numEleitor;
	 String nomeEleitor;
	 int secao;
		 
	 // construtor	 
	 Eleitor () {	 
		 this(0,"",0);  
	 }	 
	 Eleitor ( int numeroEleitor, String nomeEleitor, int secao)  {	 
		 	numEleitor = numeroEleitor;	 
	  		this.nomeEleitor = nomeEleitor;
	  		this.secao = secao;
	 }	
}	
