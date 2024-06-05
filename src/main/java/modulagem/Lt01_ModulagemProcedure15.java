package modulagem;
/*
  Descrição: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure15 {
	public static void main (String args [ ] ) {
		double cat1, cat2;
		
		cat1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do 1º Cateto: "));
		cat2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do 2º Cateto: "));
		
		calcularHipotenusa(cat1, cat2);
	} 
	
	static void calcularHipotenusa(double c1, double c2) {
		double hip; 
		
		hip = Math.sqrt((c1 * c1) + (c2 * c2));
		JOptionPane.showMessageDialog(null,"O resultado da hipotenusa é: " + hip);
		
		
	}
}
 