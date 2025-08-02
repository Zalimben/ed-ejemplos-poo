package edatos.ejemplosPOO.Animales;

import edatos.ejemplosPOO.Animales.interfaces.Felinos;

/**
 * Clase que representa un gato. Extiende la clase abstracta Animales e implementa la interfaz
 * Felinos.
 *
 * @author szalimben
 */
public class Gato extends Animales implements Felinos {

    private final String nombre;

    public Gato() {
        this.nombre = "Michi";
        this.alimento = "Whiskas";
    }

    public Gato(String nombre) {
        this.nombre = nombre;
        this.alimento = "Whiskas";
    }

    @Override
    public String especie() {
        return "Felis catus";
    }

    public String getNombre() {
        return this.nombre;
    }
}
