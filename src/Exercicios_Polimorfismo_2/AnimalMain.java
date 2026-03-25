package Exercicios_Polimorfismo_2;
import java.util.*;
public class AnimalMain {
    static ArrayList<Animal> animais = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int op;
        do {
            menu();
            op = sc.nextInt(); sc.nextLine();
            
            if (op == 1) leao();
            if (op == 2) elefante();
            if (op == 3) papagaio();
            if (op == 4) listar();
            if (op == 5) sons();
            if (op == 6) dietas();
            
        } while (op != 0);
        sc.close();
    }
    
    static void menu() {
        System.out.println("===ESCOLHA UM ANIMAL===");
        System.out.println("1. Adicionar Leão");
        System.out.println("2. Adicionar Elefante");
        System.out.println("3. Adicionar Papagaio");
        System.out.println("4. Listar todos os animais");
        System.out.println("5. Fazer todos os animais emitirem som");
        System.out.println("6. Mostrar dieta de todos");
        System.out.println("0. Sair");
        System.out.print("Escolha: ");
    }
    
    static void leao() {
        System.out.print("Nome: "); String n = sc.nextLine();
        System.out.print("Idade: "); int i = sc.nextInt(); sc.nextLine();
        System.out.print("Peso: "); double p = sc.nextDouble(); sc.nextLine();
        animais.add(new Leao(n, i, p, 0)); // 4º param ignorado
        System.out.println("Leão OK!");
    }
    
    static void elefante() {
        System.out.print("Nome: "); String n = sc.nextLine();
        System.out.print("Idade: "); int i = sc.nextInt(); sc.nextLine();
        System.out.print("Peso: "); double p = sc.nextDouble(); sc.nextLine();
        System.out.print("Comprimento: "); double c = sc.nextDouble(); sc.nextLine();
        animais.add(new Elefante(n, i, p, c));
        System.out.println("Elefante OK!");
    }
    
    static void papagaio() {
        System.out.print("Nome: "); String n = sc.nextLine();
        System.out.print("Idade: "); int i = sc.nextInt(); sc.nextLine();
        System.out.print("Peso: "); double p = sc.nextDouble(); sc.nextLine();
        System.out.print("Cor penas: "); String cor = sc.nextLine();
        animais.add(new Papagaio(n, i, p, cor));
        System.out.println("Papagaio OK!");
    }
    
    static void listar() {
        if(animais.isEmpty()) {
            System.out.println("Nenhum animal!");
            return;
        }
        System.out.println("\n=== LISTA ===");
        for(Animal a : animais) a.exibirInfo();
    }
    
    static void sons() {
        if(animais.isEmpty()) {
            System.out.println("Nenhum animal!");
            return;
        }
        System.out.println("\n═══ ANIMAIS EMITINDO SOM ═══");
        for(Animal a : animais) a.emitirSom();
    }
    
    static void dietas() {
        if(animais.isEmpty()) {
            System.out.println("Nenhum animal!");
            return;
        }
        System.out.println("\n═══ DIETAS ═══");
        for(Animal a : animais) {
            System.out.println(a.getNome() + ": " + a.getTipoAlimento());
        }
    }
}