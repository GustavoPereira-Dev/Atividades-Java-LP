package instanciaclasse.extra_biblioteca.model;

public class Telefone extends Contato {
	public Telefone(int codigoContato, int codigoUsuario, String telefoneContato) {
		super(codigoContato, codigoUsuario, telefoneContato);
	}
	
	@Override
	void setContatoUsuario(String contatoUsuario) {
		if(contatoUsuario.length() > 10 && contatoUsuario.length()  < 14) {
			this.contatoUsuario = contatoUsuario; 
		} else {
			System.out.println("Formatação do telefone está incorreto!");
		}
		
	}
	
}
