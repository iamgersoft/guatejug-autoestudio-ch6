package net.guatejug.autoestudio.ch6.s2_creatingclasses;

public class Loro extends Ave {

    private String especie;

    String color;

    public String getEspecie() {
        return especie;
    }

    /**
     * <ul>
     *     <li><code>this.especie</code> se refiere al atributo <code>especie</code>
     *          de la clase <code>Loro</code></li>
     *     <li><code>especie</code> se refiere al parámetro especie del método
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
        // loro.nombre = "Theo"; // No se permite porque el atributo nombre de la clase padre (Ave) es private
        loro.setNombre("Theo");
        loro.setTamanio(20);
        loro.setEspecie("Amazona autumnalis");
        loro.color = "verde";
        System.out.println(loro);
        System.out.println(loro.getEspecie());
        loro.imprimirColor();
    }
}
