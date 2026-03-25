package Exercicios_Polimorfismo_1;

public class Bicicleta extends Transporte{

private String tipoFreio;

public Bicicleta(double distancia, int passageiros, String tipoFreio) {
	super(distancia, passageiros);
	this.tipoFreio = tipoFreio;
}

public String getTipoFreio() {
	return tipoFreio;
}

public void setTipoFreio(String tipoFreio) {
	this.tipoFreio = tipoFreio;
}

@Override public double calcularCusto() {
return 0.00;
}


@Override public void exibirDetalhes() {
    System.out.println("═══ BICICLETA ═══");
    System.out.println("Distância: " + getDistancia() + " km");
    System.out.println("Passageiros: " + getPassageiros());
    System.out.println("Combustível: " + tipoFreio);
    System.out.printf("Custo: R$ %.2f%n", calcularCusto());

	}
}