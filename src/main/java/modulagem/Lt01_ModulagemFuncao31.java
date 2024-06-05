package modulagem;
/*
  Descrição: Calcule e mostre o quadrado dos números entre 10 e 150 (em função)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemFuncao31 {
	public static void main(String args[]) {
		int num = 10, i;
		
		
		for(i = num;i <= 150;i++) {
			JOptionPane.showMessageDialog(null,"O quadrado de: " + i + " é: " + calcularQuadrado(num));
		}
		
	}
	
	static int calcularQuadrado(int n) {
		
		return (n * n);
	}
}
