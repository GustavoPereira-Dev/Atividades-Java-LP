package instanciaclasse.extra_biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
  //atributos
	protected int codigo; 
	protected String nome; 
	protected String RG;
	protected String CPF; 
	protected String especializacao; 
	protected String sexo; 
	protected String estadoCivil; 
	protected String nacionalidade; 
	protected String escritorio; 
	protected List<Email> emails; 
	protected List<Telefone> telefones; 
	protected List<Emprestimo> emprestimos;

	public Categoria() {
		this(0,"","","","","","","","", new ArrayList<Email>(),new ArrayList<Telefone>(),new ArrayList<Emprestimo>());
	}
	
	public Categoria(int codigo, String nome, String RG, String CPF, String especializacao, String sexo,
			String estadoCivil, String nacionalidade, String escritorio, List<Email> emails, List<Telefone> telefones,
			List<Emprestimo> emprestimos) {
		this.codigo = codigo;
		this.nome = nome;
		this.RG = RG;
		this.CPF = CPF;
		this.especializacao = especializacao;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.nacionalidade = nacionalidade;
		this.escritorio = escritorio;
		this.emails = emails;
		this.telefones = telefones;
		this.emprestimos = emprestimos;
	}
	
	public Categoria(Categoria categoria) {
		this.codigo = categoria.codigo;
		this.nome = categoria.nome;
		this.RG = categoria.RG;
		this.CPF = categoria.CPF;
		this.especializacao = categoria.especializacao;
		this.sexo = categoria.sexo;
		this.estadoCivil = categoria.estadoCivil;
		this.nacionalidade = categoria.nacionalidade;
		this.escritorio = categoria.escritorio;
		this.emails = categoria.emails;
		this.telefones = categoria.telefones;
		this.emprestimos = categoria.emprestimos;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String RG) {
		this.RG = RG;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getEspecializacao() {
		return especializacao;
	}
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
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
	public String getEscritorio() {
		return escritorio;
	}
	public void setEscritorio(String escritorio) {
		this.escritorio = escritorio;
	}
	public List<Email> getEmails() {
		return emails;
	}
	public void setEmails(Email email) {
		this.emails.add(email);
	}
	
	public void setEmails(List<Email> emails) {
		for(Email e: emails) {
			this.emails.add(new Email(e));
		}
		
	}
	
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(Telefone telefone) {
		this.telefones.add(telefone);
	}
	
	public void setTelefones(List<Telefone> telefones) {
		for(Telefone t: telefones) {
			this.telefones.add(new Telefone(t));
		}
		
	}
	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}
	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

	@Override
	public String toString() {
		return "[codigo=" + codigo + ", nome=" + nome + ", RG=" + RG + ", CPF=" + CPF + ", especializacao="
				+ especializacao + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", nacionalidade="
				+ nacionalidade + ", escritorio=" + escritorio + ", emails=" + emails + ", telefones=" + telefones
				+ ", emprestimos=" + emprestimos + "]";
	}
	
	
	
  

}