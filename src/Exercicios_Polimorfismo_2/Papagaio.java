package Exercicios_Polimorfismo_2;

public class Papagaio extends Animal{

private String corPenas;

public Papagaio(String nome, int idade, double peso, String corPenas) {
	super(nome, idade, peso);
	this.corPenas = corPenas;
}

public String getCorPenas() {
	return corPenas;
}

public void setCorPenas(String corPenas) {
	this.corPenas = corPenas;
}


//Metodo sobrescrito
@Override public void emitirSom() {
System.out.println(getNome() + " diz: Quero biscoito!!");
} 

@Override public String getTipoAlimento() {
return "Onívoro - Sementes e frutas";
}

@Override
public void exibirInfo() {
    System.out.println("═══ PAPAGAIO ═══");
    System.out.println("Nome: " + getNome());
    System.out.println("Idade: " + getIdade());
    System.out.println("Peso: " + getPeso());
    System.out.println("Cor penas: " + corPenas);
    System.out.println("Dieta: " + getTipoAlimento());
    System.out.println();
}

public void falar(String frase) {
    System.out.println(getNome() + " disse: " + frase);

	}
}