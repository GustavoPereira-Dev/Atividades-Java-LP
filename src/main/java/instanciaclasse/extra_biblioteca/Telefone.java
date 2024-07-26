package instanciaclasse.extra_biblioteca;

public class Telefone extends Contato {
	private int codigoTelefone;
	private int codigoUsuario;
	private String telefoneUsuario;
	public Telefone(int codigoTelefone, int codigoUsuario, String telefoneUsuario) {
		super(codigoTelefone, codigoUsuario, telefoneUsuario);
	}
	
	@Override
	void setContatoUsuario(String contatoUsuario) {
		if(contatoUsuario.length() > 10 && contatoUsuario.length()  < 14) {
			this.telefoneUsuario = contatoUsuario; 
		} else {
			System.out.println("Formatação do telefone está incorreto!");
		}
		
	}
	
}
