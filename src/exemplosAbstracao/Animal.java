package exemplosAbstracao;

public abstract class Animal {

private String nome;

public Animal(String nome) {
	this.nome = nome;
}



public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}


//metodo abstrato, sem corpo e a classe filha é OBRIGADA a implementar
public abstract void emitirSom();


//metodo normal ou concreto filha só herda
public void dormir() {
System.out.println(nome + "Está dormindo.");

		}
	}