package estruturasequencial;
/*
  Descrição: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%
  Data: 20/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq02 {
	public static void main (String args [ ] ) {
		double salario, reajuste; 
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Salário: "));
		reajuste = salario + (salario * 0.15);
		JOptionPane.showMessageDialog(null,"O resultado do Reajuste é: " + reajuste);
	} 
}
 