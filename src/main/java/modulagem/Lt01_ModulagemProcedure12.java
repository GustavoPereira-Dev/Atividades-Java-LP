package modulagem;
/*
  Descrição: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure12 {
	public static void main (String args [ ] ) {
		int anoNasc, anoAtual;
		
		anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		
		calcularIdade(anoNasc, anoAtual);
	} 
	
	static void calcularIdade(int anoN, int anoA) {
		int resltd;
		
		resltd = (anoA - anoN) + 17;
		JOptionPane.showMessageDialog(null,"Daqui a 17 anos você terá: " + resltd);
	}



}
 