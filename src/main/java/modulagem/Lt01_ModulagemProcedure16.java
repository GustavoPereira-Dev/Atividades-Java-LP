package modulagem;
/*
  Descrição: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versâo: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure16 {
	public static void main (String args[]) {
		int qntH, dep;
		float vPHr, perc;
		
		qntH = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas: "));
		vPHr = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor por hora: "));
		perc = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do percentual: "));
		dep = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dependentes: "));
		
		calcularSalarioLiquido(qntH,vPHr, perc, dep);
	}
	
	static void calcularSalarioLiquido(int qth, float vphr, float p, int dep) {
		float saBrut, saLiq;
		
		saBrut = qth * vphr;
		saLiq = (saBrut - (saBrut * (p / 100))) + (dep * 100);
		
		JOptionPane.showMessageDialog(null,"O valor do Salário Líquido é " + saLiq);
	}
}
