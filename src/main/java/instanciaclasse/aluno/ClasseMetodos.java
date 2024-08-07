package instanciaclasse.aluno;

import java.io.*;
import javax.swing.JOptionPane;

public class ClasseMetodos {  
	private static class InstanceHolder {
		public static ClasseMetodos instancia = new ClasseMetodos();
	}
	
	public static ClasseMetodos getInstancia() {
		return InstanceHolder.instancia;
	}
	
	public Aluno[] FCadastra(Aluno[] aluno) throws IOException{
		int i;
		
		String fileName = "ArquivoAluno.txt";	
	    
	    for (i = 0 ; i < 3 ; i++)	{
	    	aluno[i] = new Aluno();  
	    }
	    
	    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));	
		for (i = 0 ; i < 3 ; i++){
			aluno[i].pnome = JOptionPane.showInputDialog("Entre o nome do aluno:");	
	        writer.write( aluno[i].pnome );  	
	        writer.newLine();	
	        aluno[i].snome = JOptionPane.showInputDialog("Entre o sobrenome do aluno:");	
	        writer.write( aluno[i].snome);  	
	        writer.newLine();	
	        aluno[i].pontos = Integer.parseInt(JOptionPane.showInputDialog("Pontos da Graduação do aluno:"));	
	        writer.write(Integer.toString(aluno[i].pontos));   	
	        writer.newLine();  
	        
		}
		writer.close();
		System.out.println("GRAVAÇÃO FEITA COM SUCESSO ");	
	    

		return aluno; 
	} 
   
  // PROCEDIMENTO RECEBENDO REGISTRO aluno TIPO ALUNO[]    
  public void FConsulta(Aluno[] aluno) throws IOException{
	  int i;
	  String fileName = "ArquivoAluno.txt";	
	  	
	  for (i = 0 ; i < 3 ; i++)	aluno[i] = new Aluno();
	  
	  BufferedReader ler = new BufferedReader(new FileReader(fileName));
	  for (i = 0 ; i < 3 ; i++)   {	
		  aluno[i].pnome = ler.readLine();  	
		  aluno[i].snome = ler.readLine();	
		  aluno[i].pontos = Integer.parseInt(ler.readLine());	
	  }	
	  
	  for (i = 0 ; i < 3; i++) {
		  System.out.println(aluno[i].pnome + " " + aluno[i].snome + " pontos: " + aluno[i].pontos);
      }
	  ler.close();;
	  
  }             

} 
