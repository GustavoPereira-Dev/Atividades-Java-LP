package instanciaclasse.eleicao;

class Vota {	 	 
	 int secao;
	 int codCand;
	 int numEleitor;
	 
	 // construtor	 
	 Vota () {	 
		 this(0,0,0);  }	 
	  	 Vota ( int secao, int codigoCandidato, int numeroEleitor)  {	 
	  		 this.secao   = secao;	 
	  		 codCand  = codigoCandidato;
	  		 numEleitor = numeroEleitor;
	 }	
}	

