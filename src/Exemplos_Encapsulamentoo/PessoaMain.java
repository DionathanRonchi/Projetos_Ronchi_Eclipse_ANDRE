package Exemplos_Encapsulamentoo;

import java.util.Scanner;

public class PessoaMain {
/*
	public static void main(String[] args) {

	Pessoa p1 = new Pessoa("Natalino", 39, "123.567.988-59");
	
	System.out.println(p1.getNome() + "\n" + p1.getCpf());

	p1.setIdade(25);
	System.out.println(p1.getIdade());
	*/
	
public static void main(String[]args) {
	
Scanner sc = new Scanner(System.in);

System.out.println("Digite seu nome: ");
String nome = sc.nextLine();

System.out.println("Digite sua idade: ");
int idade = sc.nextInt();

System.out.println("Digite sua cpf: ");
String cpf = sc.nextLine();

Pessoa p1 = new Pessoa(nome, idade, cpf);

System.out.println(p1.getNome());





	}
}