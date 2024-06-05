package arraysrecursividade;
/*
  Descrição: Faça a série (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N)  em recursiva
  Data: 19/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_Recursividade04 {
	public static void main(String args[]) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para a série (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N): "));
		JOptionPane.showMessageDialog(null,"O resultado da série " + num + "é: " + somarNumeros(num, 0));
	}
	
	public static int somarNumeros(int n1, int n2) {
		int serie = 0;
		
		if(n2 != n1) {
			serie = (n1 - n2) / (1 + n2) + somarNumeros(n1, n2 - 1);
			return serie;
		}
		return 1 / n1;
	}
}
