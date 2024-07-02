package arraysrecursividade;

/*
	Descrição: Faça um bubble sort que retorne os valores de 20 índices desalinhados de um vetor em ordem crescente (em funções recursivas)
	Data: 01/07/2024
	Programador: Gustavo Pereira
	Vers�o: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_Recursividade19 {
	public static void main(String args[]) {
		int[] vt = new int[20];
		vt = lerVetor(vt,19);
		vt = bSort1(vt, 19 - 1);
		int i;
		for(i = 0; i < 20; i++) {
			System.out.println(vt[i]);
		}
		
	}
	
	static int[] bSort1(int[] vt, int i) {
		if(i < 0) {
			return vt;
		}
		
		// TODO: Corrigir o problema do primeiro índice ficar desalinhado com o 1º
		
		bSort2(vt,i,i+1);
		bSort1(vt,i-1);
		return vt;
	}
	
	static int[] bSort2(int[] vt, int i, int j) {
		int aux;
		if(j < 0) {
			return vt;
		}
		
		
		bSort2(vt,i,j - 1);
		System.out.println(i + " " + j);
		if(vt[i] < vt[j]) {
			aux = vt[i];
			vt[i] = vt[j];
			vt[j] = aux;
		}
		return vt;
	}
	static int[] lerVetor(int[] vt, int i){
		if(i < 0) {
			return vt;
		}
		
		lerVetor(vt,i - 1);
		vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º índice:"));
		
		return vt;
	}
}
