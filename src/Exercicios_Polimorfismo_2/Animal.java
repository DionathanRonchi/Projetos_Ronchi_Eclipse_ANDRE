package Exercicios_Polimorfismo_2;

public class Animal {

private String nome;
private int idade;
private double peso;

public Animal(String nome, int idade, double peso) {
	this.nome = nome;
	this.idade = idade;
	this.peso = peso;
}

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

public double getPeso() {
	return peso;
}

public void setPeso(double peso) {
	this.peso = peso;
}

public void emitirSom() {
System.out.println(getNome());
}

public String getTipoAlimento() {
 return " ";
}

public void exibirInfo() {
System.out.println("===ANIMAL===");
System.out.println("Nome: " + nome);
System.out.println("Idade: " + idade);
System.out.println("Peso: " + peso);

		}
	}