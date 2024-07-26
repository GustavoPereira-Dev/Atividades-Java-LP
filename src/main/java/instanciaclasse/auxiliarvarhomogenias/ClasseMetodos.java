package instanciaclasse.auxiliarvarhomogenias;

import javax.swing.JOptionPane;

import java.util.Random;
public class ClasseMetodos {
	private static class InstanceHolder {
		public static ClasseMetodos instancia = new ClasseMetodos();
	}
	
	public static ClasseMetodos getInstancia() {
		return InstanceHolder.instancia;
	}
	
	public int[] CarregaVetor(int vt[ ]){
		int cta;
                    
		for(cta = 0; cta < 4; cta++){
			vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
		}
		return vt;
	}

	public int[] ClassificaVetor(int vt[ ])  {
		int i,j, aux;
        for(i = 0; i < vt.length - 1; i++){
        	for(j = i+1; j < vt.length; j++){
        		if ((vt[i] > vt[j])) {
        			aux = vt[i];
                    vt[i] = vt[j];
                    vt[j] = aux; 
                }
            }   
        }

      return vt;   
   }

  public void MostraVetor(int vt[ ]){
	  int cta;
      for(cta = 0; cta < 4; cta++ ){
    	  System.out.println ("Vet[" + cta + "] = " +vt[cta]); 
	  }
      System.out.println ("******************************");
  } 
  
  public int[ ][ ] CarregaMatriz(int mt[ ][ ]){
	  Random gerador = new Random();
	  int i, j;
      for(i = 0; i < mt.length; i++){
    	  for(j = 0; j < mt[i].length; j++ ){
    		     mt[i][j] = gerador.nextInt();
    	  } 
	  }
      return mt;
  }

  public int[ ][ ] ClassificaMatriz(int mt[ ][ ])  {
	  int i,j, n1, n2, cont = 0;
	  n1 = mt.length;
	  n2 = mt[0].length;
	  int[] vt = new int[n1 * n2];
	  
	  
	  
      for(i = 0; i < mt.length; i++){
    	  for(j = 0; j < mt[i].length; j++ ){
    		     vt[cont] = mt[i][j];  
    		     cont+=1;
    	  } 
	  }
      vt = ClassificaVetor(vt);
      cont = 0;
      for( i = 0; i < mt.length; i++ ){
    	  for( j = 0; j < mt[i].length; j++ ){
    		     mt[i][j] = vt[cont];  
    		     cont+=1;
    	  } 
	  }
      
      
	  
      return mt;   
  }

  public void MostraMatriz(int mt[ ][ ]){
	  int i, j;
      for(i = 0 ; i < mt.length; i++ ){
    	  for(j = 0 ; j < mt[i].length; j++ ){
    		     System.out.println ("Mt[" + i + "] [" + j + "]  = " +mt[i][j]); 
    	  } 
	  }
      System.out.println ("******************************");
  } 

  

}
