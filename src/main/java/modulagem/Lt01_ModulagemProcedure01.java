package modulagem;
/*
  Descrição: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure01 {
	
	public static void main (String args [ ] ) {
		float lado;
		lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do lado: "));
		calcularArea(lado);
	} 
	
	static void calcularArea(float l) {
		float area;
		
		area = l * l;
		
		JOptionPane.showMessageDialog(null,"O resultado da área do quadrado é: " + area);
	}
}
 