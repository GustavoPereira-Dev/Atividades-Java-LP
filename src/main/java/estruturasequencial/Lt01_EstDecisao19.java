package estruturasequencial;
/*
  Descrição: Receba 2 valores reais. Calcule e mostre o maior deles
  Data: 27/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstDecisao19 {
	public static void main(String args[]) {
		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		
		if(num1 > num2) {
			JOptionPane.showMessageDialog(null,"O maior número é o primeiro com valor: " + num1);
		} else {
			JOptionPane.showMessageDialog(null,"O maior número é o segundo com valor: " + num2);
		}
		
	}
}
