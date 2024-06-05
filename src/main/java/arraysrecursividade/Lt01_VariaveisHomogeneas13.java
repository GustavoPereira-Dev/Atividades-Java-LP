package arraysrecursividade;
/*
  Descrição: Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
  Data: 26/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_VariaveisHomogeneas13 {
	public static void main(String args[]) {
		adicionarValores();
	}
	
	static void adicionarValores() {
		int[][] mat = new int[4][4];
		int i, j, exp = 0;
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4; j++) {
				if(i != j) {
					mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor na linha e" + (j + 1) + "º na coluna:"));
				} else {
					exp *= 4;
				}
			}
		}
		
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4; j++) {
				JOptionPane.showMessageDialog(null,"O valor da " + (i + 1) + "º linha e da" + (j + 1) + "º coluna é: " + mat[i][j]);
			}
		}
	}
	
}