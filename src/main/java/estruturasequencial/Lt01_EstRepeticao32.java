package estruturasequencial;
/*
  Descrição: Receba um número inteiro. Calcule e mostre o seu fatorial
  Data: 05/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstRepeticao32 {
	public static void main(String args[]) {
		int num, i, fat = 0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de fatorial: "));
		
		for(i = num; i > 1; i--) {
			fat *= (num * (num - 1));
		}
		
		JOptionPane.showMessageDialog(null,"O resultado do fatorial " + num + " é: " + fat);
			
	}
}
