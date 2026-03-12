package ExerciciosString;

import java.util.Scanner;

public class Ex2 {
/*2. Desenvolva um sistema de login que solicite usuário e senha, valide o usuário ignorando maiúsculas e minúsculas 
com equalsIgnoreCase(), valide a senha com equals() exigindo no mínimo 6 caracteres, 
e exiba “Acesso liberado” ou “Acesso negado”.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	String user = "root";
	String senha = "teste";
		
		System.out.print("Login: ");
		String login = sc.nextLine();

	System.out.print("Senha: ");
	String senha2 = sc.nextLine();	
	
		boolean userValido = login.equalsIgnoreCase(user);
		boolean senhaOk = senha2.equals(senha) && senha.length()>=5;
	
	if(userValido && senhaOk) {
		System.out.println("Acesso Liberado!!");
	}else{
		System.out.println("Acesso Negado.");
	
		}
	}
}