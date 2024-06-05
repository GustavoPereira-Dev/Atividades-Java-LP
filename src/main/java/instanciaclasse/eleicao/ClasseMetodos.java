package instanciaclasse.eleicao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class ClasseMetodos {

	public Eleitor[] FEleitor (Eleitor[] eleitor) throws IOException{
		String[] secoes = {"1", "3", "4", "5", "9", "10"};
		String[] vota1 = {"1","3","4"};
		String[] vota2 = {"5","9","10"};
		int[] quantSecs = {0,0};
		int i;
		for(i = 0; i < 10; i++) {
			eleitor[i] = new Eleitor();
		}
		
		for(i = 0; i < 10; i++) {
			eleitor[i].numEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do eleitor"));
			eleitor[i].nomeEleitor = JOptionPane.showInputDialog("Digite o nome do eleitor");
			eleitor[i].secao = Integer.parseInt(JOptionPane.showInputDialog("Digite a secao do eleitor"));
		
			if(Arrays.asList(secoes).contains(Integer.toString(eleitor[i].secao))) {
				if(Arrays.asList(vota1).contains(Integer.toString(eleitor[i].secao)) && quantSecs[0] < 5) { 
					quantSecs[0]++;
				} else if(Arrays.asList(vota1).contains(Integer.toString(eleitor[i].secao))){
					JOptionPane.showMessageDialog(null, "Essa votação (Vota1) já está cheia!");	
					i--;
				} else if(Arrays.asList(vota2).contains(Integer.toString(eleitor[i].secao)) && quantSecs[1] < 5) { 
					quantSecs[1]++;
				} else {
					JOptionPane.showMessageDialog(null, "Essa votação (Vota2) já está cheia!");	
					i--;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Essa seção não existe!");
				i--;
			}
			
		}
		
		
		String fileName = "Eleitor.txt";	
		BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));	
		    
		    
		System.out.println("-------------------------------------------------------------------");
		for (i = 0 ; i < 10 ; i++){
				
			writer.write(Integer.toString(eleitor[i].numEleitor));
			writer.newLine();
				
			writer.write(eleitor[i].nomeEleitor);
			writer.newLine();
				
			writer.write(Integer.toString(eleitor[i].secao));
			writer.newLine();
		}
		   writer.close();
		   System.out.println("arquivo Eleitor gerado e cadastro feito");
		   return eleitor;
	}
	
	public Vota[] FVota1(Vota[] vota1, Eleitor[] eleitor) throws IOException{
		int i;
		String[] secoesVota1 = {"1","3","4"};
		vota1 = FVota(vota1, eleitor, secoesVota1);
		
		String fileName = "Vota1.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));	
		    
		    
		System.out.println("-------------------------------------------------------------------");
		for (i = 0 ; i < 5 ; i++){
				
			writer.write(Integer.toString(vota1[i].secao));
			writer.newLine();
				
			writer.write(Integer.toString(vota1[i].codCand));
			writer.newLine();
				
			writer.write(Integer.toString(vota1[i].numEleitor));
			writer.newLine();
		}
		   writer.close();
		   System.out.println("arquivo Vota1 gerado e cadastro feito");
		   return vota1;
	}
	
	public Vota[] FVota2(Vota[] vota2, Eleitor[] eleitor) throws IOException{
		int i;
		String[] secoesVota2 = {"5","9","10"};
		vota2 = FVota(vota2, eleitor, secoesVota2);
		
		String fileName = "Vota2.txt";	
		BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));	
		    
		    
		System.out.println("-------------------------------------------------------------------");
		for (i = 0 ; i < 5 ; i++){
				
			writer.write(Integer.toString(vota2[i].secao));
			writer.newLine();
				
			writer.write(Integer.toString(vota2[i].codCand));
			writer.newLine();
				
			writer.write(Integer.toString(vota2[i].numEleitor));
			writer.newLine();
		}
		   writer.close();
		   System.out.println("arquivo Vota1 gerado e cadastro feito");
		   return vota2;
		
	}
	
	public Vota[] FVota(Vota[] vota, Eleitor[] eleitor, String[] tipoVot) throws IOException{
		int i;
		boolean existe = false;
		
		String fileName = "Eleitor.txt";	
		BufferedReader ler = new BufferedReader(new FileReader(fileName));
		for (i = 0 ; i < 10 ; i++)	{
			eleitor[i] = new Eleitor(); 
			eleitor[i].numEleitor = Integer.parseInt(ler.readLine());
			eleitor[i].nomeEleitor = ler.readLine();
			eleitor[i].secao = Integer.parseInt(ler.readLine());
		}

		ler.close();
		
		for (i = 0 ; i < 5 ; i++)	{
			vota[i] = new Vota();  
		}
		
		for(i = 0; i < 5; i++) {
			existe = false;
			vota[i].secao = Integer.parseInt(JOptionPane.showInputDialog("Digite a seção de votação"));
			vota[i].codCand = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do candidato"));
			vota[i].numEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do eleitor"));
			for(Eleitor e: eleitor) {
				// System.out.println((vota[i].secao == e.secao) + " "  + vota[i].numEleitor == e.numEleitor + " "  +  Arrays.asList(tipoVot).contains(Integer.toString(eleitor[i].secao)));
				if(vota[i].secao == e.secao && vota[i].numEleitor == e.numEleitor && Arrays.asList(tipoVot).contains(Integer.toString(vota[i].secao))) {
					existe = true;
				}
			}
			
			if(!existe || vota[i].codCand < 1 || vota[i].codCand > 4) {
				System.out.println("A seção, número de eleitor ou código de candidato não existe para determinado dados no Eleitor");
				i--;
			}
		}
		
		
		return vota;
		
	}
	
	public Vota[] FApura(Vota[] apura) throws IOException {
		int i;
		for (i = 0 ; i < 10 ; i++)	{
			apura[i] = new Vota();  
		}
		
		String txtVota1 = "Vota1.txt";	
		BufferedReader ler1 = new BufferedReader(new FileReader(txtVota1));
		
		String txtVota2 = "Vota2.txt";	
		BufferedReader ler2 = new BufferedReader(new FileReader(txtVota2));
		
		for (i = 0; i < 10; i++) {
			if(i < 5) {
				apura[i].numEleitor = Integer.parseInt(ler1.readLine());
				apura[i].codCand = Integer.parseInt(ler1.readLine());
				apura[i].secao = Integer.parseInt(ler1.readLine());
			} else {
				
				apura[i].numEleitor = Integer.parseInt(ler2.readLine());
				apura[i].codCand = Integer.parseInt(ler2.readLine());
				apura[i].secao = Integer.parseInt(ler2.readLine());
			}	
		}
		ler1.close();
		ler2.close();
		
		
		String fileName = "Apura.txt";	
		BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));	
		    
		System.out.println("-------------------------------------------------------------------");
		for (i = 0 ; i < 10 ; i++){
				
			writer.write(Integer.toString(apura[i].secao));
			writer.newLine();
				
			writer.write(Integer.toString(apura[i].codCand));
			writer.newLine();
				
			writer.write(Integer.toString(apura[i].numEleitor));
			writer.newLine();
		}
		   writer.close();
		   System.out.println("arquivo Apura gerado e cadastro feito");
		   return apura;
		
	}
	
	public void Vencedor(Vota[] apuracao) throws IOException{
		int[][] vt = new int[2][4];
		int[] aux = new int[2];
		String[] vencedor = {"José", "Maria", "Branco", "Nulo"};
		int i, j, atual = 1;
		apuracao = ordenarPorVoto(apuracao);
		
		for(i = 0; i < 10; i++) {
		
			if(atual != apuracao[i].codCand) {  
				atual = apuracao[i].codCand;
			}
			vt[0][atual - 1]++;
		}
		
		for(i = 0; i < 4; i++) {
			vt[1][i] = i;
		}
		
		for ( i = 0 ; i < 4; i++ ){
	       	for ( j = i+1 ; j < 4; j++ ){
	       		if (vt[0][i] > vt[0][j]) {
	       			   aux[0] = vt[0][i];
	       			   vt[0][i] = vt[0][j];
	       			   vt[0][j] = aux[0];
	       			   
	       			   aux[1] = vt[1][i];
	       			   vt[1][i] = vt[1][j];
	       			   vt[1][j] = aux[1];
	               }
	           }   
	   }
		
		System.out.println("O vencedor é: " + vencedor[vt[1][3]] + "(" + vt[0][3] + " votos");
		
	}
	
	public void SegundoColocado(Vota[] apuracao) throws IOException{
		int[][] vt = new int[2][4];
		int[] aux = new int[2];
		String[] vencedor = {"José", "Maria", "Branco", "Nulo"};
		int i, j, atual = 1;
		apuracao = ordenarPorVoto(apuracao);
		
		for(i = 0; i < 10; i++) {
		
			if(atual != apuracao[i].codCand) {  
				atual = apuracao[i].codCand;
			}
			vt[0][atual - 1]++;
		}
		
		for(i = 0; i < 4; i++) {
			vt[1][i] = i;
		}
		
		for ( i = 0 ; i < 4; i++ ){
	       	for ( j = i+1 ; j < 4; j++ ){
	       		if (vt[0][i] > vt[0][j]) {
	       			   aux[0] = vt[0][i];
	       			   vt[0][i] = vt[0][j];
	       			   vt[0][j] = aux[0];
	       			   
	       			   aux[1] = vt[1][i];
	       			   vt[1][i] = vt[1][j];
	       			   vt[1][j] = aux[1];
	               }
	           }   
	   }
		
		System.out.println("O vencedor é: " + vencedor[vt[1][2]] + "(" + vt[0][2] + " votos");
		
	}
	
	public void VotosBranco(Vota[] apuracao) throws IOException {
		int i, quantVotos = 0;
		apuracao = ordenarPorVoto(apuracao);
		
		for(i = 0; i < 10; i++) {
			
			if(apuracao[i].codCand == 3) {  
				quantVotos++;
			} else if(quantVotos > 0 && apuracao[i].codCand != 3) {
				break;
			}
			
		}
		
		System.out.println("A quantidade de votos em Branco é: " +  quantVotos + " votos");
	}
	
	public void VotosNulos(Vota[] apuracao) throws IOException {
		int i, quantVotos = 0;
		apuracao = ordenarPorVoto(apuracao);
		
		for(i = 0; i < 10; i++) {
			
			if(apuracao[i].codCand == 4) {  
				quantVotos++;
			} else if(quantVotos > 0 && apuracao[i].codCand != 4) {
				break;
			}
			
		}
		
		System.out.println("A quantidade de votos Nulos é: " +  quantVotos + " votos");
	}
	
	
	public void MostraEleitores(Eleitor[] eleitores) throws IOException{
		int i;
		
		String fileName = "Eleitor.txt";	
		BufferedReader ler = new BufferedReader(new FileReader(fileName));
		for (i = 0 ; i < 10 ; i++)	{
			eleitores[i] = new Eleitor();  
		}
		
		for (i = 0; i < 10; i++) {
			eleitores[i].numEleitor = Integer.parseInt(ler.readLine());
			eleitores[i].nomeEleitor = ler.readLine();
			eleitores[i].secao = Integer.parseInt(ler.readLine());
		}
		
		for (i = 0; i < 10; i++) {
			System.out.println("Número do eleitor: " + eleitores[i].numEleitor + "; " 
		 + "Nome do eleitor: " + eleitores[i].nomeEleitor + "; " + "Seção do Eleitor: " + eleitores[i].secao + "; ");
		}
		
		ler.close();
	}
	
	public void MostraApuracao(Vota[] apuracao) throws IOException{
		int i;
		
		apuracao = ordenarPorVoto(apuracao);
		
		for(i = 0; i < 10; i++) {
			System.out.println("Seção da votação: " + apuracao[i].secao + "; " 
					 + "código do candidato votado: " + apuracao[i].codCand + "; " + "Número do Eleitor: " + apuracao[i].numEleitor + "; ");
		}
	}
	
	
	public Vota[] ordenarPorVoto(Vota[] apuracao) throws IOException{
		int i, j;
		int[] aux = new int[3];
		
		String fileName = "Apura.txt";	
		BufferedReader ler = new BufferedReader(new FileReader(fileName));
		
		for (i = 0; i < 10; i++) {
			apuracao[i] = new Vota();
			apuracao[i].numEleitor = Integer.parseInt(ler.readLine());
			apuracao[i].codCand = Integer.parseInt(ler.readLine());
			apuracao[i].secao = Integer.parseInt(ler.readLine());
		}
		
		ler.close();  
		for ( i = 0 ; i < apuracao.length - 1 ; i++ ){
		    for ( j = i+1 ; j < apuracao.length ; j++ ){
		    	if ((apuracao[i].codCand > apuracao[j].codCand)) {
		       		aux[0] = apuracao[i].secao;
		       		aux[1] = apuracao[i].codCand;
		       		aux[2] = apuracao[i].numEleitor;
		       			   
		       		apuracao[i].secao = apuracao[j].secao;
		       		apuracao[i].codCand = apuracao[j].codCand;
		       		apuracao[i].numEleitor = apuracao[j].numEleitor;
		       		
		       		apuracao[j].numEleitor = aux[0];
		       		apuracao[j].codCand = aux[1];
		       		apuracao[j].numEleitor = aux[2];
		       			
		        }
		    }   
		}
	

		
		return apuracao;
	}
	
	
	
		
		
		
	
}
