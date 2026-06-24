package poo.ejemplos.Animales;

import poo.ejemplos.Animales.interfaces.Volador;

/**
 * Clase que representa un águila.
 *
 * @author szalimben
 */
public class Aguila extends Animal implements Volador {

    public Aguila(String nombre) {
        super(nombre, "", 0);
    }

    public Aguila(String nombre, String alimento, int edad) {
        super(nombre, alimento, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Grito de águila");
    }

    @Override
    public void moverse() {
        volar();
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }
}
