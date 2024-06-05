package instanciaclasse.transito;
/*
	Descrição: Criar uma classe trânsito (que contém codigo, nome, e quantidade de acidentes da cidade) e o método 
	(ClasseMétodos) que possa passar os valores de 5 ocorrências do objeto e poder consultá-las e fazer estastísticas
	Data: 30/04/2024
	Programador: Gustavo Pereira
	Versão: 1 (a 0.1 era antes da utilização da manipulação de arquivos)
*/
import java.io.IOException;
import javax.swing.*;
class ClassePrincipal {  
	
	public static void main ( String[] args ) throws IOException{
	   
	   Transito[ ] transito = new Transito[5]; 
	   
	   ClasseMetodos m = new ClasseMetodos();
	   
	   int i;
	
	   for(i = 0 ; i < 5; i++){
		   transito[i] = new Transito(); 
	   }
	 
	   int opc = 0 ;
	   while (opc!=9){
	      opc = Integer.parseInt(JOptionPane.showInputDialog
	              ("1 -  Cadastro Estat�stica \n 2 - Consulta por quantidade de acidentes \n 3 - Consulta por estatísticas de acidentes \n 4 - Acidentes acima da média das 10 cidades \n 9 - Finaliza"));
	      switch (opc) {
	            case 1:  
	            	transito = m.FCadastraEstatistica(transito); 
	                break;
	            case 2: 
	            	m.PQtdaAcidentes(transito); 
	            	break;
	            case 3: 
	            	m.PMaiorMenor(transito); 
                	break;
	            case 4: 
	            	m.PacIma(transito); 
	            	break;
	            case 9: 
	            	JOptionPane.showMessageDialog(null,"Programa finalizado");
	                break;
	            default: 
	            	JOptionPane.showMessageDialog(null,"Opção Inválida");
	      } 
	  }
	  
	}
}   
