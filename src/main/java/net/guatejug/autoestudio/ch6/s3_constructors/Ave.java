package net.guatejug.autoestudio.ch6.s3_constructors;

public class Ave {

    private int tamanio;
    private String nombre;

    protected String color = "indefinido";

    /* *
     *  Constructor por defecto definido por Java (si no hay más constructores definidos en la clase)
     * */
    /* public Ave() {

    } */

    /**
     * Constructor definido por el usuario (sin parámetros).
     * Se puede definir cualquier modificador de acceso al constructor:
     * <ul>
     *     <li><code>public Ave() {}</code></li>
     *     <li><code>private Ave() {}</code> (véase clase hija)</li>
     *     <li><code>protected Ave() {}</code></li>
     *     <li><code>Ave() {}</code></li>
     * </ul>
    * */
    public Ave() {
        this(0, "Foo");
        System.out.println("Constructor Ave");
        // this.tamanio = 0;
        // this.nombre = "Foo";
    }

    /* *
     * Constructor con dos parámetros
    * */
    public Ave(int tamanio, String nombre) {
        System.out.println("Constructor Ave con parámetros");
        this.tamanio = tamanio;
        this.nombre = nombre;
    }

    /* *
    Constructor no válido
    */
    /* public ave {

    }*/

    /**
    Constructor no válido
    */
    /*
    public void Ave {

    }*/

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
