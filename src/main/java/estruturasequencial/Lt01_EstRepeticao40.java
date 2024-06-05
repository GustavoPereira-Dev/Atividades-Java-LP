package estruturasequencial;
/*
  Descrição: Receba 2 n�meros inteiros. Verifique e mostre todos os números primos existentes entre eles
  Data: 05/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstRepeticao40 {
	public static void main(String args[]) {
		int num1, num2, indx, indxMod;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		if(num2 > num1) {
			indx = num2;
		} else {
			indx = num1;
		}
		
		while(indx + 1 > num1 || indx + 1 > num2) {
			for(indxMod = indx - 1;indxMod > 0; indxMod--) {
				if(indxMod == 0) {
					JOptionPane.showMessageDialog(null,indx);
				} else if(indx % indxMod == 0) {
					indxMod = (indx - indx) - 1;
				}
			}
			indx--;
		}
				
	}
}
