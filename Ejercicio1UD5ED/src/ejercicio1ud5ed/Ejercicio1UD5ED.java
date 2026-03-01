package ejercicio1ud5ed;

/**
 * Clase principal del ejercicio.
 * <p>
 * Crea instancias de {@link Perro} y {@link Gato} y muestra por consola información
 * básica usando los métodos definidos en la interfaz {@link Animal}.
 * </p>
 *
 * @author Pablo Manuel Fernandez Velazquez
 * @version 1.0
 * @since 2026-03-01
 * @see Animal
 */
public class Ejercicio1UD5ED {

    /**
     * Punto de entrada de la aplicación.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Crear un perro
        Perro perro = new Perro("Fido");
        perro.setEnfadado(true);

        // Crear un gato
        Gato gato = new Gato("Garfield");

        // Mostrar información sobre el perro
        System.out.println("Nombre del perro: " + perro.getNombre());
        System.out.println("Sonido del perro: " + perro.hacerSonido());
        System.out.println("¿Está ladrando? " + perro.isLadrando());

        // Mostrar información sobre el gato
        System.out.println("Nombre del gato: " + gato.getNombre());
        System.out.println("Sonido del gato: " + gato.hacerSonido());
        System.out.println("¿Está ronroneando? " + gato.isRonroneando());
    }

}
