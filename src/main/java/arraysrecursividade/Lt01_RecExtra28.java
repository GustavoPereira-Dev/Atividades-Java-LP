package arraysrecursividade;
/*
	Descrição: Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
	1  1  1  1  1  1  1  1 
	1  2  2  2  2  2  2  1
	1  2  3  3  3  3  2  1
	1  2  3  4  4  3  2  1
	1  2  3  4  4  3  2  1
	1  2  3  3  3  3  2  1
	1  2  2  2  2  2  2  1
	1  1  1  1  1  1  1  1 
	(Em funções recursivas)
	Data: 02/07/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/


public class Lt01_RecExtra28 {
	public static void main(String args[]) {
		int[][] mt = new int[8][8];
		
		mt = lerLimiteMatriz(mt,4);
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print(mt[i][j] + " ");
				
			}
			System.out.println("\n");
		}
	}
	
	public static int[][] lerLimiteMatriz(int[][] mt, int z){
		if(z < 1) {
			return mt;
		}
		
		lerLimiteMatriz(mt,z - 1);
		lerLinhaMatriz(mt,z,8-z);
		
		return mt;
	}
	
	public static int[][] lerLinhaMatriz(int[][] mt, int z, int i){
		if(i < z - 1) {
			return mt;
		}
		
		lerLinhaMatriz(mt,z,i - 1);
		lerColunaMatriz(mt,z,i,8-z);
		
		return mt;
	}
	
	public static int[][] lerColunaMatriz(int[][] mt, int z, int i, int j){
		if(j < z - 1) {
			return mt;
		}
		
		lerColunaMatriz(mt,z,i,j - 1);
		mt[i][j] = z;
		
		return mt;
	}
}
