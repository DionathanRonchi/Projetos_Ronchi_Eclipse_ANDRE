package Exercícios_Excecoes;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	try {
		System.out.print("Digite a senha: ");
		String senha = sc.nextLine();
	  
		
	if (senha.length() < 6) {
	throw new Exception("ERRO!! Senha deve ter 6 caracteres!");
	            }
	            
	System.out.println("Senha VÁLIDA!");
	            
	}catch (Exception e) {
		System.out.println(e.getMessage());
	
	}finally {
		System.out.println("FIM DO PROGRAMA!");
		sc.close();
	       
			}
	    }
	}	