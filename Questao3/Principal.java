package Questao3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int opcao;
		
	
    System.out.println("*****************ACESSO A MULTIFUNCIONAL***************");
    System.out.println("*******************SELECIONE SUA OPÇÃO********************");
    System.out.println("1 - IMPRESSORA");
    System.out.println("2 - DIGITALIZADOR");
    System.out.println("**********************************************************");
    opcao = leitor.nextInt();
    System.out.println("**********************************************************");
	 
    if(opcao == 1) {
    	
    	Multifuncional i = new Impressora();	
    	i.imprimir();
    	
    }
    else if(opcao == 2) {
    	
    	Multifuncional s = new Digitalizador();	
    	s.imprimir();
    }
    else
    {
    	System.out.println("Acesso não encontrado");
    }
    
			leitor.close();
}
		

}


