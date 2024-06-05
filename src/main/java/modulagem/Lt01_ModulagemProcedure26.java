package modulagem;
/*
  Descrição: Receba 2 números inteiros. Verifique e mostre se o maior n�mero é múltiplo do menor (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure26 {
	static int num1, num2;
	
	public static void main(String args[]) {
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		maiorMultiplo();
	}
	
	static void maiorMultiplo() {
		if(num1 > num2 && num1 % num2 == 0 || num2 > num1 && num2 % num1 == 0) {
			JOptionPane.showMessageDialog(null,"O maior número é múltiplo do menor");
		} else {
			JOptionPane.showMessageDialog(null,"O maior número não é múltiplo do menor: ");
		}
	}
		
}
