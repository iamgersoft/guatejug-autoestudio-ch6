package net.guatejug.autoestudio.ch6.s5_members;

public class ReservaFelina {

    public static void main(String[] args) {
        System.out.println("Declarando Jaguar en ReservaFelina");
        Jaguar jaguar = new Jaguar();
        Felino felino = jaguar;
        System.out.println("Tamaño de Jaguar: " + jaguar.getTamanio());
        System.out.println("Felino Ruge: " + felino.ruge); // ruge de felino
        System.out.println("Jaguar Ruge: " + jaguar.ruge); // ruge de jaguar (oculta ruge de felino)
    }
}
