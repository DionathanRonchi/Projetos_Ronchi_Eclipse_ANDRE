package ExemplosString;

import java.util.Scanner;  

public class String01 {

    // ═══════════════════════════════════════════════════════════════
    // 5. CONVERSÃO DE CAIXA - .toUpperCase() / .toLowerCase()
    // ═══════════════════════════════════════════════════════════════
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        
        System.out.println("Tamanho Palavra (.length)");
        
        System.out.println("\n=== 5. CONVERSÃO DE CAIXA ===\n");
        
        String frase = "Java é Poderoso";
        
        String maiuscula = frase.toUpperCase();  
        String minuscula = frase.toLowerCase();  
        
        System.out.println("Original: " + frase);
        System.out.println("Maiúscula: " + maiuscula);
        System.out.println("Minúscula: " + minuscula);
        
     
        System.out.println("Original continua: " + frase);  // 
        
        System.out.print("\nVocê gosta de programar? (sim/não): ");
        String resposta = sc.nextLine().toLowerCase();  
        
        if (resposta.equals("sim")) {  // 
            System.out.println("Ótimo! Continue praticando!");
        }  
        
        sc.close();  
    }
}