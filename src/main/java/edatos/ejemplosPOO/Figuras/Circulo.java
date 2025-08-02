package edatos.ejemplosPOO.Figuras;

/**
 * Adaptación de la clase de ejemplo POO publicada por el Prof. Claudio Barua en el aula virtual de
 * Est. de Datos, FP-UNA
 *
 * @author dezeta
 * @author szalimben
 *
 */
public class Circulo extends Figura {

    private final float radio;

    public Circulo(float r) {
        forma = "Redonda";
        radio = r;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo");
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI * radio * radio);
    }

    @Override
    public float calcularPerimetro() {
        return (float) (2 * Math.PI * radio);
    }
}
