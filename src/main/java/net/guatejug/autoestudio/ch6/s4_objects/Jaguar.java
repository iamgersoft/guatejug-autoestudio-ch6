package net.guatejug.autoestudio.ch6.s4_objects;

public class Jaguar extends Felino {

    private static final int id;
    // private static final int id = 100;

    static {
        // id = 100;
        System.out.println("Inicializador estático de Jaguar"); // 3
    }

    {
        System.out.println("Inicializador de instancia de Jaguar"); // 8
    }

    public Jaguar() {
        System.out.println("Constructor de Jaguar"); // 9
    }

    static {
        System.out.println("Otro inicializador estático de Jaguar"); // 4
        id = 100;
    }
}
