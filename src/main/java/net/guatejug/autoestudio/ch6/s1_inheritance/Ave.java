package net.guatejug.autoestudio.ch6.s1_inheritance;

class Ave {

    int tamanio;
    String nombre;

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
