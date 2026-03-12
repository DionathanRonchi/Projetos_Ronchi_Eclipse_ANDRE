package Exercicios_POO;

public class Personagem {

    String nome;
    int nivel;
    String classe;

    void SubirNivel() {
        if (nivel >= 2000) { 
            System.out.println("Subi de nivel!! " + nivel);
        } else {
            
        }
    } 

    void MostrarStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("Classe: " + classe);
    }
}