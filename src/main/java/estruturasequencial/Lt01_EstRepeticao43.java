package estruturasequencial;
/*
  Descrição: Calcule e mostre quantos anos ser�o necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano
  Data: 05/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_EstRepeticao43 {
	public static void main(String args[]) {
		int anos = 0;
		double ana = 1.10, maria = 1.5;
		
		while(ana <= maria) {
			ana = ana + 0.03;
			maria = maria + 0.02;
			anos++;
		}
		
		JOptionPane.showMessageDialog(null,"A quantidade de anos para que a Ana seja maior que a Maria é: " + anos);
		
	}
}
