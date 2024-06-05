package modulagem;
/*
  Descrição: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
  	a. Se a média for >= 6,0 exibir APROVADO;
	b. Se a média for >= 3,0 ou < 6,0 exibir EXAME;
	c. Se a média for < 3,0 exibir RETIDO.
   (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure21 {
	static float media;
	public static void main(String args[]) {
		float nota1, nota2, nota3, nota4;
		
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da 1º nota: "));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da 2º nota: "));
		nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da 3º nota: "));
		nota4 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da 4º nota: "));
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		verificaMedia();
		
		
	}
	
	static void verificaMedia() {
		if(media >= 6) {
			JOptionPane.showMessageDialog(null,"APROVADO");
		} else if(media >= 3 && media < 6) {
			JOptionPane.showMessageDialog(null,"EXAME");
		} else {
			JOptionPane.showMessageDialog(null,"RETIDO");
		}
	}
}
