package Exercicios_Heranca_1;

import java.util.Scanner;

public class AnimalMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	
	System.out.println("===DADOS DO ANIMAL===");
	
	
	System.out.print("Nome: ");
		String nome =sc.nextLine();
	
		
	System.out.print("Idade: ");
		int idade =sc.nextInt();
		sc.nextLine(); //buffer

		
	System.out.print("Raça: ");
		String raca =sc.nextLine();


	//Trasformando classe como OBJETO
	Cachorro cac = new Cachorro(nome, idade, raca);
	
	System.out.println("\n");
	cac.exibirDados();

	sc.close();
	}
}