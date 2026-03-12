package Exercicios_ArrayList;

import java.util.ArrayList;

public class Ex2 {
    
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        // Adicionar números de 1 a 10
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        
        System.out.println("Lista antes da remoção: " + numeros);
        
        // Remover o número 5 (usa Integer.valueOf para remover o valor, não o índice)
        numeros.remove(Integer.valueOf(5));
        
        System.out.println("Lista após remover o 5: " + numeros);
        System.out.println("Tamanho da lista: " + numeros.size());
    }
}