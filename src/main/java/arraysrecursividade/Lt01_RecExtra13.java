package arraysrecursividade;

import javax.swing.JOptionPane;

/*
	Descrição: Calcule e mostre a série 1 ^ 2/4 + 3/9 ^ 4/16 + 5/25 + ... + 15/225 (em função)
	Data: 03/07/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/
public class Lt01_RecExtra13 {
	public static void main(String args[]) {
		double num;
		JOptionPane.showMessageDialog(null, "O resultado é: " + calcSeq(15));
	}
	public static double calcSeq(double n) {
		if(n > 1) {
			return Math.exp(((n + 1) / Math.pow(n + 1, 2)) * Math.log(n / Math.pow(n, 2))) + calcSeq(n - 1);
		}
		return 1;
	}
}
