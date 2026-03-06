package Condicional01;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);

	        System.out.print("Digite o nome: ");
	        String nome = input.nextLine();

	        System.out.print("Digite o sexo (f ou F): ");
	        String sexo = input.nextLine();

	        System.out.print("Digite a idade: ");
	        int idade = input.nextInt();

	        if (sexo.equalsIgnoreCase("f") && idade < 25) {
	            System.out.println(nome + " - ACEITA");
	        } else {
	            System.out.println(nome + " - NÃO ACEITA");
	        }

	        input.close();
	    }
	}