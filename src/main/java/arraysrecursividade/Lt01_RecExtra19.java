package arraysrecursividade;

/*
	Descrição: Faça um bubble sort que retorne os valores de 20 índices desalinhados de um vetor em ordem crescente (em funções recursivas)
	Data: 01/07/2024
	Programador: Gustavo Pereira
	Vers�o: 0.1
*/

import javax.swing.JOptionPane;
public class Lt01_RecExtra19 {

    public static void main(String args[]) {
        int[] vt = new int[20];
        vt = lerVetor(vt, 19);
        vt = bSort1(vt, 19);
        for (int i = 0; i < 20; i++) {
            System.out.println(vt[i]);
        }
    }

    static int[] bSort1(int[] vt, int i) {
        if (i < 0) {
            return vt;
        }

        bSort2(vt, 0, i);
        bSort1(vt, i - 1);
        return vt;
    }

    static int[] bSort2(int[] vt, int i, int j) {
        int aux;
        if (j <= i) {
            return vt;
        }

        bSort2(vt, i, j - 1);
        if (vt[j] < vt[j - 1]) {
            aux = vt[j];
            vt[j] = vt[j - 1];
            vt[j - 1] = aux;
            bSort2(vt, i, j - 1); 
        }
        return vt;
    }

    static int[] lerVetor(int[] vt, int i) {
        if (i < 0) {
            return vt;
        }

        lerVetor(vt, i - 1);
        vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º índice:"));

        return vt;
    }
}


