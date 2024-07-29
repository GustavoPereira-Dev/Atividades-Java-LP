package instanciaclasse.extra_biblioteca.model;


public class Email extends Contato {

	public Email() {
		this(0,0,"");
	}
	
	public Email(int codigoContato, int codigoUsuario, String contatoUsuario) {
		super(codigoContato, codigoUsuario, contatoUsuario);
	}
	
	public Email(Email email) {
		super(email.codigoContato, email.codigoUsuario, email.contatoUsuario);
	}
	
	@Override
	void setContatoUsuario(String contatoUsuario) {
		if(contatoUsuario.indexOf("@") < contatoUsuario.indexOf(".")) {
			this.contatoUsuario = contatoUsuario; 
		} else {
			System.out.println("Formatação do email está incorreto!");
			this.contatoUsuario = "";
		}
		
	}
	
}
