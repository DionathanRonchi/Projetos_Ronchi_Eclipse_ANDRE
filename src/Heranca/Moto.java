package Heranca;

public class Moto extends Veiculo{

//atributo da classe Moto
private int cilindradas;

//Construtor vai referenciar a superClasse	
public Moto(String marca, String modelo, int ano, int cilindradas) {
	super(marca, modelo, ano);
	this.cilindradas = cilindradas;
}

public int getCilindradas() {
	return cilindradas;
}

public void setCilindradas(int cilindradas) {
	this.cilindradas = cilindradas;
}
	
@Override //Indica que o método	está sendo sobrescrito
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Cilindradas: " + cilindradas);
		}	
	}