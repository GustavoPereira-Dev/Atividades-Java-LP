package modulagem;
/*
  Descrição: Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos (em procedimento)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemProcedure30 {
	static int anoNasc, mesNasc, diaNasc, anoAt, mesAt, diaAt;
	public static void main(String args[]) {
		anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
		mesNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de nascimento: "));
		diaNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de nascimento: "));
		anoAt = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		mesAt = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês atual: "));
		diaAt = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia atual: "));
		
		calcularData();
	}
	
	static void calcularData() {
		int anoRes, mesRes, diaRes;
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
