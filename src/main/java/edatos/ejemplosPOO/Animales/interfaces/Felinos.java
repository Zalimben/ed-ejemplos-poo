package edatos.ejemplosPOO.Animales.interfaces;

/**
 * Interfaz que define la taxonomía de los felinos. Implementa la interfaz Taxonomia.
 */
public interface Felinos extends Taxonomia {

    @Override
    default String familia() {
        return "Felidae";
    }

}
