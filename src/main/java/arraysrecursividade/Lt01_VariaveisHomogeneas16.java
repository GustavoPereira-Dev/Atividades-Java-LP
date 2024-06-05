package arraysrecursividade;
/*
  Descrição: Fazer uma matriz 8x8 com o seguinte formato:
  1 1 1 1 1 1 1 1
  1 2 2 2 2 2 2 1
  1 2 3 3 3 3 2 1
  1 2 3 4 4 3 2 1
  1 2 3 3 3 3 2 1
  1 2 2 2 2 2 2 1
  1 1 1 1 1 1 1 1
  Data: 26/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_VariaveisHomogeneas16 {
	public static void main(String args[]) {
		adicionarValores();
	}
	
	static void adicionarValores() {
		int[][] mat = new int[8][8];
		int[] quantPec = new int[7];
		int i, j, pec;
		
		for(i = 0; i < 8; i++) {
			for(j = 0; j < 8; j++) {
				mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "� valor na linha e" + (j + 1) + "� na coluna para o tabuleiro:"));
				pec = mat[i][j] - 1;
				if(pec >= 0 || pec < 8) {
					quantPec[pec] += quantPec[pec] + 1;
				}
			} 
		}
		
		for(i = 0; i < 7; i++) {
			JOptionPane.showMessageDialog(null,"O valor de pe�as da se��o " + i + "�: " + quantPec[i]);
		}
	}
	
}