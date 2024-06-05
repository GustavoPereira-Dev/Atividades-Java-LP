package modulagem;
/*
  Descrição: Receba o número de voltas, a extens�o do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade m�dia em km/h (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure27 {
	static int numVoltas, tempDur;
	static float extCirc;
	public static void main(String args[]) {
		
		numVoltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voltas: "));
		extCirc = Float.parseFloat(JOptionPane.showInputDialog("Digite a extensão do circuito: "));
		tempDur = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de duração: "));
		
		velocidadeMedia();
	}
	
	static void velocidadeMedia() {
		float distTotal, velMed;
		
		distTotal = (extCirc * numVoltas) / 1000;
		velMed = distTotal / tempDur;
		
		JOptionPane.showMessageDialog(null,"A velocidade média pecorrida é: " + velMed + "km/h");
	}
		
}
