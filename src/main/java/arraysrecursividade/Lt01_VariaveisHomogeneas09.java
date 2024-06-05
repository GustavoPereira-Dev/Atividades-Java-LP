package arraysrecursividade;
/*
  Descrição: Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. 
  P. ex: VT1| 1| 2| 3| |VT2| 4| 5| 6| |VT3| 1| 2| 3| 4| 5| 6
  Data: 26/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_VariaveisHomogeneas09 {
	public static void main(String args[]) {
		int[] vt = new int[6];
		int i = 0;
		vt = adicionarValores(vt);
		
		for(i = 0; i < 6; i++) {
			JOptionPane.showMessageDialog(null,(i + 1) + "º posição: " + vt[i]); 
		}
		
	}
	
	static int[ ] adicionarValores(int vt[ ]) {
		int i = 0;
		int[] vt2 = new int[3], vt3 = new int[3];
		
		for(i = 0; i < 6; i++) {
			if(i < 3) {
				vt2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º índice"));
			} else {
				vt2[i - 3] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º índice"));
			}
		}
		
		for(i = 0; i < 3; i++) {
			vt[i] = vt2[i];
			vt[i + 3] = vt3[i];
		}
		return vt;
	}
	
}