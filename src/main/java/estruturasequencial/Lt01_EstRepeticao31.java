package estruturasequencial;
/*
  Descrição: Calcule e mostre o quadrado dos números entre 10 e 150
  Data: 05/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstRepeticao31 {
	public static void main(String args[]) {
		int num = 10, quadrado, i;
		
		for(i = num;i <= 150;i++) {
			quadrado = (num * num);
			JOptionPane.showMessageDialog(null,"O quadrado de: " + i + " é: " + quadrado);
		}
		
	}
}
