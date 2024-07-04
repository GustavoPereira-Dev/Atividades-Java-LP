package arraysrecursividade;

/*
	Descrição: Calcule e mostre o quadrado dos números entre 10 e 150 (em função recursiva)
	Data: 29/06/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/

public class Lt01_RecExtra01 {
	public static void main(String args[]) {
		System.out.println(calcularQuadrado(150));
			
	}
	
	static String calcularQuadrado(int n) {
		String str = "";
		if(n <= 10) {
			return "";
		}
		
		str = "O quadrado de: " + n + " é: " + (n*n) + "\n" + calcularQuadrado(n - 1);
		return str;	
	}
}