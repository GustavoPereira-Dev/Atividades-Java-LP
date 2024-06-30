package arraysrecursividade;

/*
Descrição: Receba 2 Receba um número inteiro. Calcule e mostre a série de Fibonacci at� o seu Nºésimo termo(em função recursiva)
Data: 29/06/2024
Programador: Gustavo Henrique
Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_Recursividade10 {
	public static void main(String args[]) {
		int num, fib;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para Fibonacci: "));
		
		if(num > 1) {
			calcFib(1, 0, num);
		} else {
			fib = num;
		}
		
		System.out.println(calcFib(1, 0, num));
			
	}
	
	static int calcFib(int a1, int a2, int indx) {
		if(indx == 1) {
			return a1 + a2;
		}
		
		return calcFib(a2,(a1 + a2),indx - 1);
	}
}