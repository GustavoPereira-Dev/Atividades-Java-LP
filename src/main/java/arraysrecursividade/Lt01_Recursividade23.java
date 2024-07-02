package arraysrecursividade;
/*
	Descrição: Criar e coletar em um vetor [30] real e calcular e exibir:
	a. A média do grupo;
	b. A quantidade de notas acima do grupo;
	c. As posições dos valores abaixo da média do grupo.
	Em função recursiva
	Data: 01/07/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_Recursividade23 {	
	public static void main(String args[]) {
		int[] vt = new int[30];
		String[] textos = new String[2];
		
		int media;
		vt = lerVetor(vt, 29);
		media = mediaValores(vt, 29);
		System.out.println("Média: " + media);
		textos = calcDiferencaMedia(media, vt, 29);
		System.out.println("Quantidade de valores acima da média: " + textos[0] + "; Índice dos valores abaixo da média: " + textos[1]);
		
	}
	
	static int mediaValores(int[] vt, int i) {
		int media = 0;
		if(i < 0) {
			return media;
		}
		
		media = vt[i] + mediaValores(vt, i - 1);
		if(i == 9) {
			media /= 10;
		}
		
		return media;
	}
	
	static String[] calcDiferencaMedia(double media, int vt[], int i) {
		String[] textos = {"0",""};
		if(i < 0) {
			return textos;
		}
		
		textos = calcDiferencaMedia(media, vt, i - 1);
		if(vt[i] > media) {
			
			textos[0] = (Integer.parseInt(textos[0])+1) + "";
			
		} else if(vt[i] < media) {
			textos[1] += i + " ";
		}
		
		return textos;
		
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
