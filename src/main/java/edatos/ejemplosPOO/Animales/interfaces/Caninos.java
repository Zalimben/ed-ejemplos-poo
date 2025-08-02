package edatos.ejemplosPOO.Animales.interfaces;

/**
 * Interfaz que define la taxonomía de los caninos.
 */
public interface Caninos extends Taxonomia {

    @Override
    default String familia() {
        return "Canidae";
    }
}
