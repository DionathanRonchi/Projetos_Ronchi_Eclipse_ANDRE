package Condicional01;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        if (num % 3 == 0) {
            System.out.println("é múltiplo de 3");
        } else {
            System.out.println("não é");
        }

        input.close();
    }
}