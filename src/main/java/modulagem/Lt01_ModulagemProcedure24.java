package modulagem;
/*
  Descrição: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3 (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure24 {
	static int num;
	public static void main(String args[]) {
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
		
	}
	
	static void calcularSalario() {
		if(num % 2 == 0 && num % 3 == 0) {
			JOptionPane.showMessageDialog(null,"O valor é divisível por 2 e 3: ");
		} else {
			JOptionPane.showMessageDialog(null,"O valor não é divisível por 2 e 3: ");
		}
	}
}
