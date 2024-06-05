package modulagem;
/*
  Descrição: Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5 (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure04 {
	public static void main (String args [ ] ) {
		float celsius; 
		
		celsius = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de Graus em Celsius: "));
		
		calcularTempFahrenheit(celsius);
		
	} 
	
	static void calcularTempFahrenheit(float cl) {
		float fahrenheit;
		
		fahrenheit = (9 * cl + 160) / 5;
		
		JOptionPane.showMessageDialog(null,"O resultado em Fahrenheit é: " + fahrenheit);
	}
	
}
 