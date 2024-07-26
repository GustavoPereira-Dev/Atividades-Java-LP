package instanciaclasse.extra_biblioteca;

public class Email extends Contato {
	private int codigoEmail;
	private int codigoUsuario;
	private String emailUsuario;
	public Email(int codigoEmail, int codigoUsuario, String emailUsuario) {
		super(codigoEmail, codigoUsuario, emailUsuario);
	}
	
	@Override
	void setContatoUsuario(String contatoUsuario) {
		if(contatoUsuario.indexOf("@") < contatoUsuario.indexOf(".")) {
			this.emailUsuario = contatoUsuario; 
		} else {
			System.out.println("Formatação do email está incorreto!");
		}
		
	}
	
}
