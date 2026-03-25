package Exercicios_Polimorfismo_1;

import java.util.ArrayList;
import java.util.Scanner;

public class TransporteMain {
    static ArrayList<Transporte> lista = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int op;
        do {
            menu();
            op = sc.nextInt();
            sc.nextLine();
            
            if (op == 1) carro();
            if (op == 2) onibus();
            if (op == 3) bicicleta();
            if (op == 4) listar();
            if (op == 5) total();
            
        } while (op != 0);
        sc.close();
    }
    
    static void menu() {
        System.out.println("===SISTEMA DE TRANSPORTES===");
    	System.out.println("1 - Carro");
    	System.out.println("2 - Onibus");
    	System.out.println("3 - Bicicleta");
    	System.out.println("4 - Listar");
        System.out.println("5 - Total");
    	System.out.println("0 - Sair");
        System.out.print("Opcao: ");
    }
    
    static void carro() {
        System.out.print("Distancia: ");
        double d = sc.nextDouble();
        System.out.print("Passageiros: ");
        int p = sc.nextInt();
        sc.nextLine();
        System.out.print("Combustivel: ");
        String c = sc.nextLine();
        lista.add(new Carro(d, p, c));
        System.out.println("Carro OK!");
    }
    
    static void onibus() {
        System.out.print("Distancia: ");
        double d = sc.nextDouble();
        System.out.print("Passageiros: ");
        int p = sc.nextInt();
        System.out.print("Linhas: ");
        int l = sc.nextInt();
        lista.add(new Onibus(d, p, l));
        System.out.println("Onibus OK!");
    }
    
    static void bicicleta() {
        System.out.print("Distancia: ");
        double d = sc.nextDouble();
        System.out.print("Passageiros: ");
        int p = sc.nextInt();
        sc.nextLine();
        System.out.print("Freio: ");
        String f = sc.nextLine();
        lista.add(new Bicicleta(d, p, f));
        System.out.println("Bicicleta OK!");
    }
    
    static void listar() {
        if (lista.isEmpty()) {
            System.out.println("Vazio!");
            return;
        }
        for (Transporte t : lista) {
            t.exibirDetalhes();
        }
    }
    
static void total() {
	double soma = 0;
	for (Transporte t : lista) {
    soma += t.calcularCusto();
        }
        System.out.printf("Total: R$ %.2f\n", soma);
    }
}