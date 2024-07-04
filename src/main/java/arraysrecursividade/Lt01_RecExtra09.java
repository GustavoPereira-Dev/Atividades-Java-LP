package arraysrecursividade;
import javax.swing.JOptionPane;
/*
	Descrição: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7 (em função)
	(Em recursiva)
	Data: 03/07/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/
public class Lt01_RecExtra09 {
	public static void main(String args[]) {
		JOptionPane.showMessageDialog(null,"A quantidade de possibilidades da soma de 2 dados terem como resultado 7 é: " + verificarPossibilidade1(7));
	}

	static int verificarPossibilidade1(int n1) {
		int pos = 0;
		if(n1 < 0) {
			return pos;
		}
		
		pos = verificarPossibilidade1(n1 - 1); 
		if(verificarPossibilidade2(n1,7) == 1) {
			pos++;
		}
		return pos;
	}
	
	static int verificarPossibilidade2(int n1, int n2) {
		int conf = 0;
		if(n2 < 0) {
			return conf;
		}
		
		conf = verificarPossibilidade2(n1, n2 - 1);
		if(n1 + n2 == 7) {
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			conf++;
		}
		
		
		return conf;
	}
}

