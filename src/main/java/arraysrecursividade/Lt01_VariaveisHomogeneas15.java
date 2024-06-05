package arraysrecursividade;
/*
  Descrição: Criar uma matriz [8][8] onde o programa ir� carregar segundo:
  casa 1 2 3 4 ... * Exibir a soma
  valor 1 2 4 8 ...  dos valores
  Data: 26/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_VariaveisHomogeneas15 {
	public static void main(String args[]) {
		
	}
	
	static void adicionarValores() {
		int[][] mat = new int[8][8];
		int i, j, z;
		for(z = 1; z < 5; z++) {
			for(i = (z - 1); i <= (8 - z); i++) {
				for(j = (z - 1); j <= (8 - z); j++) {
					mat[i][j] = z;
				}
			}
		}
		
		for(i = 0; i < 8; i++) {
			for(j = 0; j < 8; j++) {
				JOptionPane.showMessageDialog(null,"O valor da " + (i + 1) + "º linha e da" + (j + 1) + "º coluna é: " + mat[i][j]);
			}
		}
	}
	
}