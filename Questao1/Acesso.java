package Questao1;

import java.util.Scanner;

public class Acesso {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int opcao;
		
		System.out.println("*****************SISTEMA DE ACESSO DE PORTA***************");
	    System.out.println("*******************SELECIONE SUA OPÇÃO********************");
	    System.out.println("1 - CHAVE");
	    System.out.println("2 - CARTÃO");
	    System.out.println("3 - BIOMETRIA");
	    System.out.println("**********************************************************");
	    opcao = leitor.nextInt();
	    System.out.println("**********************************************************");
	    
	    if(opcao == 1) {
	    	
	    	Chave chave = new Chave();
	    	chave.setIdChave(123);
	    	chave.Abrir();
	    }
	    else if(opcao == 2) {
	    	
	    	Chave cartao = new Cartao();
	    	cartao.setIdChave(456);
	    	cartao.Abrir();
	    }
	    else if(opcao == 3)
	    {
	    	Chave biometria = new Biometria();
	    	biometria.setIdChave(123457);
			biometria.Abrir();
			
	    }
	    else
	    {
	    	System.out.println("Acesso não encontrado");
	    }
	    
				leitor.close();
	}

}
