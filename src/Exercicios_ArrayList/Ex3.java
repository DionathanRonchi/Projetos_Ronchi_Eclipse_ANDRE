package Exercicios_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Criar ArrayList com 5 cores pré-definidas
        ArrayList<String> cores = new ArrayList<>();
        cores.add("vermelho");
        cores.add("azul");
        cores.add("verde");
        cores.add("amarelo");
        cores.add("preto");
        
        System.out.println("Cores disponíveis: " + cores);
        System.out.print("Digite uma cor para verificar: ");
        String corDigitada = sc.nextLine().toLowerCase().trim();
        
        // Verificar se a cor está presente na lista
        if (cores.contains(corDigitada)) {
            System.out.println("✓ A cor '" + corDigitada + "' ESTÁ presente na lista!");
        } else {
            System.out.println("✗ A cor '" + corDigitada + "' NÃO está presente na lista.");
        }
        
        sc.close();
    }
}