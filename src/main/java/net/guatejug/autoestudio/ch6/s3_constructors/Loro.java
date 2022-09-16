package net.guatejug.autoestudio.ch6.s3_constructors;

public class Loro extends Ave {

    private String especie;

    String color;

    /**
     * Constructor Loro
     * Se puede definir cualquier modificador de acceso al constructor:
     * <ul>
     *     <li><code>public Loro() {}</code></li>
     *     <li><code>private Loro() {}</code></li>
     *     <li><code>protected Loro() {}</code></li>
     *     <li><code>Loro() {}</code></li>
     * </ul>
     * */
    public Loro() {
        // super();
        // super(32, "Theo");
        System.out.println("Constructor Loro");
    }

    public String getEspecie() {
        return especie;
    }

    /**
     * <ul>
     *     <li><code>this.especie</code> se refiere al atributo <code>especie</code>
     *          de la clase <code>Loro</code></li>
     *     <li><code>especie</code> se refiere al parámetro <code>especie</code> del método
     *          <code>setEspecie</code></li>
     * </ul>
     * */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Imprime en pantalla el valor del atributo <code>color</code> de la clase
     *      <code>Loro</code>, así como de la clase padre <code>Ave</code>, para
     *      demostrar el uso de la referencia <code>super</code>.
     * */
    public void imprimirColor() {
        System.out.println("super.color (Ave): " + super.color); // indefinido (valor de Ave)
        System.out.println("this.color (Loro): " + this.color); // valor de la instancia de Loro
    }

    public static void main(String[] args) {
        Loro loro = new Loro();
        loro.setEspecie("Amazona autumnalis");
        loro.color = "verde";
        System.out.println(loro.toString());
        System.out.println(loro.getEspecie());
        loro.imprimirColor();
    }
}
