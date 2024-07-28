package instanciaclasse.extra_biblioteca.model;

public class Email extends Contato {

	public Email(int codigoContato, int codigoUsuario, String contatoUsuario) {
		super(codigoContato, codigoUsuario, contatoUsuario);
	}
	
	@Override
	void setContatoUsuario(String contatoUsuario) {
		if(contatoUsuario.indexOf("@") < contatoUsuario.indexOf(".")) {
			this.contatoUsuario = contatoUsuario; 
		} else {
			System.out.println("Formatação do email está incorreto!");
		}
		
	}
	
}
