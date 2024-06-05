package instanciaclasse.transito;

import java.io.*;
import javax.swing.JOptionPane;
public class ClasseMetodos {

   // FUN��O RECEBENDO REGISTRO aluno E RETORNANDO TIPO ALUNO[]    
	public Transito[] FCadastraEstatistica(Transito[] transito) throws IOException{
		int i;

		String fileName = "ArquivoAluno.txt";	
	    BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));	
	    for (i = 0 ; i < 5 ; i++)	{
	    	transito[i] = new Transito();  
	    }
	    
	    System.out.println("-------------------------------------------------------------------");
		for (i = 0 ; i < 5 ; i++){
			transito[i].codCid = Integer.parseInt(JOptionPane.showInputDialog("Entre o c�digo da cidade:"));
			writer.write(Integer.toString(transito[i].codCid));
			writer.newLine();
			
			transito[i].nomeCid = JOptionPane.showInputDialog("Entre o nome da cidade:");
			writer.write(transito[i].nomeCid);
			writer.newLine();
			
			transito[i].qtdAcds = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de acidentes da cidade:"));
			writer.write(Integer.toString(transito[i].qtdAcds));
			writer.newLine();
		}
		System.out.println("GRAVA��O FEITA COM SUCESSO ");	
	    writer.close();
		return transito; 
	} 
   
  // PROCEDIMENTO RECEBENDO REGISTRO aluno TIPO ALUNO[]    
  public void PQtdaAcidentes(Transito[] transito) throws IOException{
	  int i;
	  
	  transito = RecebendoDados(transito);
	  
	  System.out.println("-------------------------------------------------------------------");
	  System.out.println("Cidades com quantidade de acidentes entre 100 e 500");
	  for (i = 0 ; i < 5; i++) {
		  if(transito[i].qtdAcds > 100 && transito[i].qtdAcds < 500) {
			  System.out.println("C�digo: " + transito[i].codCid + " Nome: " + transito[i].nomeCid + " Quantidade Acidentes: " + transito[i].qtdAcds);			 
		  }
      }
  }
  
  public void PMaiorMenor(Transito[] transito) throws IOException {
	  int i, j, aux;
	  
	  transito = RecebendoDados(transito);

	  System.out.println("-------------------------------------------------------------------");
	  System.out.println("Cidades com maior e menor quantidade de acidentes");
	  for (i = 0 ; i < transito.length - 1; i++) {
		 for(j = i + 1; j < transito.length; j++) {
			 if(transito[i].qtdAcds > transito[j].qtdAcds) {
				 aux = transito[j].qtdAcds;
				 transito[j].qtdAcds = transito[i].qtdAcds;
				 transito[i].qtdAcds = aux;
			 }
		 }
      }
	  System.out.println("Cidade com maior n�mero de acidentes: ");
	  System.out.println("C�digo: " + transito[0].qtdAcds + " Nome: " + transito[0].qtdAcds + " Quantidade Acidentes: " + transito[0].qtdAcds);
	  System.out.println("Cidade com menor n�mero de acidentes: ");
	  System.out.println("C�digo: " + transito[transito.length - 1].qtdAcds + " Nome: " + transito[transito.length - 1].qtdAcds + " Quantidade Acidentes: " + transito[transito.length - 1].qtdAcds);
	  
  }
  
  public void PacIma(Transito[] transito) throws IOException{
	  int i;
	  float media = 0;
	  
	  transito = RecebendoDados(transito);
	  
	  for (i = 0 ; i < 5; i++) {
		  media += transito[i].qtdAcds;
	  }
	  media /= 10;
	  
	  System.out.println("-------------------------------------------------------------------");
	  System.out.println("Cidades com quantidade de acidentes acima da m�dia (m�dia: " + media + ")");
	  for (i = 0 ; i < 5; i++) {
		  if(transito[i].qtdAcds > media) {
			  System.out.println("C�digo: " + transito[i].codCid + " Nome: " + transito[i].nomeCid + " Quantidade Acidentes: " + transito[i].qtdAcds);
		  }
	  }
  }
  
  public Transito[] RecebendoDados(Transito[] tr) throws IOException{
	  int i;
	  String fileName = "ArquivoAluno.txt";	
	  BufferedReader ler = new BufferedReader(new FileReader( fileName ));
	  for (i = 0 ; i < 5 ; i++)	{
		  tr[i] = new Transito();  
	  }
	  
	  for (i = 0; i < 5; i++) {
		  tr[i].codCid = Integer.parseInt(ler.readLine());
		  tr[i].nomeCid = ler.readLine();
		  tr[i].qtdAcds = Integer.parseInt(ler.readLine());
	  }
	  
	  return tr;
  }
  
} 
