package arraysrecursividade;
/*
	Descrição: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99 (em função recursiva)
	Data: 01/07/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/

public class Lt01_Recursividade28 {
	public static void main(String args[]) {
		System.out.println(calcSerie(50,99));
	}
	
	public static float calcSerie(float n1, float n2) {
		float soma;
		if(n1 == 0) {
			return 0;
		}
		soma = (n1 / n2) + calcSerie(n1 - 1, n2 - 2);
		System.out.println(soma);
		return soma;
	}
}
