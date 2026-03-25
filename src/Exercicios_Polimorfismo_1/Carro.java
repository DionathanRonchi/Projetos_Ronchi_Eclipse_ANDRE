package Exercicios_Polimorfismo_1;

public class Carro extends Transporte{

private String tipoCombustivel;

public Carro(double distancia, int passageiros, String tipoCombustivel) {
	super(distancia, passageiros);
	this.tipoCombustivel = tipoCombustivel;
}

public String getTipoCombustivel() {
	return tipoCombustivel;
}

public void setTipoCombustivel(String tipoCombustivel) {
	this.tipoCombustivel = tipoCombustivel;
}

//Metodo sobrescrito
@Override public double calcularCusto() {
return getDistancia() * 1.50;
}

@Override public void exibirDetalhes() {
    System.out.println("═══ CARRO ═══");
    System.out.println("Distância: " + getDistancia() + " km");
    System.out.println("Passageiros: " + getPassageiros());
    System.out.println("Combustível: " + tipoCombustivel);
    System.out.printf("Custo: R$ %.2f%n", calcularCusto());

		}
	}