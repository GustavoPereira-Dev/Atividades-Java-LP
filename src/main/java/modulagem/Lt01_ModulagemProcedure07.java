package modulagem;
/*
  Descrição: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m. (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure07 {
	public static void main (String args [ ] ) {
		float comprimento, largura, altura; 
		
		comprimento = Float.parseFloat(JOptionPane.showInputDialog("Digite o Comprimento: "));
		largura = Float.parseFloat(JOptionPane.showInputDialog("Digite a Largura: "));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a Altura: "));
		
		calcularVolume(comprimento,largura,altura);
	} 
	
	static void calcularVolume(float comp, float alt, float larg) {
		float volume;
		
		volume = (comp * alt * larg);
		
		JOptionPane.showMessageDialog(null,"O resultado do Volume é: " + volume);
	}
}
 