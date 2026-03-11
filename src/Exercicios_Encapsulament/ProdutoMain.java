package Exercicios_Encapsulament;

public class ProdutoMain {

	public static void main(String[] args) {

Produto p1 = new Produto("Teclado Mecânico", 250.50, 10);

System.out.println("Dados Iniciais:");
p1.exibirProduto();

p1.setPreco(199.90);

System.out.println("Dados Atualizados:");
p1.exibirProduto();
    }
}