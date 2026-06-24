package poo.ejemplos.Animales;


/**
 * Clase de prueba para demostrar el uso de las clases de animales. También demuestra el uso de
 * polimorfismo con la clase base Animal.
 *
 * @author szalimben
 */
public class PruebaAnimales {

    public static void main(String[] args) {

        Perro rocky = new Perro();
        System.out.println("Nombre: " + rocky.getNombre());
        System.out.println("Alimento: " + rocky.alimento);
        System.out.println();

        rocky = new Perro("Michael");
        System.out.println("Nombre: " + rocky.getNombre());
        System.out.println("Alimento: " + rocky.alimento);
        System.out.println();

        Gato michi = new Gato();
        System.out.println("Nombre: " + michi.getNombre());
        System.out.println("Alimento: " + michi.alimento);

        System.out.println();

        michi = new Gato("Botones");
        System.out.println("Nombre: " + michi.getNombre());
        System.out.println("Alimento: " + michi.alimento);
        System.out.println();

        Humano finn = new Humano("Finn");
        System.out.println("Alimento: " + finn.alimento);
        System.out.println();

        // Ejemplo Polimorfismo
        Animal[] animales = {new Perro("Firulais"), new Aguila("Real"), new Pez("Nemo")};

        for (Animal animal : animales) {
            animal.emitirSonido();
            animal.moverse();
        }
    }

}
