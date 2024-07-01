package arraysrecursividade;
/*
  Descrição: Coletar valores de um índice de 10 valores de um vetor, e pelos valores, acrescentar os valores para um 2º Vetor (Se número par, Vetor2[i] = número * 5. Caso contrário, Vetor2[i] = número + 5)
  Data: 26/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_VariaveisHomogeneas03 {
	
	public static void main(String args[]) {
		int[] teste1 = new int[10];
		
		teste1 = adicionarValores(teste1);
		calculaVetor(teste1);
	}
	
	static int[] adicionarValores(int vt[]) {
		int i = 0;
		
		for(i = 0; i < 10; i++) {
			vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º índice"));
		}
		return vt;
	}
	
	 static void calculaVetor(int vt[ ]){
		 int[] teste2 = new int[10];
		 int i = 0;
		 
		 for(i = 0; i < 10; i++) {
			if(vt[i] % 2 == 0) {
				teste2[i] += vt[i] * 5;
			} else {
				teste2[i] += vt[i] + 5;
			}
			
			JOptionPane.showInputDialog("Resultado do �ndice " + (i + 1) + " do vetor 1 e 2 � respectivamente" + vt[i] + " e " + teste2[i]);
		}
		 
		
	 }
	
}