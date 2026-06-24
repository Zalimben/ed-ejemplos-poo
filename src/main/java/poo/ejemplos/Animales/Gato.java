package poo.ejemplos.Animales;

import poo.ejemplos.Animales.interfaces.Corredor;

/**
 * Clase que representa un gato.
 *
 * @author szalimben
 */
public class Gato extends Animal implements Corredor {

    public Gato() {
        super("Michi", "Whiskas", 0);
    }

    public Gato(String nombre) {
        super(nombre, "Whiskas", 0);
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void correr() {
        System.out.println(nombre + " está corriendo.");
    }

    @Override
    public void emitirSonido() {
        System.out.println("Miau!");
    }

    @Override
    public void moverse() {
        correr();
    }
}
