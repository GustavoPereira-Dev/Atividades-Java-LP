package estruturasequencial;
/*
  Descrição: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor
  Data: 27/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstDecisao26 {
	public static void main(String args[]) {
		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		if(num1 > num2 && num1 % num2 == 0 || num2 > num1 && num2 % num1 == 0) {
			JOptionPane.showMessageDialog(null,"O maior número é múltiplo do menor");
		} else {
			JOptionPane.showMessageDialog(null,"O maior número não é múltiplo do menor: ");
		}
	}
		
}
