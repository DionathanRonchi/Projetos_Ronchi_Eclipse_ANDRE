package Exercícios_Excecoes;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	try {	
		System.out.print("Digite um numero inteiro: ");
		int n1 =sc.nextInt();
		
	if (n1 < 0) {
		System.out.println("ERRO!! numero deve ser maior que zero");
	
	}else {
		System.out.println("Numero Invalido: " + n1);	
	}
	
	}catch(Exception e) {
		System.out.println("ERRO: Digite apenas numeros inteiros");
		
	 } finally {
         System.out.println("FIM DO PROGRAMA!");
         sc.close();	
		
	 		}
		}
	}