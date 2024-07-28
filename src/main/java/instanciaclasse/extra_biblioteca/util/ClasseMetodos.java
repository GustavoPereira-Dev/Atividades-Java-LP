package instanciaclasse.extra_biblioteca.util;

import java.util.List;

import instanciaclasse.extra_biblioteca.model.Advogado;
import instanciaclasse.extra_biblioteca.model.Biblioteca;
import instanciaclasse.extra_biblioteca.model.Emprestimo;
import instanciaclasse.extra_biblioteca.model.Livro;
import instanciaclasse.extra_biblioteca.model.LivroExemplar;
import instanciaclasse.extra_biblioteca.model.Secretaria;
import java.io.*;
import javax.swing.JOptionPane;

public class ClasseMetodos {
	private static class InstanceHolder {
		public static ClasseMetodos instancia = new ClasseMetodos();
	}
	
	public static ClasseMetodos getInstancia() {
		return InstanceHolder.instancia;
	}
	
	
	public List<Biblioteca> FBiblioteca(List<Biblioteca> bibliotecas) throws IOException {
		int quant,i;
		Biblioteca biblioteca = new Biblioteca();
		quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de bibliotecas que deseja adicionar: "));
		
		
		for(i = 0; i < quant; i++) {
			biblioteca.setCodigoBiblioteca(Integer.parseInt(JOptionPane.showInputDialog("Digite o código da biblioteca: ")));
			biblioteca.setEndereco(JOptionPane.showInputDialog("Digite o endereço da biblioteca: "));
			biblioteca.setNome(JOptionPane.showInputDialog("Digite o nome da biblioteca: "));
			biblioteca.setCEP(JOptionPane.showInputDialog("Digite o CEP da biblioteca: "));
			bibliotecas.add(new Biblioteca(biblioteca));
		}
		
		String file = "biblioteca.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		for(Biblioteca b: bibliotecas) {
			String instancia = "{";
			instancia+=b.getCodigoBiblioteca() + ", ";
			instancia+=b.getEndereco() + ", ";
			instancia+=b.getNome() + ", ";
			instancia+=b.getCEP() + ", ";
			instancia+="}, ";
			writer.write(instancia);
		}
		
		writer.close();
		return bibliotecas;
	}
	
	public List<Livro> FLivro(List<Livro> livros) throws IOException{
		int quant,i;
		Livro livro = new Livro();
		quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de livros que deseja adicionar: "));
		
		
		for(i = 0; i < quant; i++) {
			livro.setCodigoLivro(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do livro: ")));
			livro.setNome(JOptionPane.showInputDialog("Digite o nome do livro: "));
			livro.setAutor(JOptionPane.showInputDialog("Digite o nome do autor do livro: "));
			livro.setCodigoBiblioteca(Integer.parseInt(JOptionPane.showInputDialog("Digite o código da biblioteca do livro: ")));
			livro.setEditora(JOptionPane.showInputDialog("Digite o nome da editora do livro: "));
			livro.setCodigoBiblioteca(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da publicação do livro: ")));
			livro.setQuantExemplares(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de exemplares do livro: ")));
			livro.setISBN(JOptionPane.showInputDialog("Digite o ISBN do livro: "));
			livros.add(new Livro(livro));
		}
		
		String file = "livro.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		for(Livro l: livros) {
			String instancia = "{";
			instancia+=l.getCodigoLivro() + ", ";
			instancia+=l.getNome() + ", ";
			instancia+=l.getAutor() + ", ";
			instancia+=l.getCodigoBiblioteca() + ", ";
			instancia+=l.getEditora() + ", ";
			instancia+=l.getAnoPublicacao() + ", ";
			instancia+=l.getQuantExemplares() + ", ";
			instancia+=l.getISBN() + ", ";
			instancia+="}, ";
			writer.write(instancia);
		}
		
		writer.close();
		return livros;
	}
	
	public List<LivroExemplar> FLivroExemplar(List<LivroExemplar> livros) {
		return livros;
	}
	
	public List<Advogado> FAdvogado(List<Advogado> advogados) {
		return advogados;
	}
	
	public List<Advogado> FEstagiario(List<Advogado> estagiarios) {
		return estagiarios;
	}
	
	public List<Secretaria> FSecretaria(List<Secretaria> secretarias) {
		return secretarias;
	}
	
	public List<Emprestimo> FEmprestimo(List<Emprestimo> emprestimo) {
		return emprestimo;
	}
}
