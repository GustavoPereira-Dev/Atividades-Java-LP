package arraysrecursividade;
/*
	Descrição: Criar uma matriz [8][8] onde o programa irá carregar segundo:
	casa   1  2  3  4 ... *Exibir a soma
	valor  1  2  4  8 ... dos valores
	Data: 03/07/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_RecExtra27 {
	public static void main(String args[]) {
		long[][] mt = new long[8][8];
		mt = carregarLinhaMatriz(mt,7);
		System.out.println(mt[6][7]);
	}
	
	public static long[][] carregarLinhaMatriz(long[][] mt, int i){
		if(i < 0) {
			return mt;
		}
		
		carregarLinhaMatriz(mt,i -2);
		carregarColunaMatriz(mt,i - 1,7);
		
		return mt;
	}
	
	public static long[][] carregarColunaMatriz(long[][] mt, int i, int j){
		if(j < 0) {
			return mt;
		}
		
		carregarColunaMatriz(mt,i,j - 1);
		
		if(i == 0 && j == 0) {
			mt[i][j] = 1;
			mt[i + 1][ j] = 1;
  		} else if(j != 0) {
			mt[i + 1][ j] = mt[i + 1][j - 1] * 2;
			mt[i][j] = mt[i][j - 1] + mt[i + 1][j];
  		}
  		
		System.out.println(i);
  		if(i != 6) {
			mt[i + 3][0] = mt[i + 1][j] * 2;
			mt[i + 2][0] = mt[i + 3][0];
		}
		return mt;
	}
	
}
