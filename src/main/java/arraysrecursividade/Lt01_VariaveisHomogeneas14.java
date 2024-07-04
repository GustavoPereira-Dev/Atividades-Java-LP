package arraysrecursividade;
/*
  Descrição: Criar uma matriz [8][8] onde o programa irá carregar segundo:
  casa   1  2  3  4 ... *Exibir a soma
  valor  1  2  4  8 ... dos valores
  Data: 26/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_VariaveisHomogeneas14 {
	public static void main(String args[]) {
		
		adicionarValores();
	}
	
	static void adicionarValores() {
		long soma = 0;
		long[][] Mat = new long [8][8];
	
		 for(int i = 0; i < 8; i += 2) {
	 		for(int j = 0; j < 8; j++) {
	      		if(i == 0 && j == 0) {
					Mat[i][j] = 1;
					Mat[i + 1][ j] = 1;
					soma = 1;
	      		} else if(j != 0) {
					Mat[i][j] = Mat[i][j - 1] + 1;
					Mat[i + 1][ j] = Mat[i + 1][j - 1] * 2;
					soma = soma + Mat[i + 1][ j];
	      		}
	      		
	      		if(i != 6) {
					Mat[i + 2][0] = Mat[i][j] + 1;
					Mat[i + 3][0] = Mat[i + 1][j] * 2;
				}
	 		}
	 		
	 		
		
			
		 }
		JOptionPane.showMessageDialog(null,"O resultado da soma é: " + soma); 
		
	}
	
}