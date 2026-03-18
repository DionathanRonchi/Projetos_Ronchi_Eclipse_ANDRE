package Exercicios_Heranca;

public class Animal {

//Atributos
private String nome;
private int idade;

//Construtor
public Animal(String nome, int idade) {
	super();
	this.nome = nome;
	this.idade = idade;
}

//Getter e Setter
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public void exibirDados() {
	System.out.println("==DADOS==");
		System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
		}
	}