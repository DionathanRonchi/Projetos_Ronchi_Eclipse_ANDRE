package Condicional01;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

System.out.print("Digite o primeiro numero: ");
	int num1 = input.nextInt();
System.out.print("Digite o Segundo numero: ");
	int num2 = input.nextInt();

int adicao = num1 + num2;

		System.out.print("A soma dos numeros são: " + adicao);


if (adicao > 10) {

		System.out.println("Adição Maior que DEZ");

}else{

		System.out.println(" Adição menor que DEZ");
	
}


}
	}