package crud;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static String nome;
	private static String id;
	private static double preco;
	private static int quantidade;

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		produtoDAO pessoaDAO = new produtoDAO();
		
		int opcao;
		do {
			System.out.println("==CRUD PRODUTOS==");
			System.out.println("1 - Inserir Produto");
			System.out.println("2 - Listar Produtos");
			System.out.println("3 - Atualizar Produto");
			System.out.println("4 - Excluir Produto");
			System.out.println("0 - Sair");
			
			System.out.print("Escolha Opção: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao){
			case 1:
				try {
					System.out.print("Nome: ");
					String nome =  sc.nextLine();
			
					System.out.print("Preço: ");
					double preco =  sc.nextDouble();
					sc.nextLine();  
					
					System.out.print("Quantidade: ");
					int quantidade = sc.nextInt();
					sc.nextLine();
					
					System.out.print("ID: ");
					int id = sc.nextInt();			
			
					Produto novoProduto = new Produto(id, nome, preco, quantidade);
					pessoaDAO.inserir(novoProduto);
					System.out.println("Produto inserido com sucesso!");
				} catch(SQLException e) {
					System.out.println("Erro ao inserir: " + e.getMessage());
				
				}
				break;
			
			case 2:
				try {
					List<Produto> lista = pessoaDAO.listar();
				
					if(lista.isEmpty()) {
						System.out.println("Nenhum produto cadastrado.");
					}else{
						System.out.println("==LISTA DE PRODUTOS==");
						for(Produto listada : lista) {
							System.out.println(listada);
						}
					}	
					
				}catch (SQLException e) {	
					System.out.println("Erro ao listar: " + e.getMessage());
				}
				break;
			
			case 3:
				try {
					System.out.println("ID do produto: ");
					int idAtualizar = sc.nextInt();
					sc.nextLine();
				
					System.out.println("Novo nome: ");
					String novoNome = sc.nextLine();
				
					System.out.println("Novo preço: ");
					double novoPreco = sc.nextDouble();
					
					System.out.println("Nova quantidade: ");
					int novaQuantidade = sc.nextInt();
				
					Produto produtoAtualizar = new Produto(idAtualizar, novoNome, novoPreco, novaQuantidade);
					pessoaDAO.atualizar(produtoAtualizar);
					System.out.println("Produto atualizado com sucesso!");
					
				}catch(SQLException e) {	
					System.out.println("Erro ao atualizar: " + e.getMessage());
				}
				break;
				
			case 4:	
				try {
					System.out.println("ID para excluir: ");
					int idExcluir = sc.nextInt();
					sc.nextLine();
				
					pessoaDAO.excluir(idExcluir);
					System.out.println("Produto excluído com sucesso!");
					
				}catch(SQLException e) {
					System.out.println("Erro ao excluir: " + e.getMessage());
				}
					
				break;	
					
			case 0:
				System.out.println("Até logo!");
				break;
			
			default:
				System.out.println("Opção Inválida");
			}
				
		}while(opcao !=0);
		
		sc.close();
	}
}