package modulagem;
/*
  Descrição: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure17 {
	public static void main (String args [ ] ) {
		int tempP;
		float velMed;
	
		tempP = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo do percurso: "));
		velMed= Float.parseFloat(JOptionPane.showInputDialog("Digite a velocidade média: "));
		
		calcularLitrosGastos(tempP, velMed);
	} 
	
	static void calcularLitrosGastos(int tp, float vm) {
		float lGast;
		
		lGast = (tp * vm) / 12;
		
		JOptionPane.showMessageDialog(null,"A quantidade de litros de combustível gasto é: " + lGast);
		
	}
}
