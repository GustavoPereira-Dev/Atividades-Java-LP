package estruturasequencial;
/*
  Descrição: Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos
  Data: 27/02/2024
  Programador: Gustavo Pereira
  Vers�o: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstDecisao30 {
	public static void main(String args[]) {
		int anoNasc, mesNasc, diaNasc, anoAt, mesAt, diaAt, anoRes, mesRes, diaRes;
		
		anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
		mesNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o m�s de nascimento: "));
		diaNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de nascimento: "));
		anoAt = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		mesAt = Integer.parseInt(JOptionPane.showInputDialog("Digite o m�s atual: "));
		diaAt = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia atual: "));
		
		if(mesAt - mesNasc < 0) {
			mesRes = (mesAt - mesNasc) + 12;
			anoRes = (anoAt - anoNasc) - 1;
		} else {
			mesRes = (mesAt - mesNasc);
			anoRes = (anoAt - anoNasc);
		}
		
		if(diaAt - diaNasc < 0) {
			if(anoAt % 4 == 0 && anoAt % 100 != 0 && mesAt - 1 == 2 || anoAt % 400 == 0 && anoAt % 100 == 0 && mesAt - 1 == 2) {
				diaRes = (diaAt - diaNasc) + 29;
			} else if(anoAt % 4 == 0 && anoAt % 100 == 0 && mesAt - 1 == 2 || anoAt % 400 != 0 && anoAt % 100 != 0 && mesAt - 1 == 2) {
				diaRes = (diaAt - diaNasc) + 28;
			} else if(mesAt % 2 == 1 && mesAt < 8 || mesAt % 2 == 0 && mesAt > 7) {
				diaRes = (diaAt - diaNasc) + 30;
			} else {
				diaRes = (diaAt - diaNasc) + 31;
			}
		} else {
			diaRes = diaAt - diaNasc;
		}
		
		JOptionPane.showMessageDialog(null,"O resultado de sua idade é de " + anoRes + " anos, " + mesRes  + " mes(es) e" + diaRes + " dia(s)");
	}
}
