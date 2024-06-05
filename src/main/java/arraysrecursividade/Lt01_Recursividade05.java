package arraysrecursividade;
/*
  Descrição: Faça a série (N)! + (N-1)! + (N-2)! + ... + (1)! em recursiva
  Data: 19/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_Recursividade05 {
	public static void main(String args[]) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para a série (N)! + (N-1)! + (N-2)! + ... + (1)!: "));
		JOptionPane.showMessageDialog(null,"O resultado da série " + num + " é: " + somarFatoriais(num));
	}
	
	public static int somarFatoriais(int n) {
		int serie = 0;
		
		if(n != 1) {
			serie = calcFat(n) + somarFatoriais(n - 1);
			return serie;
		}
		return 1;
	}
	
	public static int calcFat(int n) {
		if(n > 1) {
			return n * calcFat(n - 1);
		}
		return 1;
	}
}
