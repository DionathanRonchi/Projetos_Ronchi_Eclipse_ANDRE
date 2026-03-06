package ExerciciosString;

import java.util.Scanner;

public class Ex3 {
/*3. Peça ao usuário que digite um email, verifique se contém “@” e “.”, confirme que o “@” não está na primeira posição,
 e utilize substring() para exibir separadamente o nome de usuário e o domínio ou uma mensagem indicando email inválido.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	System.out.print("Digte seu email: ");
	String email = sc.nextLine().trim();
	
	boolean temArroba = email.contains("@");
	boolean temPonto = email.contains(".");
	boolean arrobaFora = temArroba && email.indexOf("@")>0;
	
	if(temArroba && temPonto && arrobaFora) {
		int depoisArroba = email.indexOf("@");
			String nomeUser = email.substring(0, depoisArroba);
				String dom = email.substring(depoisArroba + 1);
				
	System.out.println("E-mail CORRETO.");
	System.out.println("usuario: " + nomeUser);
	System.out.println("Dominio: " + dom);
	
	}else{
		System.out.println("E-mail invalido.");
	
		}
	}
}