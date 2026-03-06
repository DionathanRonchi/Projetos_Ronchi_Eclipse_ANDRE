package Condicional01;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        double num1 = input.nextDouble();

	        System.out.print("Digite o segundo número: ");
	        double num2 = input.nextDouble();

	        if (num1 > num2) {
	            System.out.println("O maior número é: " + num1);
	        } else {
	            System.out.println("O maior número é: " + num2);
	        }

	        input.close();
	    }
	}