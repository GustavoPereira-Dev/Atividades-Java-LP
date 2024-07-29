package instanciaclasse.extra_biblioteca.model;

public class Biblioteca {
	
	private int codigoBiblioteca;
	private String endereco;
	private String nome;
	private String CEP;
	
	public Biblioteca() {
		this(0,"","","");
	}
	public Biblioteca(int codigoBiblioteca, String endereco, String nome, String CEP) {
		this.codigoBiblioteca = codigoBiblioteca;
		this.endereco = endereco;
		this.nome = nome;
		this.CEP = CEP;
	}
	
	public Biblioteca(Biblioteca biblioteca) {
		this.codigoBiblioteca = biblioteca.codigoBiblioteca;
		this.endereco = biblioteca.endereco;
		this.nome = biblioteca.nome;
		this.CEP = biblioteca.CEP;
	}
	
	public int getCodigoBiblioteca() {
		return codigoBiblioteca;
	}
	public void setCodigoBiblioteca(int codigoBiblioteca) {
		this.codigoBiblioteca = codigoBiblioteca;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	@Override
	public String toString() {
		return "Biblioteca [codigoBiblioteca=" + codigoBiblioteca + ", endereco=" + endereco + ", nome=" + nome
				+ ", CEP=" + CEP + "]";
	}
	
	
}
