package edatos.ejemplosPOO.Animales;


/**
 * Clase de prueba para demostrar el uso de las clases de animales. Crea instancias de Perro, Gato,
 * Lobo y Humano, mostrando sus propiedades. También demuestra el uso de polimorfismo con la clase
 * base Animales.
 *
 * @author szalimben
 */
public class PruebaAnimales {

    public static void main(String[] args) {

        Perro rocky = new Perro();
        System.out.println("Nombre: " + rocky.getNombre());
        System.out.println("Nombre Científico: " + rocky.nombreCientifico());
        System.out.println("Alimento: " + rocky.alimento);
        System.out.println();

        rocky = new Perro("Rocky");
        System.out.println("Nombre: " + rocky.getNombre());
        System.out.println("Nombre Científico: " + rocky.nombreCientifico());
        System.out.println("Alimento: " + rocky.alimento);
        System.out.println();

        Gato michi = new Gato();
        System.out.println("Nombre: " + michi.getNombre());
        System.out.println("Nombre Científico: " + michi.nombreCientifico());
        System.out.println("Alimento: " + michi.alimento);

        System.out.println();

        michi = new Gato("El Gato con Botas");
        System.out.println("Nombre: " + michi.getNombre());
        System.out.println("Nombre Científico: " + michi.nombreCientifico());
        System.out.println("Alimento: " + michi.alimento);
        System.out.println();

        Lobo colmilloDePlata = new Lobo();
        System.out.println("Nombre Científico: " + colmilloDePlata.nombreCientifico());
        System.out.println("Alimento: " + colmilloDePlata.alimento);
        System.out.println();

        Humano finn = new Humano("Finn");
        System.out.println("Nombre Científico: " + finn.nombreCientifico());
        System.out.println("Alimento: " + finn.alimento);
        System.out.println();

        Animales animal = new Perro("Dalmata");
        System.out.println("Nombre: " + ((Perro) animal).getNombre());
        System.out.println("Nombre Científico: " + animal.nombreCientifico());
        System.out.println("Alimento: " + animal.alimento);
        System.out.println();

        animal = new Yaguarete();
        System.out.println("Nombre Científico: " + animal.nombreCientifico());
        System.out.println("Alimento: " + animal.alimento);
        System.out.println();
    }

}
