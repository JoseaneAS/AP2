package Questao2;

import java.util.Scanner;

public class Estudio {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int opcao;
		
		
		Instrumento v = new Violao(1);
		Instrumento t = new Teclado(2);
		
		System.out.println("**************SISTEMA DE COMPOSIÇÃO MUSICAL***************");
	    System.out.println("*******************SELECIONE SUA OPÇÃO********************");
	    System.out.println("1 - ENTRA!");
	    System.out.println("2 - SAIR!");
	    System.out.println("**********************************************************");
	    opcao = leitor.nextInt();
	    System.out.println("**********************************************************");
	    
	    if(opcao == 1) {
	    	
	    	System.out.println("**************SEJA BEM VINDO(A)***************");
	    	System.out.println("PRIMEIROS ACORDES - VIOLÃO");
			v.tocar();
			System.out.println("SEGUNDOS ACORDES - TECLADO");
			t.tocar();
	    }
	    else
	    {
	    	System.out.println("SAIR");
	    }
	    
				leitor.close();
	}
		
		
		
	}

