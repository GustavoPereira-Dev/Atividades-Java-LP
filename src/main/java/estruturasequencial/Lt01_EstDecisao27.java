package estruturasequencial;
/*
  Descrição: Receba o n�mero de voltas, a extens�o do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h
  Data: 27/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstDecisao27 {
	public static void main(String args[]) {
		int numVoltas, tempDur;
		float extCirc, distTotal, velMed;
		
		numVoltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voltas: "));
		extCirc = Float.parseFloat(JOptionPane.showInputDialog("Digite a extensão do circuito: "));
		tempDur = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de duração: "));
		
		distTotal = (extCirc * numVoltas) / 1000;
		velMed = distTotal / tempDur;
		
		JOptionPane.showMessageDialog(null,"A velocidade média pecorrida é: " + velMed + "km/h");
	}
		
}
