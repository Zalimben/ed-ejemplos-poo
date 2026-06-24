package poo.ejemplos.Animales;

import poo.ejemplos.Animales.interfaces.Nadador;


/**
 * Clase que representa un pez.
 *
 * @author szalimben
 */
public class Pez extends Animal implements Nadador {

    public Pez(String nombre) {
        super(nombre, "", 0);
    }

    public Pez(String nombre, String alimento, int edad) {
        super(nombre, alimento, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println("...");
    }

    @Override
    public void moverse() {
        nadar();
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando.");
    }

}
