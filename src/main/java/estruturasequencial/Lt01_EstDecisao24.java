package estruturasequencial;
/*
  Descrição: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3
  Data: 27/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstDecisao24 {
	public static void main(String args[]) {
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
		
		if(num % 2 == 0 && num % 3 == 0) {
			JOptionPane.showMessageDialog(null,"O valor é divisível por 2 e 3: ");
		} else {
			JOptionPane.showMessageDialog(null,"O valor não é divisível por 2 e 3: ");
		}
		
	}
}
