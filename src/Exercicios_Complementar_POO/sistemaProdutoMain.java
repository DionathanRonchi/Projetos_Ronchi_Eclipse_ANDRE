package Exercicios_Complementar_POO;

import java.util.Scanner;
import java.util.ArrayList;

public class sistemaProdutoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<sistemaProduto> produtos = new ArrayList<>();

		int opcao;	
		
		do {	
			
			System.out.println();

			System.out.println("\n=== CADASTRO DE PRODUTO ===");
			System.out.println("1. Adicionar Produto");
			System.out.println("2. Listar produtos");
			System.out.println("3. Contar produtos");
			System.out.println("4. Buscar nome");
			System.out.println("0. Sair");
			System.out.print("Escolha: ");

			opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
			
			case 1:
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Preço: ");
				double preco = sc.nextDouble();  
				System.out.print("Quantidade: ");
				int quantidade = sc.nextInt();
				
				sistemaProduto p = new sistemaProduto(nome, preco, quantidade);
				produtos.add(p);
				System.out.println("Produto adicionado");	
				break;
			
			case 2:	
				if (produtos.isEmpty()) System.out.println("Vazio!");
					else for (int i=0; i<produtos.size(); i++) {
						System.out.println((i+1) + ". ");
						produtos.get(i).exibirdados();
					}
				break;
			
			case 3:
				System.out.println("Total: " + produtos.size());
				break;

			case 4:
				System.out.print("Nome para buscar: "); 
				String busca = sc.nextLine();
				for (sistemaProduto produto : produtos)
					if (produto.getNome().equalsIgnoreCase(busca)) {
						System.out.println("Encontrado: " + produto.getNome());
						break;
					}
				break;

			case 0:
				System.out.println("Até logo!");
				break;

			default:
				System.out.println("Opção inválida!");
			}
		} while (opcao != 0);
		sc.close();
	}
}