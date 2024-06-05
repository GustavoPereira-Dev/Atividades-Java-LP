package arraysrecursividade;
/*
  Descrição: Colete valores de 30 índices de valor, e calcule a mídia. Após isso, se um valor for acima da média, imprima a quantidade deles. Caso contrário mostre a posição dos valores abaixo da média
  Data: 26/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_VariaveisHomogeneas05 {
	static float[] vt = new float[30];
	public static void main(String args[]) {
		float media, acMed = 0;
		int i;
		
		media = adicionarValores() / 30;
		
		for(i = 0; i < 30; i++) { 
			if(vt[i] > media) {
				acMed += 1;
			} else {
				JOptionPane.showMessageDialog(null, "Número abaixo da média na posição " + (i + 1) + ": " + vt[i]);
			}
		}
		
		JOptionPane.showMessageDialog(null, "Números acima da média: " + acMed);
	}
	
	static float adicionarValores() {
		int i = 0;
		float soma = 0;
		
		for(i = 0; i < 30; i++) {
			vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º índice"));
			soma += vt[i];
		}
		return soma;
	}
	// static tipo[ ] vetor(){}
	
}