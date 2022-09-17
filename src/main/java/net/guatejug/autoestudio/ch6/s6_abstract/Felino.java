package net.guatejug.autoestudio.ch6.s6_abstract;

import java.io.IOException;

public abstract class Felino {

    public abstract int getTamanio();

    public abstract void rugir();

    public String getFamilia() {
        return "Felidae";
    }
}
