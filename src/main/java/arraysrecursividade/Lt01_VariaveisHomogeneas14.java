package arraysrecursividade;
/*
  Descrição: Criar e carregar uma matriz [4][4] com valores aleat�rios, sendo que a diagonal principal terá seus dados carregados no programa segundo
	1
		4
  			16
  				64
  Data: 26/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_VariaveisHomogeneas14 {
	public static void main(String args[]) {
		
		adicionarValores();
	}
	
	static void adicionarValores() {
		int[][] mat = new int[8][8];
		int i, j, soma = 0;
		for(i = 0; i < 8; i++) {
			for(j = 0; j < 8; j++) {
				if(i == 0 && j == 0) {
					mat[i][j] = 1;
					mat[i + 1][j] = 1;
					soma = 1;
				} else if(j != 0) {
					mat[i][j] = mat[i][j - 1] + 1;
					soma += mat[i + 1][j];
				}
				
			}
			if(i != 6) {
				mat[i + 2][j] = mat[i][j];
				mat[i + 3][j] = mat[i + 1][j];
			} 
		}
		JOptionPane.showMessageDialog(null,"O resultado da soma é: " + soma); 
	}
	
}