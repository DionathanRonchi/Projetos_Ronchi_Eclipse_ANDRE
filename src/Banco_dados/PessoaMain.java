package Banco_dados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
try {	
	System.out.print("Informe seu Nome: ");
		String nomeDig = sc.nextLine();
	
	System.out.print("Informe sua Idade: ");
		int idadeDig = sc.nextInt();
		sc.nextLine();
		
	System.out.print("Informe seu CPF: ");
		String cpfDig = sc.nextLine();
	
Pessoa natalino = new Pessoa(nomeDig, idadeDig, cpfDig);

PessoaDAO natalinoDAO = new PessoaDAO();
natalinoDAO.inserir(natalino);

//Leitura do banco de dados
	List<Pessoa> lista = natalinoDAO.listar();

	for(Pessoa p : lista) {
		System.out.println(p);
	}


}catch(Exception e) {	
	System.out.println("Erro no Banco " + e.getMessage());
	
			}			
		}
	}