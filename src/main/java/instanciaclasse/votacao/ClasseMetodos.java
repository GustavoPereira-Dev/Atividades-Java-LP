package instanciaclasse.votacao;

import java.io.IOException;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.Random;

public class ClasseMetodos {
   private static class InstanceHolder {
		public static ClasseMetodos instancia = new ClasseMetodos();
	}
	
	public static ClasseMetodos getInstancia() {
		return InstanceHolder.instancia;
	}
	
   public Votacao2024[] FCadastraVotacao (Votacao2024[] votacao) {
	   int i;
	   Random gerador = new Random();
	   for (i = 0; i < 200; i++) {
		   votacao[i] = new Votacao2024();
	   }
	   
	   for (i = 0; i < 200; i++) {
		   votacao[i].numSec = gerador.nextInt(11) + 0;
		   votacao[i].numCand = gerador.nextInt(300) + 0;
	   }
	   
	   return votacao;
	   
   }
   
   public Votacao2024[] FClassificaSecao (Votacao2024[] votacao) {
	   int[] aux = new int[2];
	   int i,j;
	   
	   for ( i = 0 ; i < votacao.length - 1 ; i++ ){
       	for ( j = i+1 ; j < votacao.length ; j++ ){
       		if ((votacao[i].numSec >= votacao[j].numSec)) {
       			   aux[0] = votacao[i].numSec;
       			   aux[1] = votacao[i].numCand;
       			   
       			   votacao[i].numSec = votacao[j].numSec;
       			   votacao[i].numCand = votacao[j].numCand;
       			
       			   votacao[j].numSec = aux[0];
       			   votacao[j].numCand = aux[1];
               }
           }   
       }
	   
	   System.out.println("dados classificados");
	   return votacao;
   }
   
   public Votacao2024[] FGravaVotacao (Votacao2024[] votacao) throws IOException {
	   
	   int i;

		String fileName = "Votacao2024.txt";	
	    BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));	
	    
	    
	    System.out.println("-------------------------------------------------------------------");
		for (i = 0 ; i < 200 ; i++){
			
			writer.write(Integer.toString(votacao[i].numSec));
			writer.newLine();
			
			writer.write(Integer.toString(votacao[i].numCand));
			writer.newLine();
		}
	   writer.close();
	   System.out.println("arquivo gerado");
	   return votacao;
   }
   
   public void EleitoresPSecao(Votacao2024[] votacao) {
	   int[] vt = new int[11];
	   int i, atual = 0;
	   votacao = FClassificaSecao(votacao);
	   
	   System.out.println("-------------------------------------------------------------------");
	   for(i = 0; i < 200; i++) {
	
		   if(atual != votacao[i].numSec) {
			   System.out.println("Secao " + atual + ": " + vt[atual] + " eleitores");
			   atual = votacao[i].numSec;
		   }
		      
		   vt[atual]++;
		   if(i == 199) System.out.println("Secao " + atual + ": " + vt[atual] + " eleitores");
	   }
	   
   }
   
   public void SecaoMenorEMaiorEleitores(Votacao2024[] votacao) {
	   int[][] vt = new int[2][11];
	   
	   int i, atual = 0;
	   votacao = FClassificaSecao(votacao);
	   for(i = 0; i < 200; i++) {
	
		   if(atual != votacao[i].numSec) {
			   atual = votacao[i].numSec;
		   }
		   vt[0][atual]++;
	   }
	   
	   vt = BubbleSortPorQuantidade(vt[0].length, vt);
	   
	   System.out.println("-------------------------------------------------------------------");
	   System.out.println("Secao com menor numero de Eleitores:  " +  vt[0][0] + " (Secao " + vt[1][0] + ")");
	   System.out.println("Secao com maior numero de Eleitores: " + vt[0][10] + " (Seção " + vt[1][10] + ")");
	   
   }
   
   public void VotosPorCandidato(Votacao2024[] votacao) {
	   int[] vt = new int[301];
	   int i, atual = 0;
	   
	   votacao = OrdenarPorCandidato(votacao);
	   
	   System.out.println("-------------------------------------------------------------------");
	   for(i = 0; i < 200; i++) {
			
		   
		   if(atual != votacao[i].numCand) {	   	   
			   System.out.println("Candidato " + atual + ": " + vt[atual]);
			   
			   if(votacao[i].numCand - atual > 1) {
				   if(votacao[i].numCand - atual == 2) System.out.println("Candidato " + (atual + 1) + ": 0");
				   if(votacao[i].numCand - atual > 2) System.out.println("Candidatos de " + (atual + 1) + " à " + (votacao[i].numCand - 1) + ": 0 votos"); 
			   }
			   
			   atual = votacao[i].numCand;
		   }
		   vt[atual]++;
		   if(i == 199) { 
			   System.out.println("Candidato " + atual + ": " + vt[atual]);
			   if(300 - atual == 1) System.out.println("Candidato " + (atual + 1) + ": 0");
			   if(300 - atual > 1) System.out.println("Candidatos de " + (atual + 1) + " à " + 300 + ": 0 votos"); 
		   }
	   }
	   
   }
   
   
   public void CandidatosMaisVotados(Votacao2024[] votacao) {
	   int[][] vt = new int[2][301];
	   int i,j, atual = 0;
	   
	   votacao = OrdenarPorCandidato(votacao);
	   
	   for(i = 0; i < 200; i++) {
			
		   if(atual != votacao[i].numCand) {  
			   atual = votacao[i].numCand;
		   }
		   vt[0][atual]++;
	   }
	   
	   vt = BubbleSortPorQuantidade(vt[0].length, vt);
	   
	   
	   System.out.println("-------------------------------------------------------------------");
	   for(i = 0; i < 10; i++) {
		   System.out.println((i + 1) + "o candidato com mais votos" + vt[1][i] + "(" + vt[0][i] + " votos)");
	   }
	   
   }
   
   public Votacao2024[] OrdenarPorCandidato(Votacao2024[] votacao) {
	   int[] aux = new int[2];
	   int i,j;		
	   for ( i = 0 ; i < votacao.length - 1 ; i++ ){
	       	for ( j = i+1 ; j < votacao.length ; j++ ){
	       		if (votacao[i].numCand >= votacao[j].numCand) {
	       			aux[0] = votacao[i].numSec;
	       			aux[1] = votacao[i].numCand;
	       			   
	       			votacao[i].numSec = votacao[j].numSec;
	       			votacao[i].numCand = votacao[j].numCand;
	       			
	       			votacao[j].numSec = aux[0];
	       			votacao[j].numCand = aux[1];
	       		}
	       	}   
	  }
	  return votacao;
   }
   
   public int[][] BubbleSortPorQuantidade(int larguraVetor, int[][] vt){
	   int[] aux = new int[2];
	   int i, j;
	   
	   for(i = 0; i < larguraVetor; i++) {
		   vt[1][i] = i;
	   }
	   
	   for ( i = 0 ; i < larguraVetor - 1; i++ ){
	       	for ( j = i+1 ; j < larguraVetor ; j++ ){
	       		if (vt[0][i] <= vt[0][j]) {
	       			   aux[0] = vt[0][i];
	       			   vt[0][i] = vt[0][j];
	       			   vt[0][j] = aux[0];
	       			   
	       			   aux[1] = vt[1][i];
	       			   vt[1][i] = vt[1][j];
	       			   vt[1][j] = aux[1];
	               }
	       	}   
	   }
	   
	   return vt;
   }
   
} 
