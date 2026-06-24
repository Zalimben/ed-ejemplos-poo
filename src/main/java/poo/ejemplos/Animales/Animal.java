package poo.ejemplos.Animales;

/**
 * Clase abstracta que representa un animal. Implementa la interfaz Taxonomia.
 *
 * @author szalimben
 */
public abstract class Animal {

    protected String nombre;
    protected String alimento;
    protected int edad;

    public Animal(String nombre, String alimento, int edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public abstract void emitirSonido();

    public abstract void moverse();

}
