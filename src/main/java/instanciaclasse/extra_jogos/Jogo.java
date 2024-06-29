package instanciaclasse.extra_jogos;

public class Jogo {
	protected String nome;
	protected String console;
	protected int id;
	protected int data;
	protected String fornecedor;
	protected String diretor;
	
	public Jogo() {
		this("","",0,0,"","");
	}
	
	public Jogo(String nome, String console, int id, int data, String fornecedor, String diretor) {
		this.nome = nome;
		this.console = console;
		this.id = id;
		this.data = data;
		this.fornecedor = fornecedor;
		this.diretor = diretor;
	}
	
	
	
}
