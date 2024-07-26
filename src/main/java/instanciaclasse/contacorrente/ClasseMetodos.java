package instanciaclasse.contacorrente;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class ClasseMetodos {
	private static class InstanceHolder {
		public static ClasseMetodos instancia = new ClasseMetodos();
	}
	
	public static ClasseMetodos getInstancia() {
		return InstanceHolder.instancia;
	}
	
	public ContaCorrente[] FCadastraContas(ContaCorrente[] cliente) throws IOException {
		int i;
		String[] tipoConta = {"1","2","3","4"};
		
		for(i = 0; i < 5; i++) {
			cliente[i] = new ContaCorrente();
			cliente[i].codConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da conta corrente do cliente"));
			cliente[i].nmeCl = JOptionPane.showInputDialog("Digite o nome do cliente");
			cliente[i].sConta = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta corrente do cliente"));
			cliente[i].lConta = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta corrente do cliente"));
			cliente[i].tConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo da conta corrente do cliente"));
			if(!Arrays.asList(tipoConta).contains(Integer.toString(cliente[i].tConta))) {
				System.out.println("O tipo de conta específica não existe!");
				i--;
			}
		}
		
		cliente = classificaConta(cliente);
		
		String fileName = "ContaCorrente.txt";	
		BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));	
		    
		    
		System.out.println("-------------------------------------------------------------------");
		for (i = 0 ; i < 5 ; i++){
				
			writer.write(Integer.toString(cliente[i].codConta));
			writer.newLine();
				
			writer.write(cliente[i].nmeCl);
			writer.newLine();
				
			writer.write(Double.toString(cliente[i].sConta));
			writer.newLine();
			
			writer.write(Double.toString(cliente[i].lConta));
			writer.newLine();
			
			writer.write(Integer.toString(cliente[i].tConta));
			writer.newLine();
		}
		   writer.close();
		   
		   System.out.println("arquivo ContaCorrente gerado e cadastro feito");
		   return cliente;
		
		
	}
	
	public MovimentoConta[] FCadastraMovimento(MovimentoConta[] movConta, ContaCorrente[] cliente) throws IOException{
		int i;
		String[] tipoMov = {"1","2"};
		for(i = 0; i < 10; i++) {
			movConta[i] = new MovimentoConta();
			movConta[i].codConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do movimento da Conta"));
			movConta[i].vlMov = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do movimento da Conta"));
			movConta[i].tpMov = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo do movimento da Conta"));
			movConta[i].status = Integer.parseInt(JOptionPane.showInputDialog("Digite o status do movimento da Conta"));
			if(!Arrays.asList(tipoMov).contains(Integer.toString(cliente[i].tConta))) {
				System.out.println("O tipo de movimento específico não existe!");
				i--;
			}
		}
		
		movConta = classificaMovimento(movConta);
		
		String fileName = "MovimentoConta.txt";	
		BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));	
		    
		    
		System.out.println("-------------------------------------------------------------------");
		for (i = 0 ; i < 10; i++){
				
			writer.write(Integer.toString(movConta[i].codConta));
			writer.newLine();
				
			writer.write(Double.toString(movConta[i].vlMov));
			writer.newLine();
				
			writer.write(Integer.toString(movConta[i].tpMov));
			writer.newLine();
			
			writer.write(Integer.toString(movConta[i].status));
			writer.newLine();
		}

		   writer.close();
		   
		   System.out.println("arquivo MovimentoConta gerado e cadastro feito");
		   return movConta;
	}
	
	public ContaCorrente[] classificaConta(ContaCorrente[] cliente) {
		ContaCorrente aux = new ContaCorrente();
		int i, j;
		for(i = 0; i < cliente.length - 1; i++) {
			for(j = i + 1; j < cliente.length; j++) {
				if(cliente[i].codConta > cliente[j].codConta) {
					aux = cliente[i];
					cliente[i] = cliente[j];
				}
			}
		}
		
		return cliente;
	}
	
	public void ContaAtualizada(ContaCorrente[] conta, MovimentoConta[] movConta, ContaCorrente[] atualizado) throws IOException{
		String fileName = "ContaCorrente.txt";	
		boolean par = false;
		double limiteConta = 0.0, valorSaque = 0.0;
		
		BufferedReader ler1 = new BufferedReader(new FileReader(fileName));
		fileName = "MovimentoConta.txt";
		BufferedReader ler2 = new BufferedReader(new FileReader(fileName));
		int i;
		
		for(i = 0; i < 10; i++) {
			if(i < 5) {
				conta[i] = new ContaCorrente();
				conta[i].codConta = Integer.parseInt(ler1.readLine());
				conta[i].nmeCl = ler1.readLine();
				conta[i].sConta = Double.parseDouble(ler1.readLine());
				conta[i].lConta = Double.parseDouble(ler1.readLine());
				conta[i].tConta = Integer.parseInt(ler1.readLine());
			}
			movConta[i] = new MovimentoConta();
			movConta[i].codConta = Integer.parseInt(ler2.readLine());
			movConta[i].vlMov = Double.parseDouble(ler2.readLine());
			movConta[i].tpMov = Integer.parseInt(ler2.readLine());
			movConta[i].status = Integer.parseInt(ler2.readLine());
		}
		
		ler1.close();
		ler2.close();
		
		fileName = "ContasAtualizadas.txt";
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
		for(i = 0; i < 5; i++) {
			for(MovimentoConta m: movConta) {
				// 1
				if(m.codConta == conta[i].codConta) {
					
					switch(m.status) {
					// 1.1
					case 1:
						valorSaque = conta[i].sConta + m.vlMov;
					// 1.2
					case 2:
						valorSaque = conta[i].sConta - m.vlMov;
						par = true;
						// 1.2.1
						if(conta[i].sConta < m.vlMov) {
							
							switch(conta[i].tConta) {
								case 1:
									limiteConta = 0.0;
									break;
								case 2:
									limiteConta = conta[i].lConta;
									break;
								case 3:
									limiteConta = conta[i].lConta + (0.5 * conta[i].sConta);
									break;
								case 4:
									limiteConta = conta[i].lConta + conta[i].sConta;
									break;
							}
							valorSaque += limiteConta; 

						} 
						// 1.2.2 (não alterar o valorSaque pois o mesmo não será negativado
					} 
					
					// 2 (manter do jeito que estava antes)
					
					
					writer.write(Integer.toString(conta[i].codConta));
					writer.newLine();
					
					writer.write(conta[i].nmeCl);
					writer.newLine();
					
					writer.write(Double.toString(valorSaque));
					writer.newLine();
					
					writer.write(Double.toString(limiteConta));
					writer.newLine();
					
					writer.write(Integer.toString(conta[i].tConta));
					writer.newLine();
					
					limiteConta = 0.0; 
					valorSaque = 0.0;
					break;
				} else if(m.codConta < conta[i].codConta) {
					writer.write(Integer.toString(conta[i].codConta));
					writer.newLine();
					
					writer.write(conta[i].nmeCl);
					writer.newLine();
					
					writer.write(Double.toString(conta[i].sConta));
					writer.newLine();
					
					writer.write(Double.toString(conta[i].lConta));
					writer.newLine();
					
					writer.write(Integer.toString(conta[i].tConta));
					writer.newLine();
					break;
				} 
				
			}
			
			
		}
		
		writer.close();
		
	}
	
	public MovimentoConta[] classificaMovimento(MovimentoConta[] movConta) {
		MovimentoConta aux = new MovimentoConta();
		int i, j;
		for(i = 0; i < movConta.length - 1; i++) {
			for(j = i + 1; j < movConta.length; j++) {
				if(movConta[i].codConta > movConta[j].codConta) {
					aux = movConta[i];
					movConta[i] = movConta[j];
					movConta[j] = aux;
				}
			}
		}
		
		return movConta;
	}
	
	
	public void consultaContaCorrente(ContaCorrente[] cliente, int par) throws IOException{
		String fileName = "";
		if(par == 0) fileName = "ContaCorrente.txt";
		if(par == 1) fileName = "ContasAtualizadas.txt";
		
		BufferedReader ler = new BufferedReader(new FileReader(fileName));
		int i;
		
		for(i = 0; i < 5; i++) {
			cliente[i] = new ContaCorrente();
			cliente[i].codConta = Integer.parseInt(ler.readLine());
			cliente[i].nmeCl = ler.readLine();
			cliente[i].sConta = Double.parseDouble(ler.readLine());
			cliente[i].lConta = Double.parseDouble(ler.readLine());
			cliente[i].tConta = Integer.parseInt(ler.readLine());
			System.out.println("código da Conta: " + cliente[i].codConta + " nome do cliente" +  cliente[i].nmeCl + " "
					+ "saldo da Conta: " + cliente[i].sConta + " limite da Conta: " + cliente[i].lConta + " tipo da Conta: " + cliente[i].tConta);
		}
		
		ler.close();
	}
	
	public void consultaMovimentoConta(MovimentoConta[] movConta) throws IOException{
		String fileName = "MovimentoConta.txt";	
		BufferedReader ler = new BufferedReader(new FileReader(fileName));
		int i;
		
		for(i = 0; i < 10; i++) {
			movConta[i] = new MovimentoConta();
			movConta[i].codConta = Integer.parseInt(ler.readLine());
			movConta[i].vlMov = Double.parseDouble(ler.readLine());
			movConta[i].tpMov = Integer.parseInt(ler.readLine());
			movConta[i].status = Integer.parseInt(ler.readLine());
			System.out.println("código da Conta: " + movConta[i].codConta + " valor do movimento" +  movConta[i].vlMov + " "
					+ "tipo do movimento: " + movConta[i].tpMov + " status do movimento: " + movConta[i].status);
		}
		
		ler.close();
	}
	
	
}
