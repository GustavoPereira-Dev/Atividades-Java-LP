package modulagem;
/*
  Descrição: Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure13 {
	public static void main (String args [ ] ) {
		int kg;
		
		kg = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de quilos: "));
		
		calcularDuracao(kg);
	} 
	
	static void calcularDuracao( int kg) {
		int duracaoDias;
		
		duracaoDias = (kg * 1000) / 50;
		
		JOptionPane.showMessageDialog(null,"O alimento irá durá " + duracaoDias);
	}



}
 