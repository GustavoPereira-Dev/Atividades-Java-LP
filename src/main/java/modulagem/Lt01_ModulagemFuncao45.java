package modulagem;
/*
  Descrição: Calcule e mostre a série 1 ^ 2/4 + 3/9 ^ 4/16 + 5/25 + ... + 15/225 (em função)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemFuncao45 {
	static int num1, num2 = 0;
	public static void main(String args[]) {
		
		JOptionPane.showMessageDialog(null,"O resultado dessa sequência até 15 é: " + calcSerieDiv());

	}
	
	static double calcSerieDiv() {
		
		double res = 0;
		for(num1 = 1;num1 <= 15; num1++) {
			res = res + Math.exp(((num2 + 1) / Math.pow(num2, 2)) * Math.log(num1) / Math.pow(num1, 2));
		}
		return res;
		
	}
}
