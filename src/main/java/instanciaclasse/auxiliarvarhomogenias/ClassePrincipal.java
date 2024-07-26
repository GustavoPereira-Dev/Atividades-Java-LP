package instanciaclasse.auxiliarvarhomogenias;
/*
	Descrição: Desenvolvimento de uma classe Principal (main) com a de Métodos com o objetivo de manipulação de Vetores 
	Extra: Foi desenvolvido também funções com o objetivo de manipular matrizes bidimensionais da mesma forma que os vetores
	Data: 16/04/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/
import javax.swing.JOptionPane;
public class ClassePrincipal {
	public static void main (String arg [ ]) {
		ClasseMetodos m = ClasseMetodos.getInstancia();
	      int opc = 0;
	      String[] tamanho = JOptionPane.showInputDialog("Digite o tamanho do Vetor e da Matriz que deseja ter (Ex: 4 de vetor, 3 e 4 de Matriz ou 3 x 4").split(" ");
	      int vetor[] = new int[Integer.parseInt(tamanho[0])];
	      int matriz[][] = new int[Integer.parseInt(tamanho[1])][Integer.parseInt(tamanho[2])];
	      
	     
	     while (opc != 9){
		      opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor \n 2 - Classifica Vetor \n 3 - Mostra Vetor \n 4 - Carrega Matriz \n 5 - Classifica Matriz \n 6 - Mostra Matriz \n 9 - Fim"));
		      switch (opc){
		            case 1:
		            	vetor = m.CarregaVetor(vetor);
		                break;
		            case 2:
		               	vetor = m.ClassificaVetor(vetor);
		                JOptionPane.showMessageDialog(null,"Vetor Classificado");
		                break;
		            case 3:
		                m.MostraVetor(vetor);
		                break;
		            case 4:
		            	matriz = m.CarregaMatriz(matriz);
		                break;
		            case 5:
		               	matriz = m.ClassificaMatriz(matriz);  
		                JOptionPane.showMessageDialog(null,"Matriz Classificada");
		                break;
		            case 6:
		                m.MostraMatriz(matriz);
		                break;
		            case 9:
		                 JOptionPane.showMessageDialog(null,"FIM");
		                 System.exit(0);
		                 break;
		            default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
		      }
	     
	      
	     }
	}
}
