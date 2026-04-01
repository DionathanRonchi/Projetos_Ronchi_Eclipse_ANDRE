package Exercícios_Excecoes;

public class Ex1 {
	
	public static void main(String[] args) {

		try {	
			int resultado = 780 / 36;
			System.out.println(resultado);
			
		}catch(Exception e) {
			System.out.println("Ocorreu um erro");
			System.out.println("mensagem: " + e.getMessage());
			System.out.println("Detalhes do erro: ");
			e.printStackTrace();
		
		}finally {	
			System.out.println("Bloco finally executado!");
			
				}
			}
		}