package estruturasequencial;
/*
  Descrição: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado
  Data: 20/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq16 {
	public static void main (String args[]) {
		int qntH, dep;
		float vPHr, perc, saBrut, saLiq;
		
		qntH = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas: "));
		vPHr = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor por hora: "));
		perc = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do percentual: "));
		dep = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dependentes: "));
		
		saBrut = qntH * vPHr;
		saLiq = (saBrut - (saBrut * (perc / 100))) + (dep * 100);
		
		JOptionPane.showMessageDialog(null,"O valor do Salário Líquido é " + saLiq);
	}
}
