package Heranca;

import java.util.Scanner;

public class VeiculoMain {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	
	//Cadastro de Carro
	System.out.println("===CADASTRO DE CARRO===");
	
	System.out.print("Marca: ");
		String marca = sc.nextLine();
	
	System.out.print("Modelo: ");
		String modelo = sc.nextLine();
	
	System.out.print("Ano: ");
		int ano = sc.nextInt();
	
	System.out.print("Quantidade de portas: ");	
		int portas = sc.nextInt();	
			sc.nextInt(); //buffer
	
	//Trasformando classe como OBJETO
	Carro car = new Carro(marca, modelo, ano, portas);
	
		
		
	//Cadastro de Moto
	System.out.println("===CADASTRO DE MOTO===");
		System.out.println("Marca: ");		
		marca = sc.nextLine();
	
	System.out.println("Modelo: ");
		modelo = sc.nextLine();
	
	System.out.println("Ano: ");
		ano = sc.nextInt();
		
	System.out.println("Cilindradas: "); 
	int cilindradas = sc.nextInt();
	
	//Trasformando classe como OBJETO
	Moto biz = new Moto(marca, modelo, ano, cilindradas);
	
	
	System.out.println("\n");
		car.exibirDados();
	
	System.out.println("\n");
		biz.exibirDados();
	
	sc.close();
	}
}