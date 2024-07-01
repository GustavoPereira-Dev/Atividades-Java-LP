package arraysrecursividade;

/*
	Descrição: Coletar valores de um índice de 10 valores de um vetor, e pelos valores, acrescentar os valores para um 2º Vetor (Se número par, Vetor2[i] = número * 5. Caso contrário, Vetor2[i] = número + 5)
	(em funções recursivas)
	Data: 30/06/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/

import javax.swing.JOptionPane;

public class Lt01_Recursividade16 {
	public static void main(String args[]) {
		int i;
		int[] vt1 = new int[10], vt2 = new int[10];
		
		vt1 = lerVetores(vt1, 9);
		vt2 = acrescentarValores(vt1.clone(),9);
		vt2[9] = 99;
		for(i = 0; i < 10; i++) {
			System.out.println("Primeiro vetor: " + vt1[i] + "; Segundo Vetor: " + vt2[i]);
		}
		
	}
	
	static int[] lerVetores(int[] vt, int i){
		if(i < 0) {
			return vt;
		}
		
		lerVetores(vt,i - 1);
		vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o índice do " + (i + 1) + "º vetor:"));
		return vt;
	}
	
	static int[] acrescentarValores(int[] vt, int i) {
		if(i < 0) {
			return vt;
		}
	
		if(vt[i] % 2 == 0) {
			vt[i] = vt[i] * 5;
		} else if(vt[i] % 2 == 1) {
			vt[i] = vt[i] + 5;
		}
		return acrescentarValores(vt, i - 1);
	}
}
