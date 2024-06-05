package modulagem;
/*
  Descrição: Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somat�ria dos números ímpares entre esses valores(em função)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemFuncao35 {
	public static void main(String args[]) {
		int num1, num2, indx, res = 0;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		indx = verificarMaior(num1, num2);
		
		while(indx >= num1 || indx >= num2) {
			if(indx % 2 == 1) {
				res = res + indx;
			}
			indx--;
		}
		
		JOptionPane.showMessageDialog(null,"A somat�ria de n�meros �mpares entre os dois é: " + res);
		
	}
	
	static int verificarMaior(int n1, int n2) {
		if(n2 > n1) {
			return n2;
		} else {
			return n1;
		}
	}
}
