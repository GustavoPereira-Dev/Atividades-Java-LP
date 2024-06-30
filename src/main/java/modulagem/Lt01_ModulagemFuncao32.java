package modulagem;
/*
  Descrição: Receba um número inteiro. Calcule e mostre o seu fatorial(em função)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemFuncao32 {
	public static void main(String args[]) {
		int num, i, fat = 0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de fatorial: "));
		
		for(i = num; i > 1; i--) {
			fat = fat + calcFat(num);
		}
		
		JOptionPane.showMessageDialog(null,"O resultado do fatorial " + num + " é: " + fat);
			
	}
	
	static int calcFat(int n) {
		return (n * (n - 1));
	}
}
