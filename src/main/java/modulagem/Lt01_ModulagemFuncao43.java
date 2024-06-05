package modulagem;
/*
  Descrição: Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano (em função)
  Data: 12/03/2024
  Programador: Gustavo Pereira
  Versão: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_ModulagemFuncao43 {
	static int anos = 0;
	static double ana = 1.10, maria = 1.5;
	
	public static void main(String args[]) {		
		
		anos = quantidadeAnos();
		JOptionPane.showMessageDialog(null,"A quantidade de anos para que a Ana seja maior que a Maria é: " + anos);
		
	}
	
	static int quantidadeAnos() {
		while(ana <= maria) {
			ana = ana + 0.03;
			maria = maria + 0.02;
			anos++;
		}
		return anos;
	}
}
