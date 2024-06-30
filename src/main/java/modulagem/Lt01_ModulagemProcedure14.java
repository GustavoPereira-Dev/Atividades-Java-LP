package modulagem;
/*
  Descrição: Receba 2 �ngulos de um triângulo. Calcule e mostre o valor do 3º ângulo (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure14 {
	public static void main (String args [ ] ) {
		int ang1, ang2; 
		
		ang1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1º ângulo: "));
		ang2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2º ângulo: "));
		
		calcularTerceiroAng(ang1, ang2);
	} 
	
	static void calcularTerceiroAng(int ag1, int ag2) {
		int ang3;
		
		ang3 = (ag1 + ag2) - 180;
		
		JOptionPane.showMessageDialog(null,"O valor do 3º ãngulo é: " + ang3);
	}



}
 