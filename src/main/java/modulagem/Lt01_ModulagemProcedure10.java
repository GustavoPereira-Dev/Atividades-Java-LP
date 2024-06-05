package modulagem;
/*
  Descrição: Receba 2 números reais. Calcule e mostre a diferença desses valores (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure10 {
	public static void main (String args [ ] ) {
		float num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número decimal:  "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número decimal:  "));

		calcularNumerosFlutuantes(num1,num2);
	} 
	
	static void calcularNumerosFlutuantes(float n1, float n2) {
		float soma;
		
		soma = n1 + n2;
		
		JOptionPane.showMessageDialog(null,"O resultado da soma é: " + soma);
	}
}
 