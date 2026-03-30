package Excecoes;

public class Exemplo_2 {

	public static void main(String[] args) {

		try {	
			int idade = 25;
			if(idade < 18) {
				throw new Exception("Idade Invalida!");
			}
			
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
			System.out.println("O sistema continua.");
			//Throw Cria o ERRO
			//cath resolve o erro
	
		}
	}