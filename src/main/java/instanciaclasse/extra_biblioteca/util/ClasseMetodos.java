package instanciaclasse.extra_biblioteca.util;

import java.util.ArrayList;
import java.time.*;
import java.util.Date;
import java.util.List;

import instanciaclasse.extra_biblioteca.model.Advogado;
import instanciaclasse.extra_biblioteca.model.Biblioteca;
import instanciaclasse.extra_biblioteca.model.Categoria;
import instanciaclasse.extra_biblioteca.model.Email;
import instanciaclasse.extra_biblioteca.model.Emprestimo;
import instanciaclasse.extra_biblioteca.model.Livro;
import instanciaclasse.extra_biblioteca.model.LivroExemplar;
import instanciaclasse.extra_biblioteca.model.Telefone;

import java.io.*;
import javax.swing.JOptionPane;

public class ClasseMetodos extends OutputDadosLeitura {
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
	
	public List<LivroExemplar> FLivroExemplar(List<LivroExemplar> livros) throws IOException{
		int quant,i;
		LivroExemplar livro = new LivroExemplar();
		quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de livros exemplares que deseja adicionar: "));
		
		
		for(i = 0; i < quant; i++) {
			livro.setCodigoExemplar(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do exemplar: ")));
			livro.setDataAquisicao(new Date());
			livro.setNumeroSequencial(JOptionPane.showInputDialog("Digite o número sequencial do exemplar: "));
			livro.setContratuante(new Advogado());
			livro.setEstaDisponivel(true);
			livros.add(new LivroExemplar(livro));
		}
		
		String file = "livroExemplar.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		for(LivroExemplar l: livros) {
			String instancia = "{";
			instancia+=l.getCodigoExemplar() + ", ";
			instancia+=l.getDataAquisicao() + ", ";
			instancia+=l.getNumeroSequencial() + ", ";
			instancia+=l.getContratuante().getNome() + ", ";
			instancia+=l.isEstaDisponivel();
			instancia+="}, ";
			writer.write(instancia);
		}
		
		return livros;
	}
	
	public List<Advogado> FAdvogado(List<Advogado> advogados, String categoria) throws IOException {
		
		int quant,i;
		Advogado advogado = new Advogado();
		quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de " + (categoria+"s") + " que deseja adicionar: "));
		
		
		for(i = 0; i < quant; i++) {
			
			advogado.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do " + categoria + ": ")));
			advogado.setNome(JOptionPane.showInputDialog("Digite o nome do advogado: " + categoria + ": " ));
			advogado.setRG(JOptionPane.showInputDialog("Digite o RG do " + categoria + ": "));
			advogado.setCPF(JOptionPane.showInputDialog("Digite o CPF do " + categoria + ": "));
			advogado.setEspecializacao(JOptionPane.showInputDialog("Digite a especialização do " + categoria + ": "));
			advogado.setSexo(JOptionPane.showInputDialog("Digite o sexo do " + categoria + ": "));
			advogado.setEstadoCivil(JOptionPane.showInputDialog("Digite o estado cívil do " + categoria + ": "));
			advogado.setNacionalidade(JOptionPane.showInputDialog("Digite a nacionalidade do " + categoria + ": "));
			advogado.setEscritorio(JOptionPane.showInputDialog("Digite o escritório do " + categoria + ": "));
			advogado.setEmails(FEmail(new ArrayList<Email>()));
			advogado.setTelefones(FTelefone(new ArrayList<Telefone>()));
			//advogado.setEmprestimos(new List<Emprestimo>);
			advogado.setOAB(JOptionPane.showInputDialog("Digite o código OAB do " + categoria + ": "));
			advogados.add(new Advogado(advogado));
		}
		
		String file = categoria + ".txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		for(Advogado a: advogados) {
			String instancia = "{";
			instancia+=a.getCodigo() + ", ";
			instancia+=a.getNome() + ", ";
			instancia+=a.getRG() + ", ";
			instancia+=a.getCPF() + ", ";
			instancia+=a.getEspecializacao() + ",";
			instancia+=a.getEstadoCivil() + ",";
			instancia+=a.getNacionalidade() + ",";
			instancia+=a.getEscritorio() + ", {";
			
			for(Email e: a.getEmails()) {
				instancia+=e.getCodigoContato() + ", " + e.getCodigoUsuario() + e.getContatoUsuario() + "}, ";
			}
			for(Telefone t: a.getTelefones()) {
				instancia+=t.getCodigoContato() + ", " + t.getCodigoUsuario() + t.getContatoUsuario() + "}, ";
			}
		
			instancia+=a.getOAB() + ",";
			instancia+="}, ";
			writer.write(instancia);
		}
		
		return advogados;
	}
	
	public List<Categoria> FSecretaria(List<Categoria> secretarias) throws IOException{
		int quant,i;
		Categoria secretaria = new Categoria();
		quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de secretárias(os) que deseja adicionar: "));
		
		
		for(i = 0; i < quant; i++) {
			
			secretaria.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do secretária: ")));
			secretaria.setNome(JOptionPane.showInputDialog("Digite o nome da secretária(o): " ));
			secretaria.setRG(JOptionPane.showInputDialog("Digite o RG da secretária(o): "));
			secretaria.setCPF(JOptionPane.showInputDialog("Digite o CPF da secretária(o): "));
			secretaria.setEspecializacao(JOptionPane.showInputDialog("Digite a especialização da secretária(o): "));
			secretaria.setSexo(JOptionPane.showInputDialog("Digite o sexo da secretária(o): "));
			secretaria.setEstadoCivil(JOptionPane.showInputDialog("Digite o estado cívil da secretária(o): "));
			secretaria.setNacionalidade(JOptionPane.showInputDialog("Digite a nacionalidade do secretária(o): "));
			secretaria.setEscritorio(JOptionPane.showInputDialog("Digite o escritório do secretária(o): "));
			secretaria.setEmails(FEmail(new ArrayList<Email>()));
			secretaria.setTelefones(FTelefone(new ArrayList<Telefone>()));
			//advogado.setEmprestimos(new List<Emprestimo>);
			
			secretarias.add(new Categoria(secretaria));
		}
		
		String file = "secretaria.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		for(Categoria s: secretarias) {
			String instancia = "{";
			instancia+=s.getCodigo() + ", ";
			instancia+=s.getNome() + ", ";
			instancia+=s.getRG() + ", ";
			instancia+=s.getCPF() + ", ";
			instancia+=s.getEspecializacao() + ",";
			instancia+=s.getEstadoCivil() + ",";
			instancia+=s.getNacionalidade() + ",";
			instancia+=s.getEscritorio() + ", {";
			
			for(Email e: s.getEmails()) {
				instancia+=e.getCodigoContato() + ", " + e.getCodigoUsuario() + e.getContatoUsuario() + "}, ";
			}
			for(Telefone t: s.getTelefones()) {
				instancia+=t.getCodigoContato() + ", " + t.getCodigoUsuario() + t.getContatoUsuario() + "}, ";
			}
		
			instancia+="}, ";
			writer.write(instancia);
		}
		
		return secretarias;
	}
	
	public ArrayList<Email> FEmail(ArrayList<Email> emails){
		int quant,i;
		Email email = new Email();
		quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de email do usuário que deseja adicionar: "));
		for(i = 0; i < quant; i++) {
			email.setCodigoContato(Integer.parseInt(JOptionPane.showInputDialog("Digite a código de email do usuário: ")));
			email.setCodigoUsuario(Integer.parseInt(JOptionPane.showInputDialog("Digite a código do usuário: ")));
			do {
				email.setCodigoContato(Integer.parseInt(JOptionPane.showInputDialog("Digite a email do usuário: ")));
			} while(email.getContatoUsuario() == "");
		}
		
		return emails;
	}
	
	public ArrayList<Telefone> FTelefone(ArrayList<Telefone> telefones){
		int quant,i;
		Telefone telefone = new Telefone();
		quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números de telefone do usuário que deseja adicionar: "));
		for(i = 0; i < quant; i++) {
			telefone.setCodigoContato(Integer.parseInt(JOptionPane.showInputDialog("Digite a código de telefone do usuário: ")));
			telefone.setCodigoUsuario(Integer.parseInt(JOptionPane.showInputDialog("Digite a código do usuário: ")));
			do {
				telefone.setCodigoContato(Integer.parseInt(JOptionPane.showInputDialog("Digite a telefone do usuário: ")));
			} while(telefone.getContatoUsuario() == "");
		}
		
		return telefones;
	}
	
	public List<Emprestimo> FEmprestimo(List<Advogado> advogados, List<Advogado> estagiarios,List<Categoria> secretarias, List<Emprestimo> emprestimo) {
		
		return emprestimo;
	}
}
