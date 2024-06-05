package instanciaclasse.aluno;
/*
	Descrição: Criar uma classe aluno (que contém o nome, sobrenome e nota do aluno(a)) e o método 
	(ClasseMétodos) que possa passar os valores de 3 ocorrências do objeto e poder consultá-las
	Data: 30/04/2024
	Programador: Gustavo Pereira
	Versão: 1 (a 0.1 era antes da utilização da manipulação de arquivos)
*/
import java.io.IOException;
import javax.swing.*;
class ClassePrincipal {  
	public static void main ( String[] args ) throws IOException {
	   Aluno[ ] aluno = new Aluno[3]; 
	   
	   ClasseMetodos m = new ClasseMetodos();
	   
	   int i;
	
	   for (i = 0 ; i < 3 ; i++){
		   aluno[i] = new Aluno(); }
	 
	   int opc = 0 ;
	   while (opc!=9){
		   opc = Integer.parseInt(JOptionPane.showInputDialog
	       ("1 -  Cadastra Alunos \n 2 - Consulta Registros \n 9 - Finaliza"));
		   switch (opc) {
	        	case 1:  aluno = m.FCadastra(aluno); 
	            	break;
	            case 2: m.FConsulta(aluno);
	                break;
	            case 9:  JOptionPane.showMessageDialog(null,"Programa finalizado");
	                break;
	            default: JOptionPane.showMessageDialog(null,"Opção Inválida");
	            	break;
		   }
	   }  
	}   
}  
