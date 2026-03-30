package Excecoes;

import java.util.Scanner;

public class Exemplo_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	try {	
		System.out.print("Digite o primeiro numero: ");
		int n1 = sc.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		
		System.out.println("A soma é: " + soma);
		
	}catch(Exception e) {
		System.out.println("Erro! Digite apenas números Int.");	
	}
		System.out.println("Programa finalizado!");
		
	}

}
