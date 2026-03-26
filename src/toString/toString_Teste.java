package toString;

public class toString_Teste {

private String nome;
private int idade;


public toString_Teste(String nome, int idade) {
	this.nome = nome;
	this.idade = idade;
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

//Método toString, sobreescreve o object do java
public String toString() {
	return "Nome: " + nome + "\nIdade: " + idade;
	
		}
	}