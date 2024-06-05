package estruturasequencial;
/*
  Descrição: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor
  Data: 27/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstDecisao18 {
	public static void main(String args[]) {
		int num1, num2, dValor;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		if(num1 > num2) {
			dValor = num1 - num2;
		} else {
			dValor = num2 - num1;
		}
		
		JOptionPane.showMessageDialog(null,"A diferença entre os 2 números: " + dValor);
	}
}
