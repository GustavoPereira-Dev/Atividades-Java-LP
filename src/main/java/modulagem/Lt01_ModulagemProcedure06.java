package modulagem;
/*
  Descrição: Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure06 {
	public static void main (String args [ ] ) {
		float x, y; 
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y: "));
		
		trocarValores(x,y);
	} 
	
	static void trocarValores(float ix, float iy) {
		float troca;
		
		troca = ix;
		ix = iy;
		iy = troca;
		
		JOptionPane.showMessageDialog(null,"O valor de x agora é " + ix + " e y " + iy);
	}
}
 