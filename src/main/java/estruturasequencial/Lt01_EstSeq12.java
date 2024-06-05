package estruturasequencial;
/*
  Descrição: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos
  Data: 20/02/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq12 {
	public static void main (String args [ ] ) {
		int anoNasc, anoAtual, resltd;
		
		anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		resltd = (anoAtual - anoNasc) + 17;
		JOptionPane.showMessageDialog(null,"Daqui a 17 anos você terá: " + resltd);
	} 
}
 