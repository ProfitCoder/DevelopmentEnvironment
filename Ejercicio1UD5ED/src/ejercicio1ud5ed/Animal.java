package ejercicio1ud5ed;

/**
 * Contrato común para animales del ejercicio.
 * <p>
 * Define operaciones básicas para obtener el nombre del animal y el sonido que emite.
 * </p>
 *
 * @author Pablo Manuel Fernandez Velazquez
 * @version 1.0
 * @since 2026-03-01
 * @see Perro
 * @see Gato
 */
public interface Animal {

    /**
     * Devuelve el nombre del animal.
     *
     * @return nombre del animal
     */
    String getNombre();

    /**
     * Devuelve el sonido característico del animal.
     *
     * @return sonido del animal (por ejemplo, {@code "Guau guau"} o {@code "Miau"})
     */
    String hacerSonido();
}
