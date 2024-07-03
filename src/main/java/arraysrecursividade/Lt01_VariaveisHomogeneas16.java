package arraysrecursividade;
/*
	Descrição: Carregar códigos das peças em um tabuleiro de xadrez, onde:
	Código	    1		2		3		4		5		6		7
	Peça	   Peão    Torre   Bispo  Cavalo  Rainha   Rei     Vazio
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
				mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor na linha e" + (j + 1) + "º na coluna para o tabuleiro:"));
				pec = mat[i][j] - 1;
				if(pec >= 0 && pec < 7) {
					quantPec[pec] += 1;
				}
			} 
		}
		
		for(i = 0; i < 7; i++) {
			JOptionPane.showMessageDialog(null,"O valor de peças da seção " + (i + 1) + "é: " + quantPec[i]);
		}
	}
	
}