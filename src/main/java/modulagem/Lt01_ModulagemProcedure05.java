package modulagem;
/*
  Descrição: Receba os coeficientes A, B e C de uma equação do 2º grau (AX^2+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue 2 raízes).  (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure05 {
	public static void main (String args [ ] ) {
		int a, b, c;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c: "));
		
		CalcEquacao2Grau(a, b, c);
	} 
	
	static void CalcEquacao2Grau(int xa, int xb, int xc) {
		double delta, x0, x1;
		
		delta = (xb * xb) - (4 * xa * xc);
		x0 = (xb + Math.sqrt(delta)) / (2 * xa);
		x1 = (xb - Math.sqrt(delta)) / (2 * xa);
		
		JOptionPane.showMessageDialog(null,"O resultado de x0 é " + x0 + " e x1 " + x1);
	}
}
 