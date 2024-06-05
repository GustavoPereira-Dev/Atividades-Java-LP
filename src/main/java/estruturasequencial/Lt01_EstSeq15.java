package estruturasequencial;
/*
  Descrição: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa
  Data: 20/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq15 {
	public static void main (String args [ ] ) {
		double cat1, cat2, hip; 
		
		cat1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do 1º Cateto: "));
		cat2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do 2º Cateto: "));
		hip = Math.sqrt((cat1 * cat1) + (cat2 * cat2));
		JOptionPane.showMessageDialog(null,"O resultado da hipotenusa é: " + hip);
	} 
}
 