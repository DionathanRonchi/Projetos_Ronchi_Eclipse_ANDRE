package Exercicios_Complementar_POO;

import java.util.ArrayList;

//ex1
public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;

private ArrayList<Produto> lista = new ArrayList<>();

public Produto() {

}

public Produto(String nome, double preco, int quantidade) {
	this.nome = nome;
	this.preco = preco;
	this.quantidade = quantidade;
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

//Criando o Método
public void ListarTodos() {
	if(lista.isEmpty()) {
		System.out.println("Nenhum produto cadastrado.");
		return;
		}
		
	System.out.println("==Lista Produtos==");
			for(Produto total : lista) {
				total.exibirDados();
			}	
		
	System.out.println("\ntotal: "+lista.size()+ "Produtos");
		}
	
public void adicionar(String nome, double preco, int quantidade) {
	Produto novoProduto = new Produto(nome, preco, quantidade);
		System.out.println("Produto adicionado.");

		}

public void exibirDados() {
	System.out.println("Nome: "+ nome);
	System.out.println("Preço: "+ preco);
	System.out.println("Quantidade: "+ quantidade);

		}
	
public int contagem() {
	return lista.size();
		}
	}