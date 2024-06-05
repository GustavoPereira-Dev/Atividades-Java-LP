package estruturasequencial;
/*
  Descrição: Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5
  Data: 20/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq04 {
	public static void main (String args [ ] ) {
		float celsius, fahrenheit; 
		
		celsius = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de Graus em Celsius: "));
		fahrenheit = (9 * celsius + 160) / 5;
		JOptionPane.showMessageDialog(null,"O resultado em Fahrenheit é: " + fahrenheit);
	} 
}
 