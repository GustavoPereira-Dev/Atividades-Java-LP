package estruturasequencial;
/*
  Descrição: Receba o número da base e do expoente. Calcule e mostre o valor da potência
  Data: 05/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstRepeticao44 {
	public static void main(String args[]) {
		int base, exp, indx, pot = 0;
		
		base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base: "));
		exp = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da expoente: "));
		
		for(indx = 2; indx <= exp; indx++) {
			pot = pot + (base * base);
		}
		
		// Ou utilizar o Math.Pow (com n�meros double)
		JOptionPane.showMessageDialog(null,"O resultado dessa potência é: " + pot);
		
	}
}
