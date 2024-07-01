package estruturasequencial;
/*
  Descrição: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde: Casa: 1 2 3 4 ... 64 Qdte: 1 2 4 8 ... N
  Data: 05/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
import java.math.BigInteger;
public class Lt01_EstRepeticao39 {
	public static void main(String args[]) {
		int casa;
		BigInteger graos = new BigInteger("1");
		
		for(casa = 1; casa < 64; casa++) {
			graos = graos.multiply(new BigInteger("2"));
		}
		
		JOptionPane.showMessageDialog(null,"O resultado dos grãos é: " + graos);
		
	}
}
