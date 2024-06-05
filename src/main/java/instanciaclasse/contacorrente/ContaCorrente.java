package instanciaclasse.contacorrente;

public class ContaCorrente {
	protected int codConta;
	protected String nmeCl;
	protected double sConta;
	protected double lConta;
	protected int tConta;
	
	ContaCorrente() {
		this(0,"",0.0,0.0,0);
	}

	ContaCorrente(int codigoConta, String nomeCliente, double saldoConta, double limiteConta, int tipoConta) {
		codConta = codigoConta;
		nmeCl = nomeCliente;
		sConta = saldoConta;
		lConta = limiteConta;
		tConta = tipoConta;
	}
	
}