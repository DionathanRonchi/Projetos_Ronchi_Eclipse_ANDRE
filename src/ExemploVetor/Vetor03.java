package ExemploVetor;

import java.util.Scanner;

public class Vetor03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.println("=====Vetor de nomes=====");

	System.out.print("Quantos nomes deseja digitar: ");
		int qtdNomes = input.nextInt();
			input.nextLine(); //Limpeza do buffer
	
		String[] nomes = new String[qtdNomes];
	
	System.out.println("Digite os nomes: ");
		for(int i=0; i <nomes.length; i++) {
			System.out.println("Nomes [" +i+ "]: ");
			nomes[i] = input.nextLine();
		}
	//Exibindo os nomes com FOR-EACH
	System.out.println("Nomes digitados: ");
		for(String nome : nomes) {
			System.out.println(" - " + nome);
		
		}
	}
}