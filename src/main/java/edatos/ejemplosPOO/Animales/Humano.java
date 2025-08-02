package edatos.ejemplosPOO.Animales;

import edatos.ejemplosPOO.Animales.interfaces.Taxonomia;

/**
 * Clase que representa un humano. Extiende la clase abstracta Animales e implementa la interfaz
 * Taxonomia.
 *
 * @author szalimben
 */
public class Humano extends Animales implements Taxonomia {

    private final String nombre;

    public Humano(String nombre) {
        this.nombre = nombre;
        this.alimento = "Todo bicho que camina";
    }

    @Override
    public String familia() {
        return "Hominidae";
    }

    @Override
    public String especie() {
        return "Homo Sapiens";
    }

    public String getNombre() {
        return this.nombre;
    }
}
