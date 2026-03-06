package ExemploVetor;

import java.util.Scanner;

public class Vetor02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Quantos números deseja: ");
			int tamanho = input.nextInt();
	
	int [] numeros = new int[tamanho];
	
	//Preechendo o vetor com for
		System.out.println("\nDigite o valores: ");
			for(int i=0; i < numeros.length; i++) {
				System.out.println("Numeros [" +i+"]: ");
				numeros[i] = input.nextInt();
			}
	//exibindo o vetor
	for (int i=0; i< numeros.length; i++) {
		System.out.print(numeros[i] + " ");		
		
		}
	input.close();
	}
}