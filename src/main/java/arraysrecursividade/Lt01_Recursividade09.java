package arraysrecursividade;

/*
	Descrição: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!(em função recursiva)
	Data: 29/06/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_Recursividade09 {
	public static void main(String args[]) {
		double num;
		num = Double.parseDouble(JOptionPane.showInputDialog("Digite o número para a série (1 / N)! + (1 / N-1)! + (1 / N-2)! + ... + (1 / 1)!: "));
		JOptionPane.showMessageDialog(null,"O resultado da série " + num + " é: " + somarFatoriais(num));
	}
	
	public static double somarFatoriais(double n) {
		double serie = 0;
		
		if(n != 1) {
			serie = (1 / calcFat(n)) + somarFatoriais(n - 1);
			return serie;
		}
		return 1;
	}
	
	public static double calcFat(double n) {
		if(n > 1) {
			return n * calcFat(n - 1);
		}
		return 1;
	}
}