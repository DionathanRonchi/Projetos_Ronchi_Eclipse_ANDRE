package Exercicios_Abstracao_1;

public class Pessoamainn {

	public static void main(String[] args) {

	Pessoa c  = new Aluno ("Desenvolvimento de Sistemas", null);
	Pessoa p  = new Professor (" Sou professor de Programação Orientada a Objetos", null);

	c.saudacao();
	c.apresentar();
	
	p.saudacao();
	p.apresentar();
	
	
	
	
	
	}
}