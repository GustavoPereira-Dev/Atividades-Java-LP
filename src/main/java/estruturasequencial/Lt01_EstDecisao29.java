package estruturasequencial;
/*
  Descrição: Receba o tipo de investimento (1 = poupan�a e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados
  Data: 27/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstDecisao29 {
	public static void main(String args[]) {
		int tipo;
		double valor, investimento;
		
		tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de investimento (1 = poupança e 2 = renda fixa): "));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento: "));
		
		switch(tipo) {
			case 1:
				investimento = valor + (valor * 0.03);
			case 2:
				investimento = valor + (valor * 0.05);
			default:
				investimento = valor;
		}
		
		JOptionPane.showMessageDialog(null,"O valor de investimento é: " + investimento);
	}
		
}
