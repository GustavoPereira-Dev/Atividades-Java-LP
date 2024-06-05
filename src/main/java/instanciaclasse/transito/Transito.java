package instanciaclasse.transito;

class Transito {	 	 
	 int codCid;	 
	 String nomeCid;	 
	 int qtdAcds;	 
		 
	 // construtor	 
	 Transito () {	 
		 this(0 ,"" ,0);  }	 
	  	 Transito ( int codigoCidade, String nomeCidade, int qtdAcidentes)  {	 
	  		 codCid   = codigoCidade;	 
	  		 nomeCid  = nomeCidade;	 
	  		 qtdAcds  = qtdAcidentes;	 
	 }	
}	
