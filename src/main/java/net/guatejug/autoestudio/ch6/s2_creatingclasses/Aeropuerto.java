package net.guatejug.autoestudio.ch6.s2_creatingclasses;

/**
 * Clase Ubicacion (top-level type).
 * <ol>
 *     <li>No tiene el mismo nombre del archivo .java</li>
 *     <li>Por esa razón solo puede tener el modificador de acceso <i>package</i></li>
 * </ol>
 * */
class Ubicacion {
    double latitud;
    double longitud;
}

/**
 * Clase Aeropuerto (top-level class).
 * Al tener el mismo nombre que el archivo .java:
 * <ol>
 *     <li>Sí puede usar el modificador <code>public</code></li>
 *     <li>Es el único tipo permitido para ser <code>public</code></li>
 * </ol>
 * */
 public class Aeropuerto {
    Ubicacion ubicacion;
    String nombre;
    String codigoIata;
    String codigoIcao;
    double altitud;

    public static void main(String[] args) {
        Aeropuerto aeropuerto = new Aeropuerto();
        aeropuerto.codigoIata = "GUA";
        aeropuerto.codigoIcao = "MGGT";
        aeropuerto.nombre = "La Aurora";
        aeropuerto.altitud = 4952.0;
        aeropuerto.ubicacion.latitud = 14.5833;
        aeropuerto.ubicacion.longitud = -90.5275;
    }
}
