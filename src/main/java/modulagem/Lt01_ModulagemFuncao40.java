package modulagem;
/*
  Descrição: Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles (em função)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemFuncao40 {
	static int num1, num2;
	public static void main(String args[]) {
		int indx, indxMod;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		indx = verificarMenor();
		
		
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
	
	static int verificarMenor() {
		if(num2 > num1) {
			return num2;
		} else {
			return num1;
		}
	}
	
}
