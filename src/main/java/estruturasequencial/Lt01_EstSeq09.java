package estruturasequencial;
/*
  Descrição: Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados
  Data: 20/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq09 {
	public static void main (String args [ ] ) {
		int num1, num2, soma;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número inteiro:  "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número inteiro:  "));
		soma = num1 + num2;
				
		JOptionPane.showMessageDialog(null,"O resultado da soma é: " + soma);
	} 
}
 