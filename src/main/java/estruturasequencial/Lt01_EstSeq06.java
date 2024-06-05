package estruturasequencial;
import javax.swing.JOptionPane;
/*
  Descrição: Receba os valores em x e y. Efetue a troca de seus valores e mostre seus conteúdos
  Data: 20/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/
public class Lt01_EstSeq06 {
	public static void main (String args [ ] ) {
		float x, y, troca; 
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y: "));
		troca = x;
		x = y;
		y = troca;
		
		JOptionPane.showMessageDialog(null,"O valor de x agora é " + x + " e y " + y);
	} 
}
 