package modulagem;
/*
  Descrição: Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure11 {
	public static void main (String args [ ] ) {
		double raio; 
		
		raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));
		
		calcularComprimento(raio);
	} 
	
	static void calcularComprimento(double r) {
		double comprimento;
		
		comprimento = (2 * r) * 3.14;
		JOptionPane.showMessageDialog(null,"O resultado do Comprimento é: " + comprimento);
	}
}
 