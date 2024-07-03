package arraysrecursividade;
/*
	Descrição: Criar uma matriz [8][8] onde o programa irá carregar segundo:
	casa   1  2  3  4 ... *Exibir a soma
	valor  1  2  4  8 ... dos valores
	Data: 26/03/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_Recursividade31 {
	public static void main(String args[]) {
		
	}
	
	public static int[][] lerLinhaMatriz(int[][] mt, int i){
		if(i < 0) {
			return mt;
		}
		
		lerLinhaMatriz(mt,i -1);
		lerColunaMatriz(mt,i,2);
		
		return mt;
	}
	
	public static int[][] lerColunaMatriz(int[][] mt, int i, int j){
		if(j < 0) {
			return mt;
		}
		
		lerColunaMatriz(mt,i,j - 1);
		mt[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor na linha e da " + (j + 1) + "º coluna:"));
		return mt;
	}
}
