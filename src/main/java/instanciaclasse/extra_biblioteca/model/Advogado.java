package instanciaclasse.extra_biblioteca.model;


import java.util.List;
import java.util.ArrayList;

public class Advogado extends Categoria{
	String OAB;
	
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
	
	
	
	
	
	
	
	
	
    
}

