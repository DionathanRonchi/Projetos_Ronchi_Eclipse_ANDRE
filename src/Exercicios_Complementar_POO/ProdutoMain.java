package Exercicios_Complementar_POO;

import java.util.Scanner;

public class ProdutoMain {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	int opcao;
	Produto prod = new Produto();
		
	System.out.println("=== CADASTRO DE PRODUTOS ===");
			
do {
    System.out.println("1. Adicionar");
    System.out.println("2. Listar Produtos");
    System.out.println("3. Contar Produtos");
    System.out.println("0. Sair");
    System.out.print("Escolha: ");
	
	opcao = sc.nextInt();	
	sc.nextLine(); //Buzzer
	
	switch (opcao) {
	
	case 1:
		System.out.println("Adicionar produto");
	
	System.out.println("Nome: "); 
	String nome = sc.nextLine();
	
	System.out.println("Preço: ");
	double preco = sc.nextDouble();
	sc.nextLine(); //Buzzer

	
	System.out.println("Quantidade: ");
	int quantidade = sc.nextInt();
	sc.nextLine(); //Buzzer

	prod.adicionar(nome, preco, quantidade);
	break;
	
				
	case 2:
		prod.ListarTodos();
		break;
	
	case 3:
		System.out.println("Produtos: " + prod.contagem());
		break;
	
	case 0:
		System.out.println("Saindo.");
		break;
	}
	
	}while(opcao !=0);
	sc.close();
	
		}
	}