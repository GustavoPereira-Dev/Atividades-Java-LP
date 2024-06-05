package modulagem;
/*
  Descrição: Receba o n�mero da base e do expoente. Calcule e mostre o valor da pot�ncia (em função)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemFuncao44 {
	public static void main(String args[]) {
		int base, exp, pot;
		
		base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base: "));
		exp = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da expoente: "));
		
		pot = calcularPotencia(base, exp);
		
		// Ou utilizar o Math.Pow (com n�meros double)
		JOptionPane.showMessageDialog(null,"O resultado dessa pot�ncia é: " + pot);
		
	}
	
	static int calcularPotencia(int b, int e) {
		int p = 0;
		int indx;
		for(indx = 2; indx <= e; indx++) {
			p = p + (b * b);
		}
		return p;
	}
	
}
