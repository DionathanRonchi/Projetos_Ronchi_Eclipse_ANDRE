package Exercicios_Encapsulament;

public class Carro {

private String modelo;
private int ano;
private double velocidade;

public Carro(String modelo, int ano, double velocidade) {
this.modelo=modelo;
this.ano=ano;
this.velocidade=velocidade;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public int getAno() {
	return ano;
}

public void setAno(int ano) {
	this.ano = ano;
}

public double getVelocidade() {
	return velocidade;
}

public void setVelocidade(double velocidade) {
	this.velocidade = velocidade;
}

public void acelerar(double valor) {
this.velocidade +=valor;
}

public void frear(double valor) {
	if (valor <= this.velocidade) {
		this.velocidade -= valor;
			}else {
				System.out.println("Velocidade não pode ser negativa!");
     }
 }

public void mostrarVelocidade() {
    System.out.println("Velocidade atual: " + this.velocidade + " km/h");
	}
}