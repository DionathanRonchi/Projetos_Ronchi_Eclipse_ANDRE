package ExemploVetor;

import java.util.Scanner;

public class Vetor01 {

	public static void main(String[] args) {
		System.out.println("=====Vetor unidimensional=====");
	
	//Declaração
	int [] numeros = {40, 15, 70, 5, 30, 90, 25};
	
	//For com .lenght(tamanho)
	System.out.println("Percorrer o Vetor: ");
	for(int i=0; i < numeros.length; i++) {
	
		System.out.println("Numeros["+ i + "] = "+ numeros[i]);
	
		}	
	}
}
