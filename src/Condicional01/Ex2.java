package Condicional01;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

	System.out.print("Digite o primeiro numero: ");
		int num1 = input.nextInt();
	System.out.print("Digite o segundo numero: ");
		int num2 = input.nextInt();
	
int	adicao = num1 + num2;
	
	System.out.println("A somas dos valores são: " + adicao);	
	

		if (adicao <= 20) {
		System.out.println(adicao - 5 + " Resultado");
}else{	
		System.out.println("A soam é maior " + adicao);
		}
	input.close();	
	}
}