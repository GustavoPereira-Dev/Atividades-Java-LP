package modulagem;
/*
  Descrição: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m. (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure08 {
	public static void main (String args [ ] ) {
		double deposito;
		
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: "));
		
		calcularInvestimento(deposito);
	} 
	
	static void calcularInvestimento(double dep) {
		double valor;
		
		valor = dep * 0.013;
		
		JOptionPane.showMessageDialog(null,"O valor é: " + valor);
	}
}
 