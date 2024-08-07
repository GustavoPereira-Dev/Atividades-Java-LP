package instanciaclasse.extra_biblioteca.model;

public class Livro {
	
	private int codigoLivro;
	private String nome;
	private String autor;
	private int codigoBiblioteca;
	private String editora;
	private int anoPublicacao;
	private int quantExemplares;
	private String ISBN;
	
	public Livro() {
		this(0,"","",0,"",0,0,"");
	}
	
	public Livro(int codigoLivro, String nome, String autor, int codigoBiblioteca, String editora, int anoPublicacao, int exemplares,
			String ISBN) {
		this.codigoLivro = codigoLivro;
		this.nome = nome;
		this.autor = autor;
		this.codigoBiblioteca = codigoBiblioteca;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
		this.quantExemplares = exemplares;
		this.ISBN = ISBN;
	}
	
	public Livro(Livro livro) {
		this.codigoLivro = livro.codigoLivro;
		this.nome = livro.nome;
		this.autor = livro.autor;
		this.codigoBiblioteca = livro.codigoBiblioteca;
		this.editora = livro.editora;
		this.anoPublicacao = livro.anoPublicacao;
		this.quantExemplares = livro.quantExemplares;
		this.ISBN = livro.ISBN;
	}
	
	public int getCodigoLivro() {
		return codigoLivro;
	}

	public void setCodigoLivro(int codigoLivro) {
		this.codigoLivro = codigoLivro;
	}

	public int getQuantExemplares() {
		return quantExemplares;
	}

	public void setQuantExemplares(int quantExemplares) {
		this.quantExemplares = quantExemplares;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getCodigoBiblioteca() {
		return codigoBiblioteca;
	}
	public void setCodigoBiblioteca(int codigoBiblioteca) {
		this.codigoBiblioteca = codigoBiblioteca;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public int getExemplares() {
		return quantExemplares;
	}
	public void setExemplares(int exemplares) {
		this.quantExemplares = exemplares;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	@Override
	public String toString() {
		return "Livro [codigoLivro=" + codigoLivro + ", nome=" + nome + ", autor=" + autor + ", codigoBiblioteca="
				+ codigoBiblioteca + ", editora=" + editora + ", anoPublicacao=" + anoPublicacao + ", quantExemplares="
				+ quantExemplares + ", ISBN=" + ISBN + "]";
	}
	
	
}
