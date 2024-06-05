package estruturasequencial;
/*
  Descrição: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
  Data: 05/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstRepeticao36 {
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
				fat = fat + (num * num);
			}
			
			seq = seq + (1 / fat);
			fat = 0;
		}
		
		JOptionPane.showMessageDialog(null,"O resultado da sequência de fatorial é: " + seq);

	}
}
