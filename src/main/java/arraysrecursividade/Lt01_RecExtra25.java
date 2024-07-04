package arraysrecursividade;
/*
	Descrição: Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
	a.	A quantidade de cada produto vendido no mês;
	b.	A quantidade de produtos vendidos por semana;
	c.	O total de produtos vendidos no mês.
	(com função recursiva)
	Data: 01/07/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_RecExtra25 {
	public static void main(String args[]) {
		int[][] mt = new int[4][3];
		mt = lerLinhaMatriz(mt,3);
		
		System.out.println("Total de produtos vendidos no mês: " + calcProdsVends(mt, 3));
		
	}
	
	public static int calcProdsVends(int[][] mt,int i) {
		int vendas = 0;
		int aux;
		if(i < 0) {
			return vendas;
		}
		
		vendas = calcProdsVends(mt,i-1);
		vendas += calcProdsVendsLinha(mt,i,2);
		if(i < 3) aux = calcProdsVendsColuna(mt,i,3);
		return vendas;
		
	}
	
	public static int calcProdsVendsLinha(int[][] mt, int i, int j) {
		int vendasSemanais = 0;
		if(j < 0) {
			return vendasSemanais;
		}
		
		vendasSemanais = mt[i][j] + calcProdsVendsLinha(mt,i,j - 1);
		if(j == 2) {
			System.out.println("Vendas da " + (i+1) + "ª semana dos produtos: " + vendasSemanais);
		}
		
		return vendasSemanais;
	}
	
	public static int calcProdsVendsColuna(int[][] mt, int i, int j) {
		int vendasMensais = 0;
		if(j < 0) {
			return vendasMensais;
		}
		
		vendasMensais = mt[j][i] + calcProdsVendsColuna(mt,i,j - 1);
		if(j == 3) {
			System.out.println("Venda mensal do " + (i+1) + "º produto: " + vendasMensais);
		}
		
		return vendasMensais;
	}
	
	public static int[][] lerLinhaMatriz(int[][] mt, int i){
		if(i < 0) {
			return mt;
		}
		
		lerLinhaMatriz(mt,i -1);
		lerColunaMatriz(mt,i,2);
		
		return mt;
	}
	
	public static int[][] lerColunaMatriz(int[][] mt, int i, int j){
		if(j < 0) {
			return mt;
		}
		
		lerColunaMatriz(mt,i,j - 1);
		mt[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor na linha e da " + (j + 1) + "º coluna:"));
		return mt;
	}
}
