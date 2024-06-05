package estruturasequencial;
/*
  Descrição: Receba 100 n�meros inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos
  Data: 05/03/2024
  Programador: Gustavo Henrique
  Vers�o: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstRepeticao38 {
	public static void main(String args[]) {
		int indx = 1;
		float num, maior = 0, menor = 0;
		
		while(indx < 100) {
			num = Float.parseFloat(JOptionPane.showInputDialog("Digite o número: "));
			if(num >= 0) {
				if(indx == 1) {
					maior = num;
					menor = num;
				} else if(num > maior) {
					maior = num;
				} else if(num < menor) {
					menor = num;
				}
				indx++;
			}
			
			
		}
		
		JOptionPane.showMessageDialog(null,"O maior número entre os 100 é" + maior + " e o menor " + menor);
		
	}
}
