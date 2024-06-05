package estruturasequencial;
/*
  Descrição: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
  Data: 20/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq08 {
	public static void main (String args [ ] ) {
		double deposito, valor;
		
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: "));
		valor = deposito * 0.013;
		JOptionPane.showMessageDialog(null,"O valor é: " + valor);
	} 
}
 