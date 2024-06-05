package estruturasequencial;
/*
  Descrição: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7
  Data: 05/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstRepeticao41 {
	public static void main(String args[]) {
		int num1, num2, pos = 0;
		
		for(num1 = 0; num1 <= 7; num1++) {
			for(num2 = 0; num2 <= 7; num2++) {
				if(num1 + num2 == 7) {
					pos++;
				}
			}
		}
		
		JOptionPane.showMessageDialog(null,"A possibilidade de vezes de dois valores retornarem 7 é: " + pos);
			
	}
}
