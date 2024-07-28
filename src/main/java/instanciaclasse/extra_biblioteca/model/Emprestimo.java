package instanciaclasse.extra_biblioteca.model;

import java.util.Date;

public class Emprestimo {

	private int codigoEmprestimo;
	private Date dataEmprestimo;
	private Date dataDevolucao;
	private Advogado contratante;
	private Categoria responsavel;
	private double multa;
	private LivroExemplar livro;
	
	public Emprestimo() {
		this(0,new Date(),new Date(),new Advogado(), new Categoria(), 0.0, new LivroExemplar());
	}
	
	public Emprestimo(int codigoEmprestimo, Date dataEmprestimo, Date dataDevolucao, Advogado contratante,
			Categoria responsavel, double multa, LivroExemplar livro) {
		super();
		this.codigoEmprestimo = codigoEmprestimo;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		this.contratante = contratante;
		this.responsavel = responsavel;
		this.multa = multa;
		this.livro = livro;
	}

	public int getCodigoEmprestimo() {
		return codigoEmprestimo;
	}

	public void setCodigoEmprestimo(int codigoEmprestimo) {
		this.codigoEmprestimo = codigoEmprestimo;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Advogado getContratante() {
		return contratante;
	}

	public void setContratante(Advogado contratante) {
		this.contratante = contratante;
	}

	public Categoria getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Categoria responsavel) {
		this.responsavel = responsavel;
	}

	public double getMulta() {
		return multa;
	}

	public void setMulta(double multa) {
		this.multa = multa;
	}

	public LivroExemplar getLivro() {
		return livro;
	}

	public void setLivro(LivroExemplar livro) {
		this.livro = livro;
	}
	
	
	
}
