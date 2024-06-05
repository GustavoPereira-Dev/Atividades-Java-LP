package estruturasequencial;
/*
  Descrição: Receba a base e a altura de um triângulo. Calcule e mostre a sua área
  Data: 20/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq03 {
	public static void main (String args [ ] ) {
		float base, altura, area;
		
		base = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da base: "));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura: "));
		area = base * altura;
		JOptionPane.showMessageDialog(null,"O resultado da �rea do quadrado �: " + area);
	} 
}
 