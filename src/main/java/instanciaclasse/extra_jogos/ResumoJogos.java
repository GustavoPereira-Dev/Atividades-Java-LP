package instanciaclasse.extra_jogos;

public class ResumoJogos {

	protected int id;
	protected int data;
	protected int quant;
	
	public ResumoJogos() {
		this(0,0,0);
	}
	public ResumoJogos(int id, int data, int quant) {
		this.id = id;
		this.data = data;
		this.quant = quant;
	}
	
	
}
