package Exercicios_Encapsulament;

public class Pessoaa {

	//atributos
private String nome;
private int idade;

//Encapsulamento
public Pessoaa(String nome, int idade) {
this.nome=nome;
this.idade=idade;
}

//Criando métodos de Acesso	"Getters e Setters"
//Getters > chama o atributo    .get	
//Setters > modifica o atributo .set	

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

public void apresentar() {
    System.out.println("Olá, meu nome é " + this.nome + " e tenho " + this.idade + " anos");
	
	}
}