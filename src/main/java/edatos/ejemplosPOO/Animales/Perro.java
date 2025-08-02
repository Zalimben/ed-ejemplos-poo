package edatos.ejemplosPOO.Animales;

import edatos.ejemplosPOO.Animales.interfaces.Caninos;

/**
 * Clase que representa un perro. Extiende la clase abstracta Animales e implementa la interfaz
 * Caninos.
 *
 * @author szalimben
 */
public class Perro extends Animales implements Caninos {

    private final String nombre;

    public Perro() {
        this.nombre = "Firulais";
        this.alimento = "Pollito";
    }

    public Perro(String nombre) {
        this.nombre = nombre;
        this.alimento = "Pollito";
    }

    @Override
    public String especie() {
        return "Canis familiaris";
    }

    public String getNombre() {
        return this.nombre;
    }
}
