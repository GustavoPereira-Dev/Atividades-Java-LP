package modulagem;
/*
  Descrição: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15% (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure02 {
	public static void main (String args [ ] ) {
		double salario; 
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Salário: "));
		calcularSalario(salario);
		
	} 
	
	static void calcularSalario(double sal) {
		double reajuste;
		
		reajuste = sal + (sal * 0.15);
		
		JOptionPane.showMessageDialog(null,"O resultado do Reajuste é: " + reajuste);
	}
}
 