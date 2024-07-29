package instanciaclasse.extra_biblioteca.model;

abstract class Contato {
	protected int codigoContato;
	protected int codigoUsuario;
	protected String contatoUsuario;
	
	public Contato() {
		this(0,0,"");
	}
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
	@Override
	public String toString() {
		return "Contato [codigoContato=" + codigoContato + ", codigoUsuario=" + codigoUsuario + ", contatoUsuario="
				+ contatoUsuario + "]";
	}
	
	
	
	
	
}
