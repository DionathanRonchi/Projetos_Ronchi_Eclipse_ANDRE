package Exercicios_Polimorfismo_1;

public class Transporte {

private double distancia;
private int passageiros;

public Transporte(double distancia, int passageiros) {
	this.distancia = distancia;
	this.passageiros = passageiros;
}

public double getDistancia() {
	return distancia;
}

public void setDistancia(double distancia) {
	this.distancia = distancia;
}

public int getPassageiros() {
	return passageiros;
}

public void setPassageiros(int passageiros) {
	this.passageiros = passageiros;
}

public double calcularCusto() {
return 0.0;
}	

//método será subrecrito pelas subclasses
public void exibirDetalhes() {
	System.out.println("===TRANSPORTE===");
	System.out.println("Distancia: " + distancia);
	System.out.println("Passageiros: " + passageiros);

		}
	}