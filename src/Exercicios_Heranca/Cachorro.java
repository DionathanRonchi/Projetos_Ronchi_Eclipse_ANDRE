package Exercicios_Heranca;

public class Cachorro extends Animal{

private String raca;

//Construtor
public Cachorro(String nome, int idade, String raca) {
	super(nome, idade);
	this.raca = raca;
}

//Getter e Setters
public String getRaca() {
	return raca;
}

public void setRaca(String raca) {
	this.raca = raca;
}

@Override //Indica que o método está sendo sobrescrito
public void exibirDados() {
	super.exibirDados();
			//Adicionar Atributos
			System.out.println("Raça: " + raca);
		}
	}