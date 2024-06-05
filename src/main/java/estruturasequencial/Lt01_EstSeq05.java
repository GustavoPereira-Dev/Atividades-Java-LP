package estruturasequencial;
/*
  Descrição: Receba os coeficientes A, B e C de uma equação do 2º grau (AX^2+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue 2 raízes).
  Data: 20/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq05 {
	public static void main (String args [ ] ) {
		int a, b, c;
		double delta, x0, x1;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c: "));
		
		delta = (b * b) - (4 * a * c);
		x0 = (b + Math.sqrt(delta)) / (2 * a);
		x1 = (b - Math.sqrt(delta)) / (2 * a);
		
		JOptionPane.showMessageDialog(null,"O resultado de x0 é " + x0 + " e x1 " + x1);
	} 
}
 