package Exercicios_Encapsulament;

public class ContaBancariaMain {
    public static void main(String[] args) {
   
 ContaBancaria conta = new ContaBancaria("João", 1000.00); 
 	conta.depositar(500.00);
 		conta.sacar(200.00);
 			conta.mostrarSaldo();
    }
}