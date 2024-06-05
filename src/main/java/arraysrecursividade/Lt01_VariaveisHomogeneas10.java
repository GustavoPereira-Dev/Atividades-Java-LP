package arraysrecursividade;
/*
  Descrição: Criar e coletar em um vetor [30] real e calcular e exibir:
  a. A média do grupo;
  b. A quantidade de notas acima do grupo;
  c. As posições dos valores abaixo da média do grupo.
  Data: 26/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_VariaveisHomogeneas10 {
	public static void main(String args[]) {
		int sequencia;
		
		sequencia = adicionarValores();
		
		JOptionPane.showMessageDialog(null,"O resultado da sequência é: " + sequencia); 
	}
	
	static int adicionarValores() {
		int[] vt = new int [20];
		int i = 0, seq = 0;
		
		for(i = 0; i < 20; i++) {
			vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º índice"));
		}
		
		for(i = 1; i < 21; i++) {
			seq += (vt[i - 1] - vt[20 - i]);  
		}
		return seq;
	}
	
}