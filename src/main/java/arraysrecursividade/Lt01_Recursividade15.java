package arraysrecursividade;

/*
	Descrição: Coletar valores de 4 índices de um vetor notas e retornar a média (em funções recursivas)
	Data: 30/06/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/

import javax.swing.JOptionPane;

public class Lt01_Recursividade15 {
	public static void main(String args[]) {
		int[] vt = new int[4];
		vt = lerVetores(vt, 3);
		System.out.println(somaIndices(vt, 3));
	}
	
	static int[] lerVetores(int[] vt, int i){
		if(i < 0) {
			return vt;
		}
		
		lerVetores(vt,i - 1);
		vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da " + (i + 1) + "ª nota:"));
		return vt;
	}
	
	static int somaIndices(int[] vt, int i) {
		int soma = 0;
		if(i < 0) {
			return 0;
		}
		
		soma = somaIndices(vt, i - 1) + vt[i];
		if(i == 3) {
			soma = soma / 4;
		}
		return soma;
	}
}
