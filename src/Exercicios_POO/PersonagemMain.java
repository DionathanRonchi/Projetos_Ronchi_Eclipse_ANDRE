package Exercicios_POO;

public class PersonagemMain {

public static void main(String[] args) {

Personagem p1 = new Personagem();
	
	p1.nome = "Goku";
		p1.nivel = 2005;
			p1.classe = "Super Omega";
	
	p1.SubirNivel();
	p1.MostrarStatus();
	}

}