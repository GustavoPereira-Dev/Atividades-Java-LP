package arraysrecursividade;

/*
	Descrição: Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a diagonal principal terá seus dados carregados no programa segundo
	1
			4
					8	
							16
	Em recursiva
	Data: 01/07/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_RecExtra26 {
	public static void main(String args[]) {
		int[][] mt = new int[4][4];
		mt = lerLinhaMatriz(mt,3,64);
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println(mt[i][j]);
			}
		}
	}
	
	
	public static int[][] lerLinhaMatriz(int[][] mt, int i, int exp){
		if(i < 0) {
			return mt;
		}
			
		lerLinhaMatriz(mt,i -1, exp / 4);
		lerColunaMatriz(mt,i,3, exp);
		
		return mt;
	}
	
	public static int[][] lerColunaMatriz(int[][] mt, int i, int j, int exp){
		if(j < 0) {
			return mt;
		}
		
		lerColunaMatriz(mt,i,j - 1, exp);
		if(i != j) {
			mt[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor na linha e da " + (j + 1) + "º coluna:"));
		} else {
			mt[i][j] = exp;
		}
		
		return mt;
	}
}
