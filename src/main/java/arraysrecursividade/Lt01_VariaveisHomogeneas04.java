package arraysrecursividade;
/*
  Descrição: Coletando valor de 5 quantidades vendidas e o preço do produto, calcule o total de venda dos produtos e a comissão de 5% da venda deles
  Data: 26/03/2024
  Programador: Gustavo Pereira
  Vers�o: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_VariaveisHomogeneas04 {
	public static void main(String args[]) {
		double comissao = calcularVendas() * 0.25;
		
		JOptionPane.showMessageDialog(null,"O resultado da comissão é: " + comissao); 
	}
	
	static double calcularVendas(){
		int[] qtd = new int[5], preco = new int[5];
		int i = 0;
		double totVend, totGeral = 0.0;
		
		for(i = 0; i <= 4; i++) {
			qtd[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida do " + (i + 1) + "� produto: "));
			preco[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o preço do " + (i + 1) + "º produto: "));
		}
		
		for(i = 0; i <= 4; i++) {
			totVend = qtd[i] * preco[i];
			totGeral += totVend;
			JOptionPane.showMessageDialog(null,"O venda total do produto: " + (i + 1) + " é: " + totVend);
		}
		JOptionPane.showMessageDialog(null,"O venda total dos produtos é: " + totGeral);
		return totGeral;
		
	
	}
	
}