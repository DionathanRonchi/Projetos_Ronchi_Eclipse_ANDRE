package Condicional01;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	
System.out.print("Digite um numero: ");	
	int num = input.nextInt();
	
if(num >=20 && num<=90) {
	System.out.println("O numero ESTÀ entre 20 e 90 ");
}else{	
	System.out.println("O numero NÂO está entre 20 e 90");
}
	
	input.close();	
	
	}

}
