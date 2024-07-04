package arraysrecursividade;

/*
	Descrição: Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles (em funções recursivas)
	Data: 03/07/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/

import javax.swing.JOptionPane;

public class Lt01_RecExtra08 {
	public static void main(String args[]) {
		int n1, n2;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número: "));
		
		System.out.println(mostrarNumerosPrimos1(n2, n2, verificarMaior(n1, n2)));
		
		
	}
	
	public static int mostrarNumerosPrimos1(int num1, int num2, int indx) {
		System.out.println("a");
		if(indx + 1 < num1 || indx + 1 < num2) {
			return 0;
		}
		
		mostrarNumerosPrimos1(num1, num2, indx - 1);
		mostrarNumerosPrimos2(num1, num2, indx - 1, indx + 1);
		return 0;
	}
	
	public static int mostrarNumerosPrimos2(int num1, int num2, int indx, int indxMod) {
		if(indxMod < 0) {
			return 0;
		}
		
		
		indxMod = mostrarNumerosPrimos2(num1, num2, indx - 1, indx - 1);
		if(indxMod == 0) {
			System.out.println(indx + " a");
		} else if(indx % indxMod == 0) {
			System.out.println(indx + " b");
			indxMod = (indx - indx) - 1;
		}
		return 0;
	}
	
	static int verificarMenor(int num1, int num2) {
		if(num2 < num1) {
			return num2;
		} else {
			return num1;
		}
	}
	
	static int verificarMaior(int num1, int num2) {
		if(num2 > num1) {
			return num2;
		} else {
			return num1;
		}
	}
	/*
	static int num1, num2;
	public static void main(String args[]) {
		
		int indx, indxMod;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		indx = verificarMenor();
		
		
		while(indx + 1 > num1 || indx + 1 > num2) {
			for(indxMod = indx - 1;indxMod > 0; indxMod--) {
				if(indxMod == 0) {
					JOptionPane.showMessageDialog(null,indx);
				} else if(indx % indxMod == 0) {
					indxMod = (indx - indx) - 1;
				}
			}
			indx--;
		}
				
	}
	
	*/






}