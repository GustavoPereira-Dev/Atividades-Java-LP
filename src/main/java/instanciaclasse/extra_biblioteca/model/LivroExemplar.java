package instanciaclasse.extra_biblioteca.model;

import java.util.Date;

public class LivroExemplar {

	private int codigoExemplar;
	private Date dataAquisicao;
	private String numeroSequencial;
	private double preco;
	private Advogado contratuante;
	private boolean estaDisponivel = true;
	
	public LivroExemplar() {
		this(0,new Date(), "", 0.0, new Advogado(),true);
	}
	
	public LivroExemplar(int codigoExemplar, Date dataAquisicao, String numeroSequencial, double preco,
			Advogado contratuante, boolean estaDisponivel) {
		this.codigoExemplar = codigoExemplar;
		this.dataAquisicao = dataAquisicao;
		this.numeroSequencial = numeroSequencial;
		this.preco = preco;
		this.contratuante = contratuante;
		this.estaDisponivel = estaDisponivel;
	}
	
	public LivroExemplar(LivroExemplar livro) {
		this.codigoExemplar = livro.codigoExemplar;
		this.dataAquisicao = livro.dataAquisicao;
		this.numeroSequencial = livro.numeroSequencial;
		this.preco = livro.preco;
		this.contratuante = livro.contratuante;
		this.estaDisponivel = livro.estaDisponivel;
	}
	
	public int getCodigoExemplar() {
		return codigoExemplar;
	}
	public void setCodigoExemplar(int codigoExemplar) {
		this.codigoExemplar = codigoExemplar;
	}
	public Date getDataAquisicao() {
		return dataAquisicao;
	}
	public void setDataAquisicao(Date dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}
	public String getNumeroSequencial() {
		return numeroSequencial;
	}
	public void setNumeroSequencial(String numeroSequencial) {
		this.numeroSequencial = numeroSequencial;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Advogado getContratuante() {
		return contratuante;
	}
	public void setContratuante(Advogado contratuante) {
		this.contratuante = contratuante;
	}

	public boolean isEstaDisponivel() {
		return estaDisponivel;
	}

	public void setEstaDisponivel(boolean estaDisponivel) {
		this.estaDisponivel = estaDisponivel;
	}

	@Override
	public String toString() {
		return "LivroExemplar [codigoExemplar=" + codigoExemplar + ", dataAquisicao=" + dataAquisicao
				+ ", numeroSequencial=" + numeroSequencial + ", preco=" + preco + ", contratuante=" + contratuante
				+ ", estaDisponivel=" + estaDisponivel + "]";
	}
	
	
}
