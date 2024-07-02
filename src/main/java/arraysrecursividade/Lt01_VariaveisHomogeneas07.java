package arraysrecursividade;
/*
  Descrição: Criar e coletar um vetor [50] inteiro. Calcular e exibir:
  a. A média dos valores entre 10 e 200;
  b. A soma dos números ímpares.
  Data: 26/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_VariaveisHomogeneas07 {
	public static void main(String args[]) {
		float media;
		
		media = adicionarValores();
		
		JOptionPane.showMessageDialog(null,"A m�dia dos valores entre 10 e 200 é: " + media); 
	}
	
	static float adicionarValores() {
		int[] vt = new int[50];
		int i = 0, cMed = 0, sImp = 0;
		float med = 0;
		
		for(i = 0; i < 50; i++) {
			vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º índice"));
			if(vt[i] > 9 && vt[i] < 201) {
				cMed++;
				med += vt[i];
			}
			if(vt[i] % 2 == 1) {
				sImp += sImp + vt[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, "Soma dos ímpares: " + sImp);
		
		if(cMed == 0) return 0;
		return med / cMed;
	}
	// static tipo[ ] vetor(){}
	
}