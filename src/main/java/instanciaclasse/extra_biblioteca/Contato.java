package instanciaclasse.extra_biblioteca;

abstract class Contato {
	private int codigoContato;
	private int codigoUsuario;
	private String contatoUsuario;
	
	public Contato(int codigoContato, int codigoUsuario, String contatoUsuario) {
		this.codigoContato = codigoContato;
		this.codigoUsuario = codigoUsuario;
		this.contatoUsuario = contatoUsuario;
	}

	public int getCodigoContato() {
		return codigoContato;
	}

	public void setCodigoContato(int codigoContato) {
		this.codigoContato = codigoContato;
	}

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getContatoUsuario() {
		return contatoUsuario;
	}

	abstract void setContatoUsuario(String contatoUsuario);
	
	
	
	
	
}
