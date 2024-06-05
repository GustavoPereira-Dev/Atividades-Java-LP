package estruturasequencial;
/*
  Descrição: Receba 2 números reais. Calcule e mostre a diferença desses valoress
  Data: 20/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq10 {
	public static void main (String args [ ] ) {
		float num1, num2, soma;
		
		num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do primeiro número decimal:  "));
		num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do primeiro número decimal:  "));
		soma = num1 + num2;
				
		JOptionPane.showMessageDialog(null,"O resultado da soma é: " + soma);
	} 
}
 