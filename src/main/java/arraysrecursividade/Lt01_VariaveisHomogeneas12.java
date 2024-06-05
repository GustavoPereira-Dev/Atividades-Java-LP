package arraysrecursividade;
/*
  Descrição: 
  Data: 26/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_VariaveisHomogeneas12 {
	public static void main(String args[]) {
		adicionarValores();
	}
	
	
	
	public static void adicionarValores() {
		int[][] mat = new int[4][3];
		int i, j, prodMes, prodSem, prodTot = 0;
		
		for(i = 0; i < 3; i++) {
			prodMes = 0;
			for(j = 0; j < 4; j++) {
				mat[j][i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (j + 1) + "º valor na linha e" + (i + 1) + "º na coluna:"));
				prodMes = prodMes + mat[j][i];
			}
			JOptionPane.showMessageDialog(null,"A quantidade de produtos vendidos no mês é: " + prodMes);
			prodTot += prodMes;
		}
		
		for(i = 0; i < 4; i++) {
			prodSem = 0;
			for(j = 0; j < 3; j++) {
				prodSem += mat[j][i];
			}
			JOptionPane.showMessageDialog(null,"A quantidade de produtos vendidos na Semana é: " + prodSem);
		}
		
		JOptionPane.showMessageDialog(null,"A quantidade total de produtos vendidos é: " + prodTot);
	}
}