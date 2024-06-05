package modulagem;
/*
  Descrição: Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos, sabendo que o tempo máximo � menor que 24 horas e pode começar num dia e terminar noutro (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure25 {
	static int horaInicio, horaFim, minInicio, minFim;
	
	public static void main(String args[]) {
		horaInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de início do jogo: "));
		minInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos de início do jogo: "));
		horaFim = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de fim do jogo: "));
		minFim = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos de fim do jogo: "));
		
		duracaoJogo();
	}
	
	static void duracaoJogo() {
		int duracaoHor, duracaoMin;
		if(horaFim - horaInicio < 0) {
			duracaoHor = (horaFim - horaInicio) + 24;
		} else {
			duracaoHor = (horaFim - horaInicio);
		}
		
		if(minFim - minInicio < 0) {
			duracaoMin = (minFim - minInicio) + 60;
		} else {
			duracaoMin = (minFim - minInicio);
		}
		
		JOptionPane.showMessageDialog(null,"A duração do jogo foi de " + duracaoHor + " horas e " + duracaoMin + " minutos");
	}
}
