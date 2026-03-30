package Excecoes;

public class Exemplo_1 {

	public static void main(String[] args) {

	try {	
		//Vou tentar ir no banheiro
		int resultado = 223 / 8;
		System.out.println(resultado);
		
	}catch(Exception e) {
		//deu problema
		System.out.println("Ocorreu um erro");
		System.out.println("mensagem: " + e.getMessage());
		System.out.println("Detalhes do erro: ");
		e.printStackTrace();
	
	}finally {	
		//lavar as mãos sempre
		System.out.println("Bloco finally executado!");
		
			}
		}
	}