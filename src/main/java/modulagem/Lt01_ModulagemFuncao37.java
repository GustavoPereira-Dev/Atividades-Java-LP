package modulagem;
/*
  Descrição: Receba 2 Receba um número inteiro. Calcule e mostre a série de Fibonacci at� o seu Nºésimo termo(em função)
  Data: 12/03/2024
  Programador: Gustavo Henrique
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemFuncao37 {
	public static void main(String args[]) {
		int num, ant1 = 1, ant2 = 0, indx = 1, fib;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para Fibonacci: "));
		
		if(num > 1) {
			do {
				indx++;
				fib = calcFib(ant1,ant2);
				ant2 = ant1;
				ant1 = fib;
			} while(indx < num);	
		} else {
			fib = num;
		}
		
		JOptionPane.showMessageDialog(null,"O resultado a Fibonacci é: " + fib);
			
	}
	
	static int calcFib(int a1, int a2) {
		return a1 + a2;
	}
}
