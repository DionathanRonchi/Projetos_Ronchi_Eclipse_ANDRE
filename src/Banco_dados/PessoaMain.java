package Banco_dados;

import java.util.Scanner;

public class PessoaMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
try {	
	System.out.print("Informe seu Nome: ");
		String nomeDig = sc.nextLine();
	
	System.out.print("Informe sua Idade: ");
		int idadeDig = sc.nextInt();
	
Pessoa natalino = new Pessoa(nomeDig, idadeDig);

PessoaDAO natalinoDAO = new PessoaDAO();
natalinoDAO.inserir(natalino);


}catch(Exception e) {	
	System.out.println("Erro no Banco " + e.getMessage());
	
			}			
		}
	}