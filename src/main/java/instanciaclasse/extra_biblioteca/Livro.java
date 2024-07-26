package instanciaclasse.extra_biblioteca;

class Livro {
	
	private String nome;
	private String autor;
	private int codigoBiblioteca;
	private String editora;
	private int anoPublicacao;
	private int quantExemplares;
	private String ISBN;
	
	public Livro(String nome, String autor, int codigoBiblioteca, String editora, int anoPublicacao, int exemplares,
			String iSBN) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.codigoBiblioteca = codigoBiblioteca;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
		this.quantExemplares = exemplares;
		ISBN = iSBN;
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
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	
}
