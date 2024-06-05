package estruturasequencial;
/*
  Descrição: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média
  Data: 20/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq17 {
	public static void main (String args [ ] ) {
		int tempP;
		float velMed, lGast;
	
		tempP = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo do percurso: "));
		velMed= Float.parseFloat(JOptionPane.showInputDialog("Digite a velocidade média: "));
		lGast = (tempP * velMed) / 12;
		
		JOptionPane.showMessageDialog(null,"A quantidade de litros de combustível gasto é: " + lGast);
	} 
	
}
