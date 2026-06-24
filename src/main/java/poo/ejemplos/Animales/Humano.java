package poo.ejemplos.Animales;

import poo.ejemplos.Animales.interfaces.Corredor;

/**
 * Clase que representa un humano.
 *
 * @author szalimben
 */
public class Humano extends Animal implements Corredor {

    public Humano(String nombre) {
        super(nombre, "Todo", 0);
    }

    public Humano(String nombre, String alimento, int edad) {
        super(nombre, alimento, edad);
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void emitirSonido() {
        System.out.println("Hola mundo!");
    }

    @Override
    public void moverse() {
        System.out.println("Manejar");
    }

    @Override
    public void correr() {

    }
}
