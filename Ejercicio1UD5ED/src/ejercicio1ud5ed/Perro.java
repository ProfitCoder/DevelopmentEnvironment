package ejercicio1ud5ed;

/**
 * Implementación de {@link Animal} que representa un perro.
 * <p>
 * Para este ejercicio, el perro puede estar "enfadado" y ese estado se usa para indicar
 * si está ladrando.
 * </p>
 *
 * @author Pablo Manuel Fernandez Velazquez
 * @version 1.0
 * @since 2026-03-01
 */
public class Perro implements Animal {

    /**
     * Nombre del perro.
     */
    private String nombre;

    /**
     * Indica si el perro está enfadado.
     */
    private boolean enfadado;

    /**
     * Talla del perro.
     *
     * @deprecated Atributo no utilizado en el ejercicio.
     */
    @Deprecated
    private String talla;

    /**
     * Crea un perro con el nombre indicado.
     *
     * @param nombre nombre del perro
     */
    public Perro(String nombre) {
        this.nombre = nombre;
        this.enfadado = false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Indica si el perro está enfadado.
     *
     * @return {@code true} si está enfadado; {@code false} en caso contrario
     * @see #setEnfadado(boolean)
     */
    public boolean isEnfadado() {
        return enfadado;
    }

    /**
     * Cambia el estado de enfado del perro.
     *
     * @param enfadado {@code true} si está enfadado; {@code false} en caso contrario
     * @see #isEnfadado()
     */
    public void setEnfadado(boolean enfadado) {
        this.enfadado = enfadado;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String hacerSonido() {
        return "Guau guau";
    }

    /**
     * Indica si el perro está ladrando.
     * <p>
     * En este ejercicio se asume que un perro "ladra" cuando está {@link #isEnfadado() enfadado}.
     * </p>
     *
     * @return {@code true} si ladra; {@code false} en caso contrario
     */
    public boolean isLadrando() {
        return this.enfadado;
    }

    /**
     * Obtiene la talla del perro.
     *
     * @return talla del perro
     * @deprecated Método no utilizado en el ejercicio.
     * @see #setTalla(String)
     */
    @Deprecated
    public String getTalla() {
        return this.talla;
    }

    /**
     * Establece la talla del perro.
     *
     * @param nuevaTalla nueva talla
     * @deprecated Método no utilizado en el ejercicio.
     * @see #getTalla()
     */
    @Deprecated
    public void setTalla(String nuevaTalla) {
        this.talla = nuevaTalla;
    }
}
