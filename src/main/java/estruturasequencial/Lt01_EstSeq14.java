package estruturasequencial;
/*
  Descrição: Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo
  Data: 20/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq14 {
	public static void main (String args [ ] ) {
		int ang1, ang2, ang3; 
		
		ang1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1º Ângulo: "));
		ang2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2º Ângulo: "));
		ang3 = (ang1 + ang2) - 180;
		
		JOptionPane.showMessageDialog(null,"O valor do 3º ângulo é: " + ang3);
	} 
}
 