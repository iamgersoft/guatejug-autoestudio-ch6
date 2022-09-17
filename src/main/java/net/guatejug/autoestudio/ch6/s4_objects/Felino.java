package net.guatejug.autoestudio.ch6.s4_objects;

public class Felino {

    protected final int tamanio;
    protected final String especie;

    {
        this.tamanio = 20;
        System.out.println("Inicializador de instancia de Felino"); // 5
    }

    static {
        System.out.println("Inicializador estático de Felino"); // 2
    }

    public Felino() {
        // this.tamanio = 20;
        this.especie = "Felidae";
        System.out.println("Constructor de Felino: " + this.tamanio + " - " + this.especie); // 7
    }

    {
        // this.tamanio = 20;
        boolean isSegundoInicializadorDeInstancia = true;
        System.out.println("Otro inicializador de instancia de Felino: " + isSegundoInicializadorDeInstancia); // 6
    }
}
