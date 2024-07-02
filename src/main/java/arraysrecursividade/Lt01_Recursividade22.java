package arraysrecursividade;

/*
	Descrição: Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. 
	P. ex: VT1| 1| 2| 3| |VT2| 4| 5| 6| |VT3| 1| 2| 3| 4| 5| 6
	Em função recursiva
	Data: 01/07/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/

import javax.swing.JOptionPane;

public class Lt01_Recursividade22 {
	public static void main(String args[]) {
		int[] vt1 = new int[3], vt2 = new int[3], vt3 = new int[6];
		vt1 = lerVetor(vt1, vt1.length - 1);
		vt2 = lerVetor(vt2, vt2.length - 1);
		vt3 = adicionarValores(vt1, vt2, (vt1.length + vt1.length) - 1);
		for(int i = 0; i < 6; i++) {
			System.out.println(vt3[i]);
		}
		
	}
	
	static int[] lerVetor(int[] vt, int i){
		if(i < 0) {
			return vt;
		}
		
		lerVetor(vt,i - 1);
		vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º índice:"));
		
		return vt;
	}
	
	static int[] adicionarValores(int[] vt1,int[] vt2, int i) {
		int[] vt3 = new int[6];
		if(i < 0) {
			return vt3;
		}
		
		vt3 = adicionarValores(vt1, vt2, i - 1);
		if(i <= 2) vt3[i] = vt1[i];
		if(i >= 3) vt3[i] = vt2[i - vt2.length];
		return vt3;
	}
}
