package edatos.ejemplosPOO.Figuras;

/**
 * Adaptación de la clase de ejemplo POO publicada por el Prof. Claudio Barua en el aula virtual de
 * Est. de Datos, FP-UNA
 *
 * @author dezeta
 * @author szalimben
 */
public class Cuadrado extends Rectangulo {

    public Cuadrado(float largo) {
        super(largo, largo);
        this.forma = "Cuadrada";
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }

}
