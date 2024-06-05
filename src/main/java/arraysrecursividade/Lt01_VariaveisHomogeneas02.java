package arraysrecursividade;
/*
  Descrição: Coletar valores de 4 índices de um vetor notas e retornar a média 
  Data: 26/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_VariaveisHomogeneas02 {
	public static void main(String args[]) {
		int media;
		
		media = somaNotas() / 4;
		
		JOptionPane.showMessageDialog(null,"O resultado da média é: " + media); 
		
	}
	
	static int somaNotas(){
		int[] vet = new int[4];
		int i, soma = 0;
		
		for(i = 0; i < 4; i++) {
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da " + (i + 1) + "º nota:"));
			soma += vet[i];
		}
		return soma;
	}
	
}
