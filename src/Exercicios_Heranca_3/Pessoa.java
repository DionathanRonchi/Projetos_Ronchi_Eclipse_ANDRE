package Exercicios_Heranca_3;

public class Pessoa {

private String nome;
private int cpf;
private int idade;

public Pessoa(String nome, int cpf, int idade) {
	super();
	this.nome = nome;
	this.cpf = cpf;
	this.idade = idade;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getCpf() {
	return cpf;
}

public void setCpf(int cpf) {
	this.cpf = cpf;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public void exibirDados() {
System.out.println("Nome: " + nome);
System.out.println("CPF: " + cpf);
System.out.println("Idade: " + idade);
		
		}
	}