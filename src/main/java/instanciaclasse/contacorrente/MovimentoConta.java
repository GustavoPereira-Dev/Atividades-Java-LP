package instanciaclasse.contacorrente;

public class MovimentoConta {
	protected int codConta;
	protected double vlMov;
	protected int tpMov;
	protected int status;
	
	MovimentoConta() {
		this(0,0.0,0,0);
	}

	public MovimentoConta(int codigoConta, double valorMovimento, int tipoMovimento, int status) {
		codConta = codigoConta;
		vlMov = valorMovimento;
		tpMov = tipoMovimento;
		this.status = status;
	}

	
}
