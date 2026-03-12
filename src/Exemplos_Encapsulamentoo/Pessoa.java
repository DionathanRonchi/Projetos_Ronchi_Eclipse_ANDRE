package Exemplos_Encapsulamentoo;

public class Pessoa {
//atributos	
	private String nome;
	private int idade;
	private String cpf;
	
//Construtor completo
	public Pessoa(String nome, int idade, String cpf) {
	this.nome=nome;
	this.idade=idade;
	this.cpf=cpf;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
	
	
}