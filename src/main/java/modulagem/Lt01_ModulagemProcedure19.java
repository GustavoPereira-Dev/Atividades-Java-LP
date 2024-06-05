package modulagem;
/*
  Descrição: Receba 2 valores reais. Calcule e mostre o maior deles (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure19 {
	static int num1, num2;
	public static void main(String args[]) {
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		maiorReal();
	}
	
	static void maiorReal() {
		if(num1 > num2) {
			JOptionPane.showMessageDialog(null,"O maior número é o primeiro com valor: " + num1);
		} else {
			JOptionPane.showMessageDialog(null,"O maior número é o segundo com valor: " + num2);
		}
	}
}
