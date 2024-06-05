package modulagem;
/*
  Descrição: Receba os 2 n�meros inteiros. Calcule e mostre a soma dos quadrados (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure09 {
	public static void main (String args [ ] ) {
		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número inteiro:  "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número inteiro:  "));

		calcularQuadrados(num1,num2);
	} 
	
	static void calcularQuadrados(int n1, int n2) {
		int soma;
		
		soma = n1 + n2;
		
		JOptionPane.showMessageDialog(null,"O resultado da soma é: " + soma);
	}
}
 