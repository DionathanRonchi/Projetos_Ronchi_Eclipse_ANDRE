package Exercicios_Polimorfismo_1;

public class Onibus extends Transporte{

private int numeroLinhas;

public Onibus(double distancia, int passageiros, int numeroLinhas) {
	super(distancia, passageiros);
	this.numeroLinhas = numeroLinhas;
}

public int getNumeroLinhas() {
	return numeroLinhas;
}

public void setNumeroLinhas(int numeroLinhas) {
	this.numeroLinhas = numeroLinhas;
}

@Override public double calcularCusto() {
return getDistancia() * 0.80;
}

@Override public void exibirDetalhes() {
    System.out.println("═══ ONIBUS ═══");
    System.out.println("Distância: " + getDistancia() + " km");
    System.out.println("Passageiros: " + getPassageiros());
    System.out.println("Combustível: " + numeroLinhas);
    System.out.printf("Custo: R$ %.2f%n", calcularCusto());

	}
}