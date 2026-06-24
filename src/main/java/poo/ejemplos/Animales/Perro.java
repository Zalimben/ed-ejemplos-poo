package poo.ejemplos.Animales;

import poo.ejemplos.Animales.interfaces.Corredor;

/**
 * Clase que representa un perro.
 *
 * @author szalimben
 */
public class Perro extends Animal implements Corredor {

    public Perro() {
        super("Firulais", "Pollito", 0);
    }

    public Perro(String nombre) {
        super(nombre, "Pollito", 0);
    }

    public Perro(String nombre, String alimento) {
        super(nombre, alimento, 0);
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void emitirSonido() {
        System.out.println("Guau Guau");
    }

    @Override
    public void moverse() {
        correr();
    }

    @Override
    public void correr() {
        System.out.println(nombre + " está corriendo.");
    }
}
