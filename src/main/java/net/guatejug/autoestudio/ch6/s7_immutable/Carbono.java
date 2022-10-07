package net.guatejug.autoestudio.ch6.s7_immutable;

import java.util.ArrayList;
import java.util.List;

public class Carbono {
    public static void main(String[] args) {

        List<String> alotroposCarbono = new ArrayList<String>();
        alotroposCarbono.add("Grafito");
        alotroposCarbono.add("Fullereno");
        alotroposCarbono.add("Diamante");
        alotroposCarbono.add("Grafeno");

        Elemento elemento = new Elemento(6, "Carbono", alotroposCarbono);

        // Probando a romper el principio de inmutabilidad
        elemento.getAlotropia().add("Ozono"); // OJO - Ozono es alótropo del oxígeno (O)

        System.out.println(alotroposCarbono.toString()); // [Grafito, Fullereno, Diamante, Grafeno]
        System.out.println(elemento.getAlotropia().toString()); // [Grafito, Fullereno, Diamante, Grafeno]
    }
}
