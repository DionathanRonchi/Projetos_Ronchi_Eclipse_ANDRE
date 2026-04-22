package crud;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	pessoaDAO pessoaDAO = new pessoaDAO();
	
	int opcao;
	do {
		System.out.println("==MENU CRUD==");
	System.out.println("1 - Inserir Pessoa");
	System.out.println("2 - Listar");
	System.out.println("3 - Atualizar pessoa");
	System.out.println("4 - Excluir Pesoa");
	System.out.println("0 - Sair");
	
	System.out.print("Escolha Opção: ");
	opcao = sc.nextInt();
	sc.nextLine();
	
	switch(opcao){
	case 1:
		try {
			System.out.println("Nome: ");
			String nome =  sc.nextLine();
	
			System.out.println("idade: ");
			int idade =  sc.nextInt();			
	
			Pessoa novaPessoa = new Pessoa(nome, idade);
			pessoaDAO.inserir(novaPessoa);
		} catch(SQLException e) {
	System.out.println("Erro ao inserir: " + e.getMessage());
		}
		break;
	
	case 2:
		try {
			List<Pessoa> lista = pessoaDAO.listar();
		
		if(lista.isEmpty()) {
			System.out.println("Nenhuma pesso cadastrada.");
		}else{
			System.out.println("listar pessoa");
				for(Pessoa listada : lista) {
					System.out.println(listada);
			}
		}	
		
		}catch (SQLException e) {	
		System.out.println("Erro ao listar: " + e.getMessage());
			}
		break;
	
	case 3:
		try {
			System.out.println("ID da pessoa: ");
			int idAtualizar = sc.nextInt();
			sc.nextLine();
		
			System.out.println("Novo nome: ");
			String novoNome = sc.nextLine();
		
			System.out.println("Nova idade: ");
			int novaIdade = sc.nextInt();
		
			Pessoa pessoaAtualizar = new Pessoa(idAtualizar, novoNome, novaIdade);
			pessoaDAO.atualizar(pessoaAtualizar);
			
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
			
		}catch(SQLException e) {
			System.out.println("Erro ao excluir: " + e.getMessage());
		}
			
		break;	
			
	case 0:
		System.out.println("Fuii!!!");
		break;
	
	default:
		System.out.println("opção Invalida");
	}
		
	}while(opcao !=0);

		}
	}