package arraysrecursividade;
/*
	Descrição: A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e verificar a sua existência no vetor (utilizar pesquisa binária e fazer recursiva)
	Data: 01/07/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_Recursividade24 {
	public static void main(String args[]) {
		int[] vt = new int [10];
		int vProc;
		vt = lerVetor(vt, 9);
		
		vProc = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor procurado no vetor: "));
		System.out.println(pesquisaBinaria(vt, 0, vt.length - 1, vProc));
		
		
		
	}
	
	static int pesquisaBinaria(int[] vt, int inicio, int fim, int vProc) {
		if(inicio <= fim) {
			int meio = (inicio + fim) / 2;
			if(vt[meio] == vProc) {
				return meio;
			} else if(vt[meio] < vProc) {
				return pesquisaBinaria(vt, meio + 1, fim, vProc);
			} else {
				return pesquisaBinaria(vt,inicio, meio - 1, vProc);
			}
			
		} else {
			return -1;
		}
	}
	
	static int[] bSort1(int[] vt, int i) {
		if(i < 0) {
			return vt;
		}
		
		// TODO: Corrigir o problema do útlimo índice ficar desalinhado
		
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
