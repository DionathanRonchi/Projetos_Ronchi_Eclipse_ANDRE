package Exercícios_Excecoes;

public class Ex3 {

	public static void main(String[] args) {

		try {	
			int resultado = 100 / 0;
			System.out.println(resultado);
			
		}catch(Exception e) {
			System.out.println("Erro na divisão");
			System.out.println("mensagem: " + e.getMessage());
			e.printStackTrace();
		
		}finally {	
			System.out.println("Fim da operação");
			
				}	
			}
		}