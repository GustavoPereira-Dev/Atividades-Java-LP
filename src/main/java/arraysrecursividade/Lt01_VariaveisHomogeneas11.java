package arraysrecursividade;
/*
  Descrição: A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e verificar a sua existência no vetor (utilizar pesquisa binária)
  Data: 26/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_VariaveisHomogeneas11 {
	public static void main(String args[]) {
		int[ ] vt = new int [20];
		int inicio = 0, fim = 19, meio, vProc;
		boolean encontrado = false;
		
		vt = adicionarValores(vt);
		vt = bubbleSort(vt);
		
		vProc = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor procurado"));
		
		while(inicio <= fim) {
			meio = (inicio + fim) / 2;
			if(vt[meio] == vProc) {
				JOptionPane.showMessageDialog(null, "O valor " + vProc + " foi encontrado no índice " + meio);
				encontrado = true;
				break;
			} else if(vt[meio] < vProc) {
				inicio = meio + 1;
			} else {
				fim = meio + 1;
			}
			
		}
		
		if(!encontrado) {
			JOptionPane.showMessageDialog(null, "O valor não foi encontrado no vetor");
		}
		
		
	}
	
	static int[ ] adicionarValores(int vt[ ]) {
		int i = 0;
		
		for(i = 0; i < 20; i++) {
			vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º índice"));
		}
		return vt;
	}
	
	static int[] bubbleSort(int vt[ ]) {
		int i, j, aux;
		
		for(i = 0; i < 19; i++) {
			for(j = i + 1; j < 20; j++) {
				if(vt[i] > vt[j]) {
					aux = vt[i];
					vt[i] = vt[j];
					vt[j] = aux;
				}
			}
		}
		
		return vt;
	}
	
}