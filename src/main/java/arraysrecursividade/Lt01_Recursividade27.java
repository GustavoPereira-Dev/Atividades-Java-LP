package arraysrecursividade;
/*
	Descrição: Receba o número da base e do expoente. Calcule e mostre o valor da pot�ncia (em função)
	Data: 01/07/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/

public class Lt01_Recursividade27 {
	public static void main(String args[]) {
		System.out.println(calcPot(3,2));
	}
	
	public static int calcPot(int base, int exp) {
		int pot;
		if(exp == 1) {
			return 0;
		}
		
		pot = (base * base) + calcPot(base, exp - 1);
		return pot;
	}
}
