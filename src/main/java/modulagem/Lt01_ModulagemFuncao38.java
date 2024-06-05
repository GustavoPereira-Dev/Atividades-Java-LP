package modulagem;
/*
  Descrição: Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos(em função)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemFuncao38 {
	static int indx = 1;
	static float num = 0, maior = 0, menor = 0;

	public static void main(String args[]) {
		
		
		while(indx < 100) {
			num = Float.parseFloat(JOptionPane.showInputDialog("Digite o número: "));
			
			maior = calcMaior();
			menor = calcMenor();
			
			indx++;
		}
		
		JOptionPane.showMessageDialog(null,"O maior número entre os 100 é " + maior + " e o menor " + menor);
		
	}
	
	static float calcMaior() {
		if(indx == 1) {
			return num;
		} else if(num > maior) {
			return num;
		} else {
			return maior;
		}
	}
	
	static float calcMenor() {
		if(indx == 1) {
			return num;
		} else if(num < menor) {
			return num;
		} else {
			return menor;
		}
	}
}
