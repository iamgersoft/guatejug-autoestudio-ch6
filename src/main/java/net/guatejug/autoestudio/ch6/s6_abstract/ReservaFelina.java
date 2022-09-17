package net.guatejug.autoestudio.ch6.s6_abstract;

public class ReservaFelina {

    public static void main(String[] args) {
        System.out.println("Declarando puma en ReservaFelina");
        Puma puma = new Puma();
        // Felino felino2 = new Felino(); // No compila porque Felino es clase abstracta
        System.out.println("Tamaño de puma: " + puma.getTamanio());
        System.out.println("Velocidad de puma: " + puma.getVelocidad());
        System.out.print("Puma Ruge: ");
        puma.rugir();
    }
}
