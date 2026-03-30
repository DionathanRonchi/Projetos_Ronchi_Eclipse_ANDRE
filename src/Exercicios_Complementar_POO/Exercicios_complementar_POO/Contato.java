package Exercicios_Complementar_POO;

import java.util.ArrayList;
import java.util.Scanner;

//ex2
public class Contato {
	private String nome;
	private String telefone;

//ArrayList
private ArrayList<Contato> contatos = new ArrayList<>();

public Contato() {

}

public Contato(String nome, String telefone) {
	this.nome = nome;
	this.telefone = telefone;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

//Criando o Método

public void exibirDados() {
	System.out.println("Nome: " + nome);
	System.out.println("Telefone : " + telefone);
		}

public void adicionar(String nome, String telefone) {
	Contato novoContato = new Contato(nome, telefone);
		contatos.add(novoContato);
			System.out.println("Contatos Adicionados");
		}

public void listar() {
	if(contatos.isEmpty()) {
		System.out.println("Contatos vazio.");
			return;
		}

System.out.println("Lista encontrada");
	for(Contato total : contatos) {
		total.exibirDados();
		}
	}	

public void buscarNome(String nome) {
	if(contatos.contains(nome)) {
		int posicao = contatos.indexOf(nome);
			System.out.println("Encontrado: " + (posicao + 1));
	}else{
		System.out.println("Não encontrado");
		}
	}
			
public void removerContato() {
    if(contatos.isEmpty()) {
        System.out.println("Lista vazia!");
        return;
    }
    
    for(int i = 0; i < contatos.size(); i++) {
        System.out.print((i+1) + ". ");
        contatos.get(i).exibirDados();
    }
    
    System.out.print("Digite o número do contato (1 a " + contatos.size() + "): ");
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
    
    if(numero >= 1 && numero <= contatos.size()) {
        contatos.remove(numero - 1);
        System.out.println("Contato removido com sucesso!");
    } else {
        System.out.println("Número inválido!");
    
    		}
		}
	}	