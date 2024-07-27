package instanciaclasse.extra_biblioteca.model1;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
  //atributos
	private int codigo; 
	private String nome; 
	private String RG;
	private String CPF; 
	private String especializacao; 
	private String sexo; 
	private String estadoCivil; 
	private String nacionalidade; 
	private String escritorio; 
	private List<Email> emails; 
	private List<Telefone> telefones; 
	private List<String> emprestimos;
	public Categoria(int codigo, String nome, String RG, String CPF, String especializacao, String sexo,
			String estadoCivil, String nacionalidade, String escritorio, List<Email> emails, List<Telefone> telefones,
			List<String> emprestimos) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.RG = RG;
		this.CPF = CPF;
		this.especializacao = especializacao;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.nacionalidade = nacionalidade;
		this.escritorio = escritorio;
		this.emails = new ArrayList<>();
		this.telefones = new ArrayList<>();
		this.emprestimos = new ArrayList<>();
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
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(Telefone telefone) {
		this.telefones.add(telefone);
	}
	public List<String> getEmprestimos() {
		return emprestimos;
	}
	public void setEmprestimos(List<String> emprestimos) {
		this.emprestimos = emprestimos;
	}
	
	
	
  

}