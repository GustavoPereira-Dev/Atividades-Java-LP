package instanciaclasse.extra_biblioteca.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import instanciaclasse.extra_biblioteca.model.Advogado;
import instanciaclasse.extra_biblioteca.model.Biblioteca;
import instanciaclasse.extra_biblioteca.model.Categoria;
import instanciaclasse.extra_biblioteca.model.Livro;
import instanciaclasse.extra_biblioteca.model.LivroExemplar;
import java.io.*;
public class OutputDadosLeitura extends OutputDadosMemoria {
	
	public void mostrarBibliotecas() throws IOException{
		List<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();
		Biblioteca biblioteca = new Biblioteca();
		BufferedReader ler = new BufferedReader(new FileReader("biblioteca.txt"));
		String info;
		while ((info = ler.readLine()) != null) {
		
			info.replace("{", "");
			info.replace("}", "");
			String[] valores = info.split(", ");
			biblioteca.setCodigoBiblioteca(Integer.parseInt(valores[0]));
			biblioteca.setEndereco(valores[1]);
			biblioteca.setNome(valores[2]);
			biblioteca.setCEP(valores[3]);
			bibliotecas.add(biblioteca);
		}
		
		mostrarBibliotecas(bibliotecas);;
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
}
