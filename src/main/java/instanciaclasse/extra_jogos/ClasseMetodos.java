package instanciaclasse.extra_jogos;

import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;

public class ClasseMetodos {

	public Jogo[] FCadastraJogos(Jogo[] jogo) throws IOException{
		String txt = "Jogos.txt";
		int i;
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(txt));
		for(i = 0; i < jogo.length; i++) {
			jogo[i] = new Jogo();
			jogo[i].nome = JOptionPane.showInputDialog("Digite o nome do jogo: ");
			jogo[i].console = JOptionPane.showInputDialog("Digite o console do jogo: ");
			jogo[i].id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do jogo: "));
			jogo[i].data = Integer.parseInt(JOptionPane.showInputDialog("Digite a data de lançamento da versão: "));
			jogo[i].fornecedor = JOptionPane.showInputDialog("Digite o fornecedor do jogo: ");
			jogo[i].diretor = JOptionPane.showInputDialog("Digite o diretor do jogo: ");
			
			writer.write(jogo[i].nome);
			writer.newLine();
			writer.write(jogo[i].console);
			writer.newLine();
			writer.write(Integer.toString(jogo[i].id));
			writer.newLine();
			writer.write(Integer.toString(jogo[i].data));
			writer.newLine();
			writer.write(jogo[i].fornecedor);
			writer.newLine();
			writer.write(jogo[i].diretor);
			writer.newLine();
		}
		
		writer.close();
		
		return jogo;
	}
	
	public ResumoJogos[] FResumirJogos(ResumoJogos[] rJogos, Jogo[] jogo) throws IOException{
		
		int i;
		
		
		
		String txt = "ResumoJogos.txt";
		ResumoJogos[] aux = new ResumoJogos[jogo.length];
		jogo = FAlinharJogos(jogo);
		int atual = jogo[0].id, cont = 0;
		
		for(i = 0; i < jogo.length; i++) {
			aux[i] = new ResumoJogos();
		}
		
		aux[0].id = atual;
		aux[0].data = jogo[0].data;
		for(i = 0; i < jogo.length; i++) {
			if(atual != jogo[i].id) {
				atual = jogo[i].id;
				cont++;
				aux[cont].id = jogo[i].id;
				aux[cont].data = jogo[i].data;
			}
			
			aux[cont].quant++;
			System.out.println(aux[cont].quant + " " + aux[cont].id);
			
		}
		
		rJogos = new ResumoJogos[cont + 1];
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(txt));
		
		for(i = 0; i <= cont; i++) {
			rJogos[i] = new ResumoJogos();
			rJogos[i] = aux[i];
			
			writer.write(Integer.toString(rJogos[i].id));
			writer.newLine();
			writer.write(Integer.toString(rJogos[i].data));
			writer.newLine();
			writer.write(Integer.toString(rJogos[i].quant));
			writer.newLine();
			
		}
		
		writer.close();
		return rJogos;
	}
	
	public String pesquisaJogo(Jogo[] jogo, int id, int i) {
		String msg = "";
		if(i == jogo.length) {
			return "Jogo não encontrado na lista";
		}
		
		msg = pesquisaJogo(jogo,id, i + 1);
		
		if(jogo[i].id == id) {	
			msg = "Jogo encontrado na lista!";
		}
		
		return msg;
	}
	public Jogo[] FAlinharJogos(Jogo[] jogo) throws IOException{
		int i, j;
		Jogo aux = new Jogo();
		
		for(i = 0; i < jogo.length - 1; i++) {
			for(j = i + 1; j < jogo.length; j++) {
				if(jogo[i].id > jogo[j].id) {
					aux = jogo[i];
					jogo[i] = jogo[j];
					jogo[j] = aux;
				}
			}
		}
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("Jogos2.txt"));
		
		for(i = 0; i < jogo.length; i++) {
			writer.write(jogo[i].nome);
			writer.newLine();
			writer.write(jogo[i].console);
			writer.newLine();
			writer.write(Integer.toString(jogo[i].id));
			writer.newLine();
			writer.write(Integer.toString(jogo[i].data));
			writer.newLine();
			writer.write(jogo[i].fornecedor);
			writer.newLine();
			writer.write(jogo[i].diretor);
			writer.newLine();
		}
		writer.close();
		return jogo;
	}
	
	public void mostrarJogos(Jogo[] jogo) throws IOException{
		String txt = "Jogos.txt";
		BufferedReader ler = new BufferedReader(new FileReader(txt));
		int i;
		
		for(i = 0; i < jogo.length; i++) {
			
			jogo[i].nome = ler.readLine();
			jogo[i].console = ler.readLine(); 
			jogo[i].id = Integer.parseInt(ler.readLine());
			jogo[i].data = Integer.parseInt(ler.readLine());
			jogo[i].fornecedor = ler.readLine();  
			jogo[i].diretor = ler.readLine();
			
			JOptionPane.showMessageDialog(null, "Nome do jogo: " + jogo[i].nome + "; Console: " + jogo[i].console + "; id: " + jogo[i].id 
					+ "; Data de lançamento: " + jogo[i].data + "; Fornecedor: " + jogo[i].fornecedor + "; Diretor" + jogo[i].diretor);
		}
	
	}
	
	public void mostrarResumoJogos(ResumoJogos[] rJogos) throws IOException{
		String txt = "ResumoJogos.txt";
		BufferedReader ler = new BufferedReader(new FileReader(txt));
		int i;
		
		for(i = 0; i < rJogos.length; i++) {
			
			rJogos[i].id = Integer.parseInt(ler.readLine());
			rJogos[i].data = Integer.parseInt(ler.readLine());
			rJogos[i].quant = Integer.parseInt(ler.readLine());
			
			JOptionPane.showMessageDialog(null, "Id do jogo: " + rJogos[i].id + "; Data de lançamento: " + rJogos[i].data + "; quantidade de cópias: " + rJogos[i].quant);
		}
		
		ler.close();
	}

}
