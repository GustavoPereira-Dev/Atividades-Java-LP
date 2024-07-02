package arraysrecursividade;
/*
  Descrição: Faça um bubble sort que retorne os valores de 20 índices desalinhados de um vetor em ordem crescente
  Data: 26/03/2024
  Programador: Gustavo Pereira
  Vers�o: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_VariaveisHomogeneas06 {
	public static void main(String args[]) {
		int[ ] vt = new int [20];
		
		vt = adicionarValores(vt);
		
		bubbleSort(vt);
	}
	
	static int[ ] adicionarValores(int vt[ ]) {
		int i = 0;
		
		for(i = 0; i < 20; i++) {
			vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º índice"));
		}
		return vt;
	}
	
	static void bubbleSort(int vt[ ]) {
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
		
		for(i = 0; i < 20; i++) {
			JOptionPane.showMessageDialog(null, (i + 1) + "º índice: " + vt[i]);
		}
	}
	
}