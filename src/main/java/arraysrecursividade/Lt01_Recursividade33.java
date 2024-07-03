package arraysrecursividade;
/*
	Descrição: Carregar códigos das peças em um tabuleiro de xadrez, onde:
	Código	    1		2		3		4		5		6		7
	Peça	   Peão    Torre   Bispo  Cavalo  Rainha   Rei     Vazio
	(Em funções recursivas)
	Data: 02/07/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_Recursividade33 {
	public static void main(String args[]) {
		int[][] mt = new int[8][8];
		int [] quantPec = new int[7];
		mt = lerLinhaMatriz(mt, 7);
		quantPec = lerLinhaPecas(mt, quantPec, 7);
		
		for(int i = 0; i < 7; i++) {
			JOptionPane.showMessageDialog(null,"O valor de peças da seção " + (i + 1) + "é: " + quantPec[i]);
		}
		
		
		
	}
	
	public static int[] lerLinhaPecas(int[][] mt, int[] quantPec, int i){
		if(i < 0) {
			return quantPec;
		}
		
		lerLinhaPecas(mt,quantPec,i -1);
		lerColunaPecas(mt,quantPec,i,7);
		
		return quantPec;
	}
	
	public static int[] lerColunaPecas(int[][] mt, int[] quantPec, int i, int j){
		int pec;
		if(j < 0) {
			return quantPec;
		}
		
		lerColunaPecas(mt,quantPec,i,j - 1);
		pec = mt[i][j] - 1;
		if(pec >= 0 && pec < 7) {
			quantPec[pec] += 1;
		}
		return quantPec;
	}
	
	
	public static int[][] lerLinhaMatriz(int[][] mt, int i){
		if(i < 0) {
			return mt;
		}
		
		lerLinhaMatriz(mt,i -1);
		lerColunaMatriz(mt,i,7);
		
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
