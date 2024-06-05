package modulagem;
/*
  Descrição: Receba um número. Calcule e mostre os resultados da tabuada desse número (em função)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemFuncao34 {
	public static void main(String args[]) {
		int num, indx = 0, mult;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para tabuada: "));
		
		while(indx < 10) {
			indx++;
			mult = calcTab(num,indx);
			JOptionPane.showMessageDialog(null,num + " x " + indx + " = " + mult);
		}
		
	}
	
	static int calcTab(int n, int i){
		return n * i;
	}
}
