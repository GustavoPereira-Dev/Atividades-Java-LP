package arraysrecursividade;

/*
Descrição: Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores(em função recursiva)
Data: 29/06/2024
Programador: Gustavo Pereira
Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_RecExtra04 {
	public static void main(String args[]) {
		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		System.out.println("A somatória de números ímpares entre os dois é: " + somatoriaImpar(num1, num2, verificarMaior(num1, num2),0));
		
		
	}
	
	static int somatoriaImpar(int n1, int n2, int indx, int cont) {
		int soma = 0;
		
		System.out.println(indx);
		if(indx == n1 && cont > 0 || indx == n2 && cont > 0) {
			return 0;
		}
	
		
		soma = somatoriaImpar(n1, n2, indx - 1, cont + 1);
		if(indx % 2 == 1) {
			soma += indx;
		}
		return soma; 
		
	}
	
	static int verificarMaior(int n1, int n2) {
		if(n2 > n1) {
			return n2;
		} else {
			return n1;
		}
	}
}