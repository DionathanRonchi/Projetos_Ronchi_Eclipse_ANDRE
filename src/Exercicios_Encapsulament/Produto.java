package Exercicios_Encapsulament;

public class Produto {

	//atributos privados
private String nome;
private double preco;
private int quantidade;

//encapsulamento
public Produto(String nome, double preco, int quantidade) {
this.nome=nome;
this.preco=preco;
this.quantidade=quantidade;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public int getQuantidade() {
	return quantidade;
}

public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}

public void exibirProduto() {
	   System.out.println("Nome: " + this.nome);
       System.out.println("Preço: R$ " + this.preco);
       System.out.println("Quantidade: " + this.quantidade);
       System.out.println("--------------------------------");
}}