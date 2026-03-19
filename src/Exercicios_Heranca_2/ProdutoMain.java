package Exercicios_Heranca_2;

import java.util.Scanner;

public class ProdutoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	
System.out.println("=== DADOS DO PRODUTO LIVRO===");	
	
	System.out.print("Nome: ");
	String nome = sc.nextLine();
	
	System.out.print("Preço: ");
	double preco = sc.nextDouble();
	
	System.out.print("Quantidade: ");
	int quantidade = sc.nextInt();
	sc.nextLine(); //buffer
	
	System.out.print("Autor: ");
	String autor = sc.nextLine();
	
	Livro liv = new Livro (nome, preco, quantidade, autor);

	
	
System.out.println("=== DADOS DO PRODUTO ELETRONICO===");	
	
	System.out.print("Nome: ");
	nome = sc.nextLine();
	
	System.out.print("Preço: ");
	preco = sc.nextDouble();
	
	System.out.print("Quantidade: ");
	quantidade = sc.nextInt();
	sc.nextLine(); //buffer
	
	System.out.print("Autor: ");
	autor = sc.nextLine();
	
	System.out.print("Garantia Meses: ");
	int garantiaMeses = sc.nextInt();
	
	Eletronico ele = new Eletronico (nome, preco, quantidade, garantiaMeses);
	
	
	System.out.println("\n");
	liv.exibirDados();
	
	System.out.println("\n");
	ele.exibirDados();
	
	sc.close();
	}
}