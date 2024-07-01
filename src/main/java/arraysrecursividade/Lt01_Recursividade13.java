package arraysrecursividade;

/*
	Descrição: Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles (em função recursiva)
	Data: 30/06/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/

public class Lt01_Recursividade13 {
	static int num1, num2;
	public static void main(String args[]) {
		int num = 100;
		
		System.out.println(numerosImparesAte100(num));
				
	}
	
	public static String numerosImparesAte100(int n) {
		String str = "";
		if(n == 0) {
			return "";
		}
		
		str = numerosImparesAte100(n - 1);
		if(n % 2 == 1) {
			str += n + "\n";
		}
		return str;
		
		
	}
	
}