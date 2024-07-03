package arraysrecursividade;
/*
  Descrição: Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
  1  1  1  1  1  1  1  1 
  1  2  2  2  2  2  2  1
  1  2  3  3  3  3  2  1
  1  2  3  4  4  3  2  1
  1  2  3  4  4  3  2  1
  1  2  3  3  3  3  2  1
  1  2  2  2  2  2  2  1
  1  1  1  1  1  1  1  1 
  Data: 26/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_VariaveisHomogeneas15 {
	public static void main(String args[]) {
		adicionarValores();
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
				System.out.println("O valor da " + (i + 1) + "º linha e da" + (j + 1) + "º coluna é: " + mat[i][j]);
			}
		}
	}
	
}