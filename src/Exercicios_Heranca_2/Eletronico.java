package Exercicios_Heranca_2;

public class Eletronico extends Produto {

private int garantiaMeses;

public Eletronico(String nome, double preco, int quantidade, int garantiaMeses) {
	super(nome, preco, quantidade);
	this.garantiaMeses = garantiaMeses;
}

public int getGarantiaMeses() {
	return garantiaMeses;
}

public void setGarantiaMeses(int garantiaMeses) {
	this.garantiaMeses = garantiaMeses;
}

@Override public void exibirDados() {
super.exibirDados();
System.out.println("Garantia de Meses: " + garantiaMeses);

		}
	}