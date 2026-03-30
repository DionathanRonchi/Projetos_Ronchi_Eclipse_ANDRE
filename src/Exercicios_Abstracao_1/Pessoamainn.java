package Exercicios_Abstracao_1;

public class Pessoamainn {

	public static void main(String[] args) {

		 Aluno a = new Aluno("Caio ","Desenvolvimento de Sistemas");
	     Professor p = new Professor("Ana ","Programação Orientada a Objetos");       

	a.saudacao();
	a.apresentar();

	
	p.saudacao();
	p.apresentar();

	
	  System.out.flush();
		}
	}