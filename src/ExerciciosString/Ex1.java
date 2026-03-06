package ExerciciosString;

import java.util.Scanner;

public class Ex1 {
/*1. Solicite ao usuário que digite seu nome completo, remova espaços extras com trim(), verifique se possui pelo menos 5 caracteres
 e contém espaço entre nome e sobrenome, e ao final exiba o nome em letras maiúsculas ou uma mensagem de erro caso seja inválido*/
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

	System.out.print("Digite seu nome completo: ");
		String nome = sc.nextLine().trim();
	
	if(nome.length()>=5 && nome.contains(" ")) {
		System.out.println("nome: " + nome.toUpperCase());		
	
	}else{
		System.out.println("Invalido.");
	}
		sc.close();
	
	}
}