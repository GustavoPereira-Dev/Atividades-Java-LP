package estruturasequencial;
/*
  Descrição: Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores
  Data: 05/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstRepeticao35 {
	public static void main(String args[]) {
		int num1, num2, indx, res = 0;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		if(num2 > num1) {
			indx = num2;
		} else {
			indx = num1;
		}
		
		while(indx >= num1 || indx >= num2) {
			if(indx % 2 == 1) {
				res = res + indx;
			}
			indx--;
		}
		
		JOptionPane.showMessageDialog(null,"A somatória de números ímpares entre os dois é: " + res);
		
	}
}
