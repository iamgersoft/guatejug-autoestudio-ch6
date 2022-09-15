package net.guatejug.autoestudio.ch6.s2_creatingclasses;

class Ave {

    private int tamanio;
    private String nombre;

    protected String color = "indefinido";

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * El método <code>toString()</code> viene desde <code>java.lang.Object</code>,
     *      y para la clase <code>Ave</code> se sobrescribe utilizando la anotación
     *      <code>@Override</code>
     * */
    @Override
    public String toString() {
        return "Ave{" +
                "tamaño=" + tamanio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
