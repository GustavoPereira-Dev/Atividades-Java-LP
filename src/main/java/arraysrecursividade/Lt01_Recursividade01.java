package arraysrecursividade;
/*
  Descrição: Faça a série (1+2+3+...+100) em recursiva
  Data: 19/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_Recursividade01 {
	public static void main(String args[]) {
		int num = 100;
		
		JOptionPane.showMessageDialog(null,"O resultado da soma de 1 a 100 é: " + somaNumeros(num));
	}
	
	public static int somaNumeros(int n) {
		int soma = 0;
		if(n != 1) {
			soma = n + somaNumeros(n -1);
			return soma;
		}
		return n;	
	}
}
