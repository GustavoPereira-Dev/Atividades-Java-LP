package arraysrecursividade;
/*
	Descrição: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde: Casa: 1 2 3 4 ... 64 Qdte: 1 2 4 8 ... N (em função recursiva)
	Data: 30/06/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/
import java.math.BigInteger;

public class Lt01_RecExtra07 {
	public static void main(String args[]) {
		System.out.println(calcGraos(64));
		
		
		
	}
	
	static BigInteger calcGraos(int i) {
		BigInteger gr = new BigInteger("0");
		if(i == 1) {
			return new BigInteger((i * 2) + "");
		}
		
		gr = calcGraos(i-1).multiply(new BigInteger("2"));
		return gr;
	}
}