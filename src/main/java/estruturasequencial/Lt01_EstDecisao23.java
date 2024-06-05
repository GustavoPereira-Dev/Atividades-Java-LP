package estruturasequencial;
/*
  Descrição: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente
  Data: 27/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstDecisao23 {
	public static void main(String args[]) {
		float num1, num2, num3, num4;
		
		num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da 1º Número: "));
		num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da 2º Número: "));
		num3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da 3º Número: "));
		num4 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da 4º Número: "));
		
		if(num4 > num3) {
			JOptionPane.showMessageDialog(null,"A sequência dos números é assim: " + num1 + " " + num2 + " " + num3 + " " + num4 + " ");
		} else if(num4 > num2 && num4 < num3) {
			JOptionPane.showMessageDialog(null,"A sequência dos números é assim: " + num1 + " " + num2 + " " + num4 + " " + num3 + " ");
		} else if(num4 > num1 && num4 < num2) {
			JOptionPane.showMessageDialog(null,"A sequência dos números é assim: " + num1 + " " + num4 + " " + num2 + " " + num3 + " ");
		} else {
			JOptionPane.showMessageDialog(null,"A sequência dos números é assim: " + num4 + " " + num1 + " " + num2 + " " + num3 + " ");
		}
	
	}
		
}
