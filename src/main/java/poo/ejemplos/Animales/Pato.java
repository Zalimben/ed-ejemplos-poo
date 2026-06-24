package poo.ejemplos.Animales;

import poo.ejemplos.Animales.interfaces.Corredor;
import poo.ejemplos.Animales.interfaces.Nadador;
import poo.ejemplos.Animales.interfaces.Volador;

/**
 * Clase que representa un pato.
 * Observar que esta clase implementa 3 interfaces para definir el comportamiento
 *
 * @author szalimben
 */
public class Pato extends Animal implements Volador, Nadador, Corredor {

    public Pato(String nombre) {
        super(nombre, "insectos", 0);
    }

    public Pato(String nombre, int edad) {
        super(nombre, "", edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Cuac Cuac");
    }

    @Override
    public void moverse() {
        volar();
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando.");
    }

    @Override
    public void correr() {
        System.out.println(nombre + " está caminando.");
    }
}
