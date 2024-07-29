package instanciaclasse.extra_biblioteca.model;


import java.util.List;
import java.util.ArrayList;

public class Advogado extends Categoria{
	private String OAB;
	
	public Advogado() {
		this(0,"","","","","","","","", new ArrayList<Email>(), new ArrayList<Telefone>(), new ArrayList<Emprestimo>(),"");
	}
	
	public Advogado(int codigo, String nome, String RG, String CPF, String especializacao, String sexo,
			String estadoCivil, String nacionalidade, String escritorio, List<Email> emails, List<Telefone> telefones,
			List<Emprestimo> emprestimos, String OAB) {
		super(codigo, nome, RG, CPF, especializacao, sexo, estadoCivil, nacionalidade, escritorio, emails, telefones,
				emprestimos);
		this.OAB = OAB;
		
	}
	
	public Advogado(Advogado advogado) {
		super(advogado.codigo, advogado.nome, advogado.RG, advogado.CPF, advogado.especializacao, advogado.sexo, advogado.estadoCivil, advogado.nacionalidade, advogado.escritorio, advogado.emails, advogado.telefones,
				advogado.emprestimos);
		this.OAB = advogado.OAB;
	}

	public String getOAB() {
		return OAB;
	}

	public void setOAB(String OAB) {
		this.OAB = OAB;
	}

	@Override
	public String toString() {
		return "[OAB=" + OAB + ", codigo=" + codigo + ", nome=" + nome + ", RG=" + RG + ", CPF=" + CPF
				+ ", especializacao=" + especializacao + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil
				+ ", nacionalidade=" + nacionalidade + ", escritorio=" + escritorio + ", emails=" + emails
				+ ", telefones=" + telefones + ", emprestimos=" + emprestimos + "]";
	}
	
	
	
	
	
	
	
    
}

