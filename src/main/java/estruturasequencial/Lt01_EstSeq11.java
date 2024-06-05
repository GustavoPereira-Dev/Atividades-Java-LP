package estruturasequencial;
/*
  Descrição: Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência
  Data: 20/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq11 {
	public static void main (String args [ ] ) {
		double raio, comprimento; 
		
		raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));
		comprimento = (2 * raio) * 3.14;
		JOptionPane.showMessageDialog(null,"O resultado do Comprimento é: " + comprimento);
	} 
}
 