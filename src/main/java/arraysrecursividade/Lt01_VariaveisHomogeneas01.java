package arraysrecursividade;
/*
  Descrição: Coletar valores de 5 índices de um Vetor e retornar a soma de todos
  Data: 26/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_VariaveisHomogeneas01 {
	public static void main(String args[]) {
		
		JOptionPane.showMessageDialog(null,"o resultado da soma dos vetores é: " + somaVetores());
		
	}
	
	static int somaVetores(){
		int[] vet = new int[5];
		int i, soma = 0;
		
		for(i = 0; i <= 4; i++) {
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do índice " + (i + 1) + ":"));
			soma += vet[i];
		}
		return soma;
	}
	
}
