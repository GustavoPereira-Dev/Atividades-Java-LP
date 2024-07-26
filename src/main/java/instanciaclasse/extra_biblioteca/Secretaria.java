package instanciaclasse.extra_biblioteca;

import java.util.List;

public class Secretaria {

	private String nome;
	private String cpf;
	private String rg;
	private String escritorio;
	private char sexo;
	private String estadoCivil;
	private String nacionalidade;
	private List<Livro> livros;
	private List<Telefone> telefones;
	private List<Email> emails;
	
	public Secretaria(String nome, String cpf, String rg, String escritorio, char sexo, String estadoCivil,
			String nacionalidade) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.escritorio = escritorio;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.nacionalidade = nacionalidade;
		this.livros = livros;
		this.telefones = telefones;
		this.emails = emails;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEscritorio() {
		return this.escritorio;
	}
	public void setEscritorio(String especializacao) {
		this.escritorio = especializacao;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	public List<Email> getEmails() {
		return emails;
	}
	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}
	
	
	
	
}
