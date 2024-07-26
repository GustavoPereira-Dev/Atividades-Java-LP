package instanciaclasse.votacao;
/*
	Descrição: Criar uma classe Votação2024 (que contém número da seção e o código do candidato) e os métodos
	(ClasseMétodos) que possa passar os valores de 200 ocorrências do objeto e poder consultá-las e ver indicadores
	Data: 07/05/2024
	Programador: Gustavo Pereira
	Versão: 0.1
*/
import java.io.IOException;
import javax.swing.*;
class ClassePrincipal {   //  CLASSE PRINCIPAL
	
	public static void main (String[] args ) throws IOException{
		   
		   // INSTANCIA DA CLASSE ABSTRATA COM 3 REGISTROS TIPO VETOR 
		   Votacao2024[] votacao = new Votacao2024[200]; 
		   
		   // INSTANCIA DA CLASSE M�TODOS
		   ClasseMetodos m = ClasseMetodos.getInstancia();
		   
		    int i;
		
		  // EXECUCAO DO METODO CONSTRUTOR
		  for (i = 0 ; i < 200; i++){
			  votacao[i] = new Votacao2024(); 
		  }
		 
		  int opc = 0 ;
		  while (opc!=9){
		     opc = Integer.parseInt(JOptionPane.showInputDialog
		              ("1 -  Carregar Secao/Numero Eleitor \n 2- Classifcar por Secao \n 3 - Gravar Registros \n 4 - Mostrar Indicadores \n 9 - Finalizar"));
		     switch (opc) {
		            case 1:  
		            	votacao = m.FCadastraVotacao(votacao);
		                break;
		            case 2: 
		            	votacao = m.FClassificaSecao(votacao);
		            	break;
		            case 3: 
		            	votacao = m.FGravaVotacao(votacao);
	                	break;
		            case 4: 
		            	Indicadores(votacao, m);
		            	break;
		            case 9: 
		            	JOptionPane.showMessageDialog(null,"Programa finalizado");
		            	System.exit(1);
		                break;
		            default: 
		            	JOptionPane.showMessageDialog(null,"Opcao Invalida");
		         } // FECHA SWITCH
		  }  // FECHA WHILE
		  
		}
	
	static void Indicadores(Votacao2024[] votacao, ClasseMetodos m) {
		int opc;
		opc = Integer.parseInt(JOptionPane.showInputDialog
	              (" 1 - Quantidade Eleitores por Secao \n 2 - Secao com Maior e Menor numero de Eleitores \n 3 - Quantidade de votos por canditdato \n 4 - 10 primeiros colocadas (nro cand. e qtd votos) \n 9 - Finaliza consulta"));
		switch (opc) {
	        case 1:  
	        	m.EleitoresPSecao(votacao);
	            break;
	        case 2: 
	        	m.SecaoMenorEMaiorEleitores(votacao);
	        	break;
	        case 3: 
	        	m.VotosPorCandidato(votacao);
	        	break;
	        case 4: 
	        	m.CandidatosMaisVotados(votacao);
	        	break;
	        case 9: 
	        	JOptionPane.showMessageDialog(null,"Saindo do Indicadores");
	            break;
	        default: 
	        	JOptionPane.showMessageDialog(null,"Opcao Invalida");
		} // FECHA SWITCH
	}
}   // FECHA CLASSE PRINCIPAL
