package Condicional01;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);

System.out.println("Informe um numero: ");
double num = input.nextDouble();

if(num > 0) {
		System.out.println("Raiz Quadrada: " + Math.sqrt(num));
}else if (num < 0) {
		System.out.println("Quadrado: " + (num * num));
}else{
		System.out.println("O valor é ZERO.");
}
	input.close();
	
	}
 }

