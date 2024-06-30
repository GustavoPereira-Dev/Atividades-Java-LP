package arraysrecursividade;
/*
Descrição: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde: Casa: 1 2 3 4 ... 64 Qdte: 1 2 4 8 ... N (em função recursiva)
Data: 29/06/2024
Programador: Gustavo Pereira
Versão: 0.1
*/

public class Lt01_Recursividade12 {
	public static void main(String args[]) {
		System.out.println(calcGraos(64));
		
		
		
	}
	
	static int calcGraos(int i) {
		int gr = 1;
		if(i == 0) {
			return gr;
		}
		
		System.out.println(gr);
		gr = (gr * 2) + calcGraos(i - 1);
		return gr;
	}
}