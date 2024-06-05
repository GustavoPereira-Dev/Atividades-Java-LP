package modulagem;
/*
  Descrição: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure18 {
	static int num1, num2;
	public static void main(String args[]) {
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		diferencasNumeros();
		
	}
	
	static void diferencasNumeros() {
		int dValor;
		if(num1 > num2) {
			dValor = num1 - num2;
		} else {
			dValor = num2 - num1;
		}
		
		JOptionPane.showMessageDialog(null,"A diferença entre os 2 números é: " + dValor);
	}
}
