package arraysrecursividade;
/*
  Descrição: Faça a série (1/1) + (1/2) + (1/3) + ....+ (1/N)  em recursiva
  Data: 19/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_Recursividade03 {
	public static void main(String args[]) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para a série (1/1) + (1/2) + (1/3) + ....+ (1/N): "));
		JOptionPane.showMessageDialog(null,"O resultado da série " + num + " é: " + somarNumeros(num));
	}
	
	public static int somarNumeros(int n) {
		int serie = 0;
		
		if(n != 1) {
			serie = 1 / n + somarNumeros(n - 1);
			return serie;
		}
		return 1;
	}
}
