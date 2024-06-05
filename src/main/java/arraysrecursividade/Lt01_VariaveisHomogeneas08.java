package arraysrecursividade;
/*
  Descrição: Criar e coletar um vetor [100] inteiro e exibir:
  a. O maior e o menor valor;
  b. A média dos valores.
  Data: 26/03/2024
  Programador: Gustavo Pereira
  Vers�o: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_VariaveisHomogeneas08 {
	public static void main(String args[]) {
		float media;
		media = adicionarValores();
		
		JOptionPane.showMessageDialog(null,"O resultado da média é: " + media); 
	}
	
	static float adicionarValores() {
		int[] vt = new int [100];
		int maior = 0, menor = 0, i;
		float med = 0;
			
		for(i = 0; i < 100; i++) {
			vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º índice"));
			if(i == 0) {
				maior = vt[i];
				menor = vt[i];
			} else if(vt[i] < menor) {
				menor = vt[i];
			} else if(vt[i] > maior) {
				maior = vt[i];
			}
			med = med + vt[i];
		}
		
		JOptionPane.showMessageDialog(null,"Maior: " + maior + " ; Menor: " + menor); 
		
		return med / 100;
	}
	// static tipo[ ] vetor(){}
	
}