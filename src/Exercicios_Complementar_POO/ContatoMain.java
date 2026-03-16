package Exercicios_Complementar_POO;

import java.util.Scanner;

public class ContatoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	Contato cont = new Contato();
				
		int opcao;
		do {
			System.out.println("=== CADASTRO DE CONTATOS ===");
			System.out.println("1. Adicionar Contato");
		    System.out.println("2. Listar Contatos");
		    System.out.println("3. Buacar Por Contatos");
		    System.out.println("4. Remover Contato");
		    System.out.println("0. Sair");
		    System.out.print("Escolha: ");
		
			opcao = sc.nextInt();	
			sc.nextLine(); //Buzzer 
		
			switch(opcao) {
			case 1:
				System.out.println("Digite seu Nome: ");
				String nome = sc.nextLine();
					
				System.out.println("Digite seu telefone: ");
				String telefone = sc.nextLine();

				sc.nextLine();
	
				cont.adicionar(nome, telefone);
				break;
			
			case 2:
				cont.listar();
				break;
			  
			case 3:
                System.out.print("Nome para buscar: ");
                cont.buscarNome(sc.nextLine());
                break;
			
			case 4:
                  cont.removerContato();
                  break;
                  
              case 0:
                  System.out.println("Saindo...");
                  break;
			
		
              default:
                  System.out.println("Opção inválida!");
          }
          System.out.println(); 
      } while(opcao != 0);
      
      sc.close();
  }
}