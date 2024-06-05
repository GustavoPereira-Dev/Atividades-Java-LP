package estruturasequencial;
/*
  Descrição: Receba 2 Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu Nºésimo termo
  Data: 05/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstRepeticao37 {
	public static void main(String args[]) {
		int num, ant1 = 0, ant2 = 0, indx = 0, fib;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para Fibonacci: "));
		
		if(num > 1) {
			do {
				indx++;
				fib = ant1 + ant2;
				ant2 = ant1;
				ant1 = fib;
			} while(indx < num);	
		} else {
			fib = num;
		}
		
		JOptionPane.showMessageDialog(null,"O resultado da Fibonacci é: " + fib);
			
	}
}
