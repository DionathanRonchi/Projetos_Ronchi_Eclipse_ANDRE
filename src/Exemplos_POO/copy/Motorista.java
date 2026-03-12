package Exemplos_POO.copy;

public class Motorista {

	String nome;
	String placa;
	boolean disponivel = true;

void AceitarCorrida() {

	if(disponivel) {
		System.out.println("Motorista Disponivel");
	}else{	
		System.out.println("Motorista Indisponivel");
		}
	}
}