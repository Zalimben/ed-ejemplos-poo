package edatos.ejemplosPOO.Animales.interfaces;

/**
 * Interfaz que define la taxonomía de un animal. Proporciona métodos para obtener la familia,
 * especie y nombre científico del animal.
 *
 * @author szalimben
 */
public interface Taxonomia {

    /**
     * Familia del Animal
     */
    String familia();

    /**
     * Especie del Animal
     */
    String especie();

    /**
     * Nombre Científico
     */
    default String nombreCientifico() {
        return familia() + " " + especie();
    }

}
