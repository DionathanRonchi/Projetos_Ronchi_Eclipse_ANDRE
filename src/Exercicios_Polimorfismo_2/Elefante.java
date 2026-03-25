package Exercicios_Polimorfismo_2;

public class Elefante extends Animal{

private double comprimentoElefante;

public Elefante(String nome, int idade, double peso, double comprimentoElefante) {
	super(nome, idade, peso);
	this.comprimentoElefante = comprimentoElefante;
}

public double getComprimentoElefante() {
	return comprimentoElefante;
}

public void setComprimentoElefante(double comprimentoElefante) {
	this.comprimentoElefante = comprimentoElefante;
}
	
//Metodo sobrescrito
@Override public void emitirSom() {
System.out.println(getNome() + " diz: PRRRUUUUU!");
}	
	
@Override public String getTipoAlimento() {
return "Herbívoro - Folhas e frutas";
}

@Override
public void exibirInfo() {
    System.out.println("═══ ELEFANTE ═══");
    System.out.println("Nome: " + getNome());
    System.out.println("Idade: " + getIdade());
    System.out.println("Peso: " + getPeso());
    System.out.println("Comprimento: " + comprimentoElefante + "m");
    System.out.println("Dieta: " + getTipoAlimento());
	
	}
}	