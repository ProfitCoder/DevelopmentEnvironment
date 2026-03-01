package ejercicio1ud5ed;

/**
 * Implementación de {@link Animal} que representa un gato.
 * <p>
 * Además del nombre, mantiene un estado simple indicando si el gato está ronroneando.
 * </p>
 *
 * @author Pablo Manuel Fernandez Velazquez
 * @version 1.0
 * @since 2026-03-01
 */
public class Gato implements Animal {

    /**
     * Nombre del gato.
     */
    private String nombre;

    /**
     * Indica si el gato está ronroneando.
     */
    private boolean ronronea;

    /**
     * Crea un gato con el nombre indicado.
     *
     * @param nombre nombre del gato
     */
    public Gato(String nombre) {
        this.nombre = nombre;
        this.ronronea = false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Activa o desactiva el estado de ronroneo.
     *
     * @param ronronea {@code true} si debe ronronear; {@code false} en caso contrario
     * @see #isRonroneando()
     */
    public void setRonronea(boolean ronronea) {
        this.ronronea = ronronea;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String hacerSonido() {
        return "Miau";
    }

    /**
     * Indica si el gato está ronroneando en este momento.
     *
     * @return {@code true} si ronronea; {@code false} en caso contrario
     * @see #setRonronea(boolean)
     */
    public boolean isRonroneando() {
        return this.ronronea;
    }
}
