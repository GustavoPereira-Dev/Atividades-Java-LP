package modulagem;
/*
  Descrição: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a poupan�a = 3% e a renda fixa = 5%. Demais tipos não serão considerados (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure29 {
	static int tipo;
	static double valor;
	public static void main(String args[]) {	
		tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de investimento (1 = poupança e 2 = renda fixa): "));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento: "));
		
		verInvestimento();
	}
	
	static void verInvestimento() {
		double investimento;
		switch(tipo) {
			case 1:
				investimento = valor + (valor * 0.03);
			case 2:
				investimento = valor + (valor * 0.05);
			default:
				investimento = valor;
		}
	
		JOptionPane.showMessageDialog(null,"O investimento é: " + investimento);
	}
		
}
