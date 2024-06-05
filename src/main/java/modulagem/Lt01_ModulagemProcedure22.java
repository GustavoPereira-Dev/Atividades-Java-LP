package modulagem;
/*
  Descrição: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente. (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure22 {
	static int num1, num2;
	public static void main(String args[]) {
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		sequenciaCrescente();
	}
	
	static void sequenciaCrescente() {
		if(num1 > num2) {
			JOptionPane.showMessageDialog(null,"A sequência dos menores números é o segundo(" + num2 + ") e o primeiro (" + num1 + ")");
		} else {
			JOptionPane.showMessageDialog(null,"A sequência dos menores números é o primeiro(" + num1 + ") e o segundo (" + num2 + ")");
		}
	}
		
}
