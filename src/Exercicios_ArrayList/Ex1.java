package Exercicios_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        
        // Ler 5 nomes do usuário
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            String nome = sc.nextLine();
            nomes.add(nome);
        }
        
        // Exibir todos os nomes cadastrados
        System.out.println("\n=== Nomes Cadastrados ===");
        for (String nome : nomes) {
            System.out.println("- " + nome);
        }
        
        sc.close();
    }
}