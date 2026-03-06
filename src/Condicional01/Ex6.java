package Condicional01;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
System.out.print("Digite um NUMERO: ");
	double num = input.nextDouble();

	
if(num > 20) {
	System.out.println ("MAIOR do 20");

}else if(num == 20) {
	System.out.println("IGUAL do 20");

}else if(num < 20) {
	System.out.println("MENOR do 20");
}

input.close();
 
	}
}