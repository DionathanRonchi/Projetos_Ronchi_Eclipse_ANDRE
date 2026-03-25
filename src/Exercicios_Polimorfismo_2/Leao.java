package Exercicios_Polimorfismo_2;

public class Leao extends Animal{

public Leao(String nome, int idade, double peso, int leao) {
	super(nome, idade, peso);
}

	//Metodo sobrescrito
@Override public void emitirSom() {
    System.out.println(getNome() + " diz: ROARRR!");
	}

@Override public String getTipoAlimento() {
return "Carnívoro - Carne";
}

public void exibirInfo() {
    System.out.println("═══ LEÃO ═══");
    System.out.println("Nome: " + getNome());
    System.out.println("Idade: " + getIdade());
    System.out.println("Peso: " + getPeso());
    System.out.println("Dieta: " + getTipoAlimento());
    System.out.println();
}


public void rugir() {
    System.out.println(getNome() + " RUGIU! ROARRR!");
		
		}
	}		