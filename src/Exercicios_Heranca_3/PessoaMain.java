package Exercicios_Heranca_3;

import java.util.ArrayList;
import java.util.Scanner;

public class PessoaMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
	
        int opcao;
        do {
            System.out.println("\n1 - Aluno | 2 - Professor | 3 - Listar | 0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            
            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
               
                System.out.print("CPF: ");
                int cpf = sc.nextInt();
                
                System.out.print("Idade: ");
                int idade = sc.nextInt();
                sc.nextLine();
                
                System.out.print("Matrícula: ");
                String matricula = sc.nextLine();
               
                System.out.print("Curso: ");
                String curso = sc.nextLine();
               
                pessoas.add(new Aluno(nome, cpf, idade, matricula, curso));
                System.out.println("✓ Cadastrado!");
            }
            else if (opcao == 2) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                
                System.out.print("CPF: ");
                int cpf = sc.nextInt();
                
                System.out.print("Idade: ");
                int idade = sc.nextInt();
                sc.nextLine();
                
                System.out.print("Disciplina: ");
                String disciplina = sc.nextLine();
                
                System.out.print("Salário: ");
                double salario = sc.nextDouble();
                sc.nextLine();
                
                pessoas.add(new Professor(nome, cpf, idade, disciplina, salario));
                System.out.println("✓ Cadastrado!");
            }
            else if (opcao == 3) {
                System.out.println();
                if (pessoas.isEmpty())
                    System.out.println("Nenhuma pessoa cadastrada!");
                else
                    for (Pessoa p : pessoas)
                        p.exibirDados();
            }
            
        } while (opcao != 0);
        sc.close();
	}
}