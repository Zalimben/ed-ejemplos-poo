package edatos.ejemplosPOO.Figuras;

/**
 * Adaptación de la clase de ejemplo POO publicada por el Prof. Claudio Barua en el aula virtual de
 * Est. de Datos, FP-UNA
 *
 * @author dezeta
 * @author szalimben
 *
 */
public abstract class Figura implements Dibujable {

    protected String forma;

    public abstract float calcularArea();

    public abstract float calcularPerimetro();

    public Figura() {
        forma = "";
    }

    public String getForma() {
        return forma;
    }

}
