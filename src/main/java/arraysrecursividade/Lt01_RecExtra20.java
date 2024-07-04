package arraysrecursividade;

import javax.swing.JOptionPane;

/*
	Descrição: Criar e coletar um vetor [50] inteiro. Calcular e exibir:
	a. A média dos valores entre 10 e 200;
	b. A soma dos números ímpares.
	(Em funções recursivas)
	Data: 01/07/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/
public class Lt01_RecExtra20 {
	public static void main(String args[]) {
		int[] vt = new int[50], res = new int[2];
		vt = lerVetor(vt, 9);
		System.out.println("Resultado da soma dos ímpares é: " + somaImpares(vt, 9));
		
		res = mediaValores(vt, 0, 9);
		
		if(res[1] == 0) {
			 System.out.println("A média dos valores é nulo (não existe nenhum número nesse intervalo)");
		} else {
			System.out.println("A média dos valores entre 10 e 200 é: " + (res[0] / res[1]));
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
	
	static int somaImpares(int[] vt, int i) {
		int soma = 0;
		if(i < 0) {
			return 0;
		}
		
		soma = somaImpares(vt, i - 1);
		if(vt[i] % 2 == 1) {
			soma += vt[i];
		}
		return soma;
	}
	
	static int[] mediaValores(int[] vt, int quant, int i) {
		int[] media = new int[2];
		if(i < 0) {
			return media;
		}
		
		
		media = mediaValores(vt, quant, i - 1);
		if(vt[i] >= 10 && vt[i] <= 200) {
			media[0] += vt[i];
			media[1] += 1;
		}
		
		return media;
	}
}
