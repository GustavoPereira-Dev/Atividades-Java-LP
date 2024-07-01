package arraysrecursividade;

/*
	Descrição: Coletar valores de 5 índices de um Vetor e retornar a soma de todos (em funções recursivas)
	Data: 30/06/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/
import javax.swing.JOptionPane;

public class Lt01_Recursividade14 {
	public static void main(String args[]) {
	
		int[] vt = new int[5];
		
		vt = lerVetores(vt, 4);
		System.out.println(somaIndices(vt, 4));
		
	}
	
	static int[] lerVetores(int[] vt, int i){
		if(i < 0) {
			return vt;
		}
		
		lerVetores(vt,i - 1);
		vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o índice do " + (i + 1) + "º vetor:"));
		return vt;
	}
	
	static int somaIndices(int[] vt, int i) {
		if(i < 0) {
			return 0;
		}
		
		return somaIndices(vt, i - 1) + vt[i];
	}
}
