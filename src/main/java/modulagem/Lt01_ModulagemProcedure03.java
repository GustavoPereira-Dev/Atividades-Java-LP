package modulagem;
/*
  Descrição: Receba a base e a altura de um triângulo. Calcule e mostre a sua área (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure03 {
	public static void main (String args [ ] ) {
		float base, altura;
		
		base = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da base: "));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura: "));
		
		calcularArea(base, altura);
		
	} 
	
	static void calcularArea(float bs, float al) {
		float area;
		
		area = bs * al;
		
		JOptionPane.showMessageDialog(null,"O resultado da área do quadrado é: " + area);
	}
}
 