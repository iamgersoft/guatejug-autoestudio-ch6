package net.guatejug.autoestudio.ch6.s5_members;

import java.io.*;

public class Felino {

    private int tamanio;
    private String especie;

    // Ocultamiento (hiding) de variable en la clase hija Jaguar
    protected boolean ruge = false;

    public Felino() {
        this.tamanio = 20;
        this.especie = "Felidae/";
        System.out.println("Constructor de Felino: " + this.tamanio + " - " + this.especie);
    }

    public int getTamanio() {
        return tamanio;
    }

    // NOTA: IllegalArgumentException es un unchecked exception
    protected void setEspecie(String especie) throws IllegalArgumentException {
        if (especie == null || especie.isEmpty()) {
            throw new IllegalStateException("Debe definir un valor para especie");
        }
        this.especie = especie;
    }

    // IOException y FileNotFoundException son checked exceptions
    // protected void rugir() throws FileNotFoundException {
    protected void rugir() throws IOException {
        System.out.println("N/A");
    }

    public CharSequence getColor() {
        return "indefinido";
    }
}
