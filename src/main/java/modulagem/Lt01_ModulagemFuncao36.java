package modulagem;
/*
  Descrição: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!(em função)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemFuncao36 {
	public static void main(String args[]) {
		int num, indx = 0, fat = 0, indxFat;
		float seq = 0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para sequência de fatorial: "));
		
		if(num < 2) {
			fat = 1;
		}
		
		while(indx < num) {
			indx++;
			
			for(indxFat = indx; indxFat > 1; indxFat--) {
				fat = fat + calcFat(num);
			}
			
			seq = seq + calcSeqFat(fat);
			fat = 0;
		}
		
		JOptionPane.showMessageDialog(null,"O resultado da sequência de fatorial é: " + seq);

	}
	
	static int calcFat(int n) {
		return (n * (n - 1));
	}
	
	static float calcSeqFat(int f) {
		return 1 / f;
	}
}
