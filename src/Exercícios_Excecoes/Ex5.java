package Exercícios_Excecoes;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	try {	
		System.out.print("Digite sua idade: ");
		int idade =sc.nextInt();
			
	if (idade < 18) {
		throw new Exception("Idade deve ser maior que 18!");	
		}
   
	System.out.println("✅ Acesso PERMITIDO!");

	}catch(Exception e) {
		System.out.println("ERRO!! Idade não permetida, " + e.getMessage());
			
	}finally {
		System.out.println("FIM DO PROGRAMA!");
		sc.close();		
				
			}
		}
	}	