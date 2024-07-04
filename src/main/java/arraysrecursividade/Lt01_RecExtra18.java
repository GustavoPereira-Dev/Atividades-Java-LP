package arraysrecursividade;

/*
	Descrição: Colete valores de 30 índices de valor, e calcule a mídia. Após isso, se um valor for acima da média, imprima a quantidade deles. Caso contrário mostre a posição dos valores abaixo da média (em funções recursivas)
	Data: 01/07/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/
import javax.swing.JOptionPane;

public class Lt01_RecExtra18 {
	public static void main(String args[]) {
		int[] vt = new int[30];
		vt = lerVetor(vt,29);
		String[] textos = calcDiferencaMedia(somarValores(vt, 29) / 30, vt, 29);
		
		
		System.out.println("Valores acima da média: " + textos[0] + "\nValores abaixo da média: " + textos[1]);
		
		
	}
	
	static String[] calcDiferencaMedia(double media, int vt[], int i) {
		String[] textos = {"",""};
		if(i < 0) {
			return textos;
		}
		
		textos = calcDiferencaMedia(media, vt, i - 1);
		if(vt[i] > media) {
			textos[0] += vt[i] + " ";
		} else if(vt[i] < media) {
			textos[1] += vt[i] + " ";
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
	
	static int somarValores(int[] vt, int i) {
		int soma = 0;
		if(i < 0) {
			return soma;
		}
		
		soma = vt[i] + somarValores(vt, i - 1);
		return soma;
	}
}
