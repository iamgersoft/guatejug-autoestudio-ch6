package net.guatejug.autoestudio.ch6.s1_inheritance;

public class Loro extends Ave {

    String especie;

    public static void main(String[] args) {
        Loro loro = new Loro();
        loro.nombre = "Theo"; // Atributo nombre viene de la clase padre Ave
        loro.tamanio = 32; // Atributo tamanio viene de la clase padre Ave
        loro.especie = "Amazona autumnalis"; // Atributo especie es de la clase Loro
        System.out.println(loro);
    }
}
