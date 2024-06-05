package modulagem;
/*
  Descrição: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX^2+BX+C=0. Verifique e mostre a exist�ncia de raízes reais e se caso exista, calcule e mostre (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Vers�o: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure20 {
	static int a, b, c;
	
	public static void main (String args [ ] ) {
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c: "));
		
		calcularDelta();
	} 
	
	static void calcularDelta() {
		double delta, x0, x1;
		
		delta = (b * b) - (4 * a * c);
		
		if(delta > 0) {
			x0 = (b + Math.sqrt(delta)) / (2 * a);
			x1 = (b - Math.sqrt(delta)) / (2 * a);
			JOptionPane.showMessageDialog(null,"O resultado de x0 é " + x0 + " e do x1 é " + x1);
		} else {
			JOptionPane.showMessageDialog(null,"Raiz inexistente");
		}
	}
		
}
