package estruturasequencial;
/*
  Descrição: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
  Data: 27/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstDecisao22 {
	public static void main(String args[]) {
		int num1, num2;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		if(num1 > num2) {
			JOptionPane.showMessageDialog(null,"A sequ�ncia dos menores números é o segundo(" + num2 + ") e o primeiro (" + num1 + ")");
		} else {
			JOptionPane.showMessageDialog(null,"A sequ�ncia dos menores números é o primeiro(" + num1 + ") e o segundo (" + num2 + ")");
		}
		
	}
		
}
