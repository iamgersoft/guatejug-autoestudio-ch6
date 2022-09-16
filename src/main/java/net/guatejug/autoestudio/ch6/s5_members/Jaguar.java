package net.guatejug.autoestudio.ch6.s5_members;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Jaguar extends Felino {

    protected boolean ruge = true;

    public Jaguar() {
        System.out.println("Constructor de Jaguar");
    }

    // @Override
    public int getTamanio() {
        // return getTamanio() + 90; // StackOverflowError
        return super.getTamanio() + 90;
    }

    // NOTA: RuntimeException es padre de IllegalArgumentException, pero
    // ambas son unchecked exception, por lo que no da problemas
    // El Capítulo 11 cubre a detalle el funcionamiento de las excepciones
    public void setEspecie(String especie) throws RuntimeException {
        System.out.println("Especie: " + especie);
    }

    //public void rugir() throws IOException {
    public void rugir() throws FileNotFoundException {
        // OK: FileNotFoundException hereda de IOException
        // OK: rugir() de la clase padre tiene un modificador de acceso más restringido (protected)
    }

    public String getColor() {
        // String implementa CharSequence
        // (String es subtipo de CharSequence)
        return "Amarillo con manchas negras";
    }
}
