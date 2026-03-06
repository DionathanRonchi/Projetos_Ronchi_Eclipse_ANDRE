package repeticao;

import java.util.Scanner;

public class TesteFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome = input.nextLine();

		
	for(int i=0; i<=5; i++) {
		System.out.println("Informe o nome: ");
		String nome2 = input.nextLine();

	System.out.println(nome2);
	}
	
	System.out.println("Os nomes digitdos: " + nome);	
	
		}
	}