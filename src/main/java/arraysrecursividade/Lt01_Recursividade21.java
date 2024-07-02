package arraysrecursividade;
/*
	Descrição: Criar e coletar um vetor [100] inteiro e exibir:
	a. O maior e o menor valor;
	b. A média dos valores.
	(Em funções recursivas)
	Data: 01/07/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/

import javax.swing.JOptionPane;

public class Lt01_Recursividade21 {
	public static void main(String args[]) {
		int[] vt = new int[10], media = new int[2];
		vt = lerVetor(vt,9);
		System.out.println("Maior valor: " + calcMaior(vt, 9) + "; Menor valor: " + calcMenor(vt, 9));
		media = mediaValores(vt, 0, 9);
		System.out.println("Média dos valores: " + media[0] / media[1]);
	
	}
	
	static int calcMaior(int[] vt, int i) {
		int n;
		if(i < 0) {
			return Integer.MIN_VALUE;
		}
		
		n = calcMaior(vt, i - 1);
		if(i == 0 || vt[i] > n) {
			n = vt[i];
		} 
		
		return n;
	}
	
	static int calcMenor(int[] vt, int i) {
		int n;
		if(i < 0) {
			return Integer.MAX_VALUE;
		}
		
		n = calcMenor(vt, i - 1);
		if(i == 0 || vt[i] < n) {
			n = vt[i];
		} 
		
		return n;
	}
	
	static int[] mediaValores(int[] vt, int quant, int i) {
		int[] media = new int[2];
		if(i < 0) {
			return media;
		}
		
		media = mediaValores(vt, quant, i - 1);
		media[0] += vt[i];
		media[1] += 1;
		
		
		return media;
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
