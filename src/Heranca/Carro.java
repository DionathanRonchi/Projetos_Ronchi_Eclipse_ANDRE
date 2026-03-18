package Heranca;

public class Carro extends Veiculo{

private int quantidadedePortas;

//Construtor
public Carro(String marca, String modelo, int ano, int quantidadePortas) {
	super(marca, modelo, ano);
	this.quantidadedePortas = quantidadePortas;
}


//getter e setter
public int getQuantidadePortas() {
	return quantidadedePortas;
}

public void setQuantidadePortas(int quantidadePortas) {
	this.quantidadedePortas = quantidadePortas;
}


@Override //Indica que o método está sendo sobrescrito
public void exibirDados() {
	super.exibirDados();
			//Adicionar Atributos
			System.out.println("Quantidade: " + quantidadedePortas);
		}
	}