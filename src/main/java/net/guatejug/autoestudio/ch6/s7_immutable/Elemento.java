package net.guatejug.autoestudio.ch6.s7_immutable;

import java.util.ArrayList;
import java.util.List;

public final class Elemento {

    private final int numeroAtomico;
    private final String nombre;
    private final List<String> alotropia;

    public Elemento(int numeroAtomico, String nombre, List<String> alotropia) {
        // Los tipos primitivos son inmutables, lo que hace innecesario hacer copia defensiva
        this.numeroAtomico = numeroAtomico;
        this.nombre = nombre;

        // ArrayList es mutable, por lo que hay que hacer copia defensiva
        // this.alotropia = alotropia; // esto NO ES copia defensiva
        this.alotropia = new ArrayList<String>(alotropia); // esto SÍ ES copia defensiva
    }

    public int getNumeroAtomico() {
        return numeroAtomico;
    }

    public String getNombre() {
        return nombre;
    }

    /* *
     * Método getAlotropia SIN copia defensiva.
     * Se debe usar la versión descomentada abajo para que Elemento sea totalmente inmutable
     * */
    /* public List<String> getAlotropia() {
        // OJO: ArrayList es mutable. Este método rompe el principio de objeto inmutable.
        return alotropia;
    } */

    /**
     * Método getAlotropia con copia defensiva
     * Corrige la versión comentada en líneas anteriores, que carece de copia defensiva.
    * */
    public List<String> getAlotropia() {
        // ArrayList es mutable, por lo que hay que hacer copia defensiva
        return new ArrayList<String>(alotropia);
    }
}
