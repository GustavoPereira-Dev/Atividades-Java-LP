package estruturasequencial;
/*
  Descrição: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado
  Data: 20/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq01 {
	public static void main (String args [ ] ) {
		float lado, area; 
	
		lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do lado: "));
		area = lado * lado;
		JOptionPane.showMessageDialog(null,"O resultado da área do quadrado é: " + area);
	} 
}
 