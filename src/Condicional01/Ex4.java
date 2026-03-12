package Condicional01;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
int num1 = input.nextInt();
int num2 = input.nextInt();
int num3 = input.nextInt();

	System.out.println("Crescente: ");	
	
	if(num1 <= num2 && num2 <= num3) {	
		System.out.println("Num1: " + num1 + "Num2: "+ num2 + "Num3 " + num3);
	
	
	}else if (num1 <= num3 && num3 <= num2) {
		System.out.println("Num1: " + num1 + "Num3: "+ num3 + "Num2 " + num2);
	
	//1º
	}else if(num2 <= num1 && num1 <= num3) {
		System.out.println("Num2: " + num2 + "Num1: "+ num1 + "Num3 " + num3);

	//2º
	}else if(num2 <= num3 && num3 <= num1) {
		System.out.println("Num2: " + num2 + "Num3: "+ num3 + "Num1 " + num1);
	
	
	//3°	
	}else if(num3 <= num1 && num1 <= num2) {
		System.out.println("Num3: " + num3 + "Num1: "+ num1 + "Num2 " + num2);
	
		
	//4º
	}else {
		System.out.println("Num3: " + num3 + "Num2: "+ num2 + "Num1 " + num1);
	}
	
	input.close();
	
	}
}