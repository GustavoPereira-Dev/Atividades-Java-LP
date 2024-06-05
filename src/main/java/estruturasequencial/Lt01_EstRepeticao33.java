package estruturasequencial;
/*
  Descrição: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N
  Data: 05/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstRepeticao33 {
	public static void main(String args[]) {
		int num, indx = 0;
		float seq = 0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para sequência: "));
		
		while(indx < num) {
			indx++;
			seq = seq + (1 / indx);
		}
		
		JOptionPane.showMessageDialog(null,"O resultado da sequência " + num + " é: " + seq);
	
	}
}
