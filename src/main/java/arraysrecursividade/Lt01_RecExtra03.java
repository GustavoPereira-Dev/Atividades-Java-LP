package arraysrecursividade;

/*
Descrição: Receba um número. Calcule e mostre os resultados da tabuada desse número (em função recursiva)
Data: 29/06/2024
Programador: Gustavo Pereira
Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_RecExtra03 {
	public static void main(String args[]) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para tabuada: "));
		System.out.println(calcTab(num,1));
		
	}
	
	static String calcTab(int n, int i){
		if(i > 10) {
			return "";
		}
		return n + " x " + i + " = " + (n * i) + "\n" + calcTab(n, i + 1);
		
	}
}
