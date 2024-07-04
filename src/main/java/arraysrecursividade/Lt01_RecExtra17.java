package arraysrecursividade;
/*
	Descrição: Coletando valor de 5 quantidades vendidas e o preço do produto, calcule o total de venda dos produtos e a comissão de 5% da venda deles (em funções recursivas)
	Data: 01/07/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/

import javax.swing.JOptionPane;

public class Lt01_RecExtra17 {
	public static void main(String args[]) {
		int[][] mt = new int[5][2];
		mt = lerProdutos(mt,4);
		
		System.out.println("O resultado final da comissão é: " + (calcularVendas(mt,4) * 0.5));
		
		
	}
	
	static int calcularVendas(int[][] mt, int i){
		int vendas = 0;
		if(i < 0) {
			return vendas;
		}
		
		System.out.println("O valor de venda do " + (i + 1) + "º produto é: " + (mt[i][0] * mt[i][1]) + " de reais");
		System.out.println("O valor de comissão do " + (i + 1) + "º produto é: " + ((mt[i][0] * mt[i][1]) * 0.5) + " de reais");
		
		vendas = (mt[i][0] * mt[i][1]) + calcularVendas(mt, i - 1);;
		return vendas;
	}
	static int[][] lerProdutos(int[][] mt, int i){
		if(i < 0) {
			return mt;
		}
		
		lerProdutos(mt,i - 1);
		mt[i][0] = Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade de venda do " + (i + 1) + "º produto:"));
		mt[i][1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o preço de venda do" + (i + 1) + "º produto:"));
		return mt;
	}
}
