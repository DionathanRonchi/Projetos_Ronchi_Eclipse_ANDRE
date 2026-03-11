package Exercicios_Encapsulament;

public class CarroMain {
    public static void main(String[] args) {

Carro carro1 = new Carro("Fusca", 1970, 0.0);

carro1.acelerar(50.0);

carro1.frear(20.0);

carro1.mostrarVelocidade();
    }
}