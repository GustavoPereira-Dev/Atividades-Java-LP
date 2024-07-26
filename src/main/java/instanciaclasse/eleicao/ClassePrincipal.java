package instanciaclasse.eleicao;
/*
	Descrição: Criar uma instância vota1, vota2, apuração (que contém a seção, o número do eleitor e o código do candidato da votação) e a eleitor(que contém o número, seção e nome do eleitor da seção) 
	e os métodos (ClasseMétodos) que possa passar os valores de 5 ocorrências do objeto vota1 e vota2, que serão meclados no final pelo apuração e 10 ocorrências do objeto eleitor 
	(que está entralaçado no Vota1 e Vota2 sabendo que para cada sequência de seção só podem ter 5 para cada um
	Vota1 = seções 1, 3 e 4
	Vota2 = seções 5, 9 e 10 
	Após tudo isso, dar a possibilidade do usuário ver todas as votações, eleitores e dados da eleição
	Data: 14/05/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/
import javax.swing.JOptionPane;
import java.io.IOException;

public class ClassePrincipal {
	static ClasseMetodos m = ClasseMetodos.getInstancia();
	public static void main(String args[]) throws IOException {
		
		Eleitor[] eleitores = new Eleitor[10];
		Vota[] vota1 = new Vota[5];
		Vota[] vota2 = new Vota[5];
		Vota[] apuracao = new Vota[10];
		
		
		int opc, i;
		
		for(i = 0; i < 10; i++) {
			if(i < 5) {
				vota1[i] = new Vota();
				vota2[i] = new Vota();
			}
			apuracao[i] = new Vota();
			eleitores[i] = new Eleitor();
		}
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Cadastra Eleitor \n 2 - Cadastra Votação 1 e 2 \n 3 - Agrupa Apuração \n 4 - Menu Estatística \n 9 - FIM "));
			switch(opc) {
				case 1:
					eleitores = m.FEleitor(eleitores);
					break;
				case 2:
					CadastroVotacao(vota1, vota2, eleitores);
					break;
				case 3:
					apuracao = m.FApura(apuracao);
					break;
				case 4:
					MenuEstatistica(apuracao, eleitores);
					break;
				case 9:
					System.exit(1);
					break;
					
			}
		
		
		} while(true);
		
	}
	
	public static void CadastroVotacao(Vota[] votacao1, Vota[] votacao2, Eleitor[] eleitores) throws IOException {
		int opc;
		opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Cadastro Votação 1 \n 2 - Cadastro Votação 2 \n 9 - FIM"));
		switch(opc) {
			case 1:
				votacao1 = m.FVota1(votacao1, eleitores);
				break;
			case 2:
				votacao2 = m.FVota2(votacao2, eleitores);
				break;
			case 9:
				System.exit(1);
				break;
		}
	}
	
	public static void MenuEstatistica(Vota[] apuracao, Eleitor[] eleitores) throws IOException{
		int opc;
		opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Vencedor \n 2 - Segundo colocado \n 3 - Votos em branco \n 4 - Votos nulos \n 5 - Mostra Eleitores \n 6 - Apuração \n 9 - FIM"));
		switch(opc) {
			case 1:
				m.Vencedor(apuracao);
				break;
			case 2:
				m.SegundoColocado(apuracao);
				break;
			case 3:
				m.VotosBranco(apuracao);
				break;
			case 4:
				m.VotosNulos(apuracao);
				break;
			case 5:
				m.MostraEleitores(eleitores);
				break;
			case 6:
				m.MostraApuracao(apuracao);
				break;
			case 9:
				System.exit(1);
				break;
		}
	}
}
