package ExercicioVetores;

import java.util.Scanner;

public class Ex3 {
	/*3) Desenvolva um programa que utilize dois vetores com 5 posições, permita que o usuário
	preencha ambos, gere um terceiro vetor contendo a soma das posições correspondentes e
	exiba o resultado.*/

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	int[] vetor1 = new int[5];
	int[] vetor2 = new int[5];
	int[] vetor3 = new int[5];
	int[] soma = new int[5];
	
	for(int i=0; i<5; i++) {
		System.out.println("Digite o valor para posição: " + i);
		vetor1[i] = sc.nextInt();
	
		System.out.println("Digite o valor para posição: " + i);
		vetor2[i] = sc.nextInt();
	}
	
//For para calculo	
	for(int i=0; i<5; i++) {
		soma[i] = vetor1[i] + vetor2[i];
	}
	
	//for para exibir os resultados
	for(int i=0; i<5; i++) {
		System.out.println("posição "+i+" "+soma[i]);
	
	}
	
	sc.close();
	
	}
}