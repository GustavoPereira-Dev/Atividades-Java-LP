package instanciaclasse.extra_jogos;

import javax.swing.JOptionPane;
import java.io.IOException;


public class ClassePrincipal {
	public static void main(String args[]) throws IOException{
		Jogo[] jogos = new Jogo[5];
		ResumoJogos[] rJogos = new ResumoJogos[5];
		ClasseMetodos m = new ClasseMetodos();
		
		int i, opc, id;
		
		for(i = 0; i < jogos.length; i++) {
			jogos[i] = new Jogo();
			rJogos[i] = new ResumoJogos();
		}
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Cadastra Jogos: \n 2 - Resumir Jogos \n 3 - Ordenar Jogos \n 4 - Pesquisar Jogos"
					+ "\n 5 - Mostrar Jogos \n 6 - Mostrar resumo jogosD"));
			// CadastraJogos, ResumirJogos, Ordenar Jogos,pesquisarJogos, Mostrar Jogos, Mostrar Resumo Jogos
			switch(opc) {
				case 1:
					jogos = m.FCadastraJogos(jogos);
					break;
				case 2:
					rJogos = m.FResumirJogos(rJogos, jogos);
					break;
				case 3:
					jogos = m.FAlinharJogos(jogos);
					break;
				case 4:
					id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do jogo que procura: "));
					JOptionPane.showMessageDialog(null, m.pesquisaJogo(m.FAlinharJogos(jogos), id, 0));
					break;
				case 5:
					m.mostrarJogos(jogos);
					break;
				case 6:
					m.mostrarResumoJogos(rJogos);
					break;
				case 7:
					JOptionPane.showInputDialog("Saindo...");
					break;
				default:
					JOptionPane.showInputDialog("Valor inválido! ");
					break;
			}
		} while(opc != 7);
	}
}
