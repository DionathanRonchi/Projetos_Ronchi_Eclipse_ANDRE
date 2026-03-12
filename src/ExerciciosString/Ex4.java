package ExerciciosString;

import java.util.Scanner;

public class Ex4 {
/*4. Solicite ao usuário que digite uma palavra, exiba a primeira e a última letra usando charAt(), 
 conte a quantidade de vogais percorrendo  a String com for, e mostre a palavra invertida ao final.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite a palavra: ");
	String palavra = sc.nextLine();
	
	//Primeira e ultima letra
	char primeira = palavra.charAt(0);
		char ultima = palavra.charAt(palavra.length()-1);
			System.out.println("Primeira letra: " + primeira);
				System.out.println("Ultima letra: " + ultima);

	//Vogais
	int contVogal=0;
	
	String vogal = "aeiouAEIOU";
		for(int i=0; i<palavra.length();i++) {
			if(vogal.indexOf(palavra.charAt(i)) != -1) { 
				contVogal++;
			}
		}	
			
	//laço		
	System.out.println("Quantidade vogais: " + contVogal);
	
	}
}