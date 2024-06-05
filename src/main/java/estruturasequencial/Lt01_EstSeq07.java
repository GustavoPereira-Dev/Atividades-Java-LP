package estruturasequencial;
/*
  Descrição: Receba o valor de um dep�sito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
  Data: 20/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq07 {
	public static void main (String args [ ] ) {
		float comprimento, largura, altura, volume; 
		
		comprimento = Float.parseFloat(JOptionPane.showInputDialog("Digite o Comprimento: "));
		largura = Float.parseFloat(JOptionPane.showInputDialog("Digite a Largura: "));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a Altura: "));
		volume = (comprimento * altura * largura);
		
		JOptionPane.showMessageDialog(null,"O resultado do Volume é: " + volume);
	} 
}
 