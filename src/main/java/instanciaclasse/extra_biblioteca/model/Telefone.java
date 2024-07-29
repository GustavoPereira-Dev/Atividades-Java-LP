package instanciaclasse.extra_biblioteca.model;

public class Telefone extends Contato {
	
	public Telefone() {
		this(0,0,"");
	}
	
	public Telefone(int codigoContato, int codigoUsuario, String telefoneContato) {
		super(codigoContato, codigoUsuario, telefoneContato);
	}
	
	public Telefone(Telefone telefone) {
		super(telefone.codigoContato, telefone.codigoUsuario, telefone.contatoUsuario);
	}
	
	@Override
	void setContatoUsuario(String contatoUsuario) {
		if(contatoUsuario.length() > 10 && contatoUsuario.length()  < 14) {
			this.contatoUsuario = contatoUsuario; 
		} else {
			System.out.println("Formatação do telefone está incorreto!");
			this.contatoUsuario = "";
		}
		
	}
	
}
