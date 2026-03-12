package ExercicioVetores;

import java.util.Scanner;

public class Ex2 {
/*2) Implemente um programa que receba do usuário 5 números
por meio do Scanner,armazene-os em um vetor e apresente 
a soma total dos valores digitados.*/

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

    double[] numeros = new double[5];
    double soma =0;
	
	for(int i=0; i < 5; i++) {
        System.out.print("Digite o " + (i + 1) + "º número: ");
        	numeros[i] = input.nextDouble();
        		soma += numeros[i];
			}
	
	System.out.println("Soma Total: " + soma);
	
	}
}