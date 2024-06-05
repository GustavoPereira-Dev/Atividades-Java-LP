package instanciaclasse.contacorrente;

import java.io.IOException;

import javax.swing.JOptionPane;


/*
	Descrição: Criar uma classe ContaCorrente (que contém código, nome, saldo, limite e tipo da conta do usuário) e MovimentoConta (que contém 
	código da conta, valor, tipo e status do movimento) e os métodos (ClasseMétodos) que possa passar os valores das ocorrências dos objetos e poder consultá-las
	Data: 28/05/2024
	Programador: Gustavo Pereira
	Versão: 1
*/
public class ClassePrincipal {
	static ClasseMetodos m = new ClasseMetodos();
	public static void main(String args[]) throws IOException {
		ContaCorrente[] conta = new ContaCorrente[5];
		MovimentoConta[] movConta = new MovimentoConta[10];
		ContaCorrente[] contasAtualizadas = new ContaCorrente[5];
		int i, opc;
		
		for(i = 0; i < 10; i++) {
			if(i < 5) {
				movConta[i] = new MovimentoConta();
			}
			conta[i] = new ContaCorrente();
			contasAtualizadas[i] = new ContaCorrente();
		}
		
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Cadastra Contas \n 2 - Cadastra Movimento 1 e 2 \n 3 - Conta Atualizada \n 4 - Consulta Cadastros \n 9 - FIM "));
			switch(opc) {
				case 1:
					conta = m.FCadastraContas(conta);
					break;
				case 2:
					movConta = m.FCadastraMovimento(movConta, conta);
					break;
				case 3:
					 m.ContaAtualizada(conta, movConta, contasAtualizadas);
					break;
				case 4:
					ConsultaCadastro(conta, movConta, contasAtualizadas);
					break;
					
			}
		
		/*
				 ......................................................
		.                MENU PRINCIPAL           .
		......................................................
		. 1 - Cadastra Contas Correntes    . 
		. 2 - Cadastra movimento              .
		. 3 - Gera Contas Atualizadas       .
		. 4 - Consulta cadastros                .
		. 9 - FIM                                           .
		....................................................
		
		
		............................................
		.    Consulta Cadastros         .
		...........................................
		. 1 - Contas Correntes         .
		. 2 - Movimento                   .
		. 3 - Atualizado                    .
		. 9 - FIM                                .
		..........................................

		 */
		} while(true);
		
	}
	
	public static void ConsultaCadastro(ContaCorrente[] conta, MovimentoConta[] movConta, ContaCorrente[] contasAtualizadas) throws IOException {
		int opc;
		opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Contas Correntes 1 \n 2 - Movimento \n 3 - Atualizado \n 9 - FIM"));
		switch(opc) {
			case 1:
				m.consultaContaCorrente(conta, 0);
				break;
			case 2: 
				m.consultaMovimentoConta(movConta);
				break;
			case 3: 
				m.consultaContaCorrente(conta, 1);
				break;
		}
	}
}
