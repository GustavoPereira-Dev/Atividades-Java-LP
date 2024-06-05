package estruturasequencial;
/*
  Descrição: Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia
  Data: 20/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq13 {
	public static void main (String args [ ] ) {
		int kg, duracaoDias;
		
		kg = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de quilos: "));
		duracaoDias = (kg * 1000) / 50;
		
		JOptionPane.showMessageDialog(null,"O alimento irá durá " + duracaoDias);
	} 
}
 