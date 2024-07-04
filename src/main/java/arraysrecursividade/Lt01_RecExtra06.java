package arraysrecursividade;
/*
	Descrição: Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos(em função recursiva)
	Data: 29/06/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/
import javax.swing.JOptionPane;
public class Lt01_RecExtra06{
	public static final int LIMITE_VETOR = 5;
	public static void main(String args[]) {
		int indx = 0;
		float[] vt = new float[LIMITE_VETOR];
		
		while(indx < LIMITE_VETOR) {
			vt[indx] = Float.parseFloat(JOptionPane.showInputDialog("Digite o número: "));
			indx++;
		}
		
		System.out.println("Maior: " + calcMaior(vt, LIMITE_VETOR - 1));
		System.out.println("Menor: " + calcMenor(vt, LIMITE_VETOR - 1));
		
		
	}
	
	static float calcMaior(float[] vt, int i) {
		float n;
		if(i < 0) {
			return Integer.MIN_VALUE;
		}
		
		n = calcMaior(vt, i - 1);
		if(i == 0 || vt[i] > n) {
			n = vt[i];
		} 
		
		return n;
	}
	
	static float calcMenor(float[] vt, int i) {
		float n;
		if(i < 0) {
			return Integer.MAX_VALUE;
		}
		
		n = calcMenor(vt, i - 1);
		if(i == 0 || vt[i] < n) {
			n = vt[i];
		} 
		
		return n;
	}
}