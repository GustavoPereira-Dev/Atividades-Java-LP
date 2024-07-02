package modulagem;
/*
  Descrição: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99 (em função)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemFuncao42 {
	public static void main(String args[]) {
		float num1, num2 = 1;
		float res = 0;
		
		for(num1 = 1; num1 <= 50; num1++) {
			res = res + calcSerie(num1,num2);
			num2 = num2 + 2;
		}
		
		JOptionPane.showMessageDialog(null,"O resultado dessa sequência até 50 é: " + res);
		
	}
	
	static float calcSerie(float n1, float n2) {
		return n1 / n2;
	}
}
