package net.guatejug.autoestudio.ch6.s6_abstract;

import java.io.FileNotFoundException;

public class Puma extends Felino {

    public Puma() {
        System.out.println("Constructor de Puma");
    }

    @Override
    public int getTamanio() {
        return 180;
    }

    @Override
    public void rugir() {
        // Los pumas no rugen como tal, solo ronronean ;)
        System.out.println("purr");
    }

    public int getVelocidad() {
        return 70;
    }

    public String getEspecie() {
        return super.getFamilia() + "/" + "Puma concolor";
    }
}
