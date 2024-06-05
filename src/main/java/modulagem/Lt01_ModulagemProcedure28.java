package modulagem;
/*
  Descrição: Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que: 
  	Venda Mensal 		Preço Atual 		Preço Novo 
  	< 500			 	< 30 			       + 10% 
  	>= 500 e < 1000 	>= 30 e < 80 	       + 15% 
  	>= 1000 			>= 80 				   - 5% 
  	Obs.: para outras condições, pre�o novo será igual ao preço atual
   (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure28 {
	static double prAtual, vendMen;
	public static void main(String args[]) {		
		prAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto: "));
		vendMen = Double.parseDouble(JOptionPane.showInputDialog("Digite a venda mensal do produto: "));
		
		calcularPrecoNovo();
	}
	
	static void calcularPrecoNovo() {
		double prNovo;
		if(vendMen < 500 && prAtual < 30) {
			prNovo = prAtual + (prAtual * 0.10);
		} else if(vendMen >= 500 && vendMen < 1000 && prAtual > 30 && prAtual < 80) {
			prNovo = prAtual + (prAtual * 0.15);
		} else if(vendMen >= 1000 && prAtual >= 80) {
			prNovo = prAtual - (prAtual * 0.05);
		} else {
			prNovo = prAtual;
		}
		
		JOptionPane.showMessageDialog(null,"O preço novo do produto é: " + prNovo);
	}
}
