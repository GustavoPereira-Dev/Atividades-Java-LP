package instanciaclasse.extra_biblioteca.util;

import java.util.List;


import instanciaclasse.extra_biblioteca.model.*;

public class OutputDadosMemoria {
	public void mostrarBibliotecas(List<Biblioteca> bibliotecas) {
		System.out.println("=============== Bibliotecas  ===============");
		for(Biblioteca b: bibliotecas) {
			System.out.println(b);
		}
		System.out.println("============================================");
	}
	
	public void mostrarLivros(List<Livro> livros) {
		System.out.println("===============    Livros   ===============");
		for(Livro l: livros) {
			System.out.println(l);
		}
		System.out.println("============================================");
	}
	
	public void mostrarLivrosExemplares(List<LivroExemplar> livros) {
		System.out.println("=============== Exemplares  ===============");
		for(LivroExemplar l: livros) {
			System.out.println(l);
		}
		System.out.println("============================================");
	}
	
	public void mostrarAdvogados(List<Advogado> advogados) {
		System.out.println("=============== Advogados  ===============");
		for(Advogado a: advogados) {
			System.out.println(a);
		}
		System.out.println("============================================");
	}
	
	public void mostrarEstagiarios(List<Advogado> estagiarios) {
		System.out.println("=============== Estagiários ===============");
		for(Advogado e: estagiarios) {
			System.out.println(e);
		}
		System.out.println("============================================");
	}
	
	public void mostrarSecretarias(List<Categoria> secretarias) {
		System.out.println("=============== Secretárias ===============");
		for(Categoria s: secretarias) {
			System.out.println(s);
		}
		System.out.println("============================================");
	}
	
	/*		instancia+=b.getCodigoBiblioteca() + ", ";
			instancia+=b.getEndereco() + ", ";
			instancia+=b.getNome() + ", ";
			instancia+=b.getCEP() + ", ";
			instancia+="}, ";
			writer.write(instancia);

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

			String instancia = "{";
			instancia+=l.getCodigoExemplar() + ", ";
			instancia+=l.getDataAquisicao() + ", ";
			instancia+=l.getNumeroSequencial() + ", ";
			instancia+=l.getContratuante().getNome() + ", ";
			instancia+=l.isEstaDisponivel();
			instancia+="}, ";

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



	 * */
	
}
