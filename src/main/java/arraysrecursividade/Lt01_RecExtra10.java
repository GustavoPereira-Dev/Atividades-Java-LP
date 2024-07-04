package arraysrecursividade;
/*
	Descrição: Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano (em função recursiva)
	Data: 01/07/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/

public class Lt01_RecExtra10 {
	public static void main(String args[]) {
		System.out.println(quantidadeAnos(1.10, 1.5));
	}
	
	static int quantidadeAnos(double ana, double maria) {
		int anos = 0;
		if(ana >= maria) {
			return 0;
		}
		
		anos = 1 + quantidadeAnos(ana + 0.03, maria + 0.02);
		return anos;
	
	}
}
