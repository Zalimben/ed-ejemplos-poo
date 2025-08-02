package edatos.ejemplosPOO.Animales;

import edatos.ejemplosPOO.Animales.interfaces.Caninos;

/**
 * Clase que representa un lobo. Extiende la clase abstracta Animales e implementa la interfaz
 * Caninos.
 *
 * @author szalimben
 */
public class Lobo extends Animales implements Caninos {

    public Lobo() {
        this.alimento = "Carne";
    }

    @Override
    public String especie() {
        return "Canis Lupus";
    }
}
