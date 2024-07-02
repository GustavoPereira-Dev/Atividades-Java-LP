package arraysrecursividade;

/*
	Descrição: Receba um número inteiro. Calcule e mostre o seu fatorial(em função recursiva)
	Data: 01/07/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_Recursividade25 {
	public static void main(String args[]) {
		double num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do fatorial: "));
		JOptionPane.showMessageDialog(null, "O resultado é: " + calcFat(num));
	}
	public static double calcFat(double n) {
		if(n > 1) {
			return n * calcFat(n - 1);
		}
		return 1;
	}
}
