package edatos.ejemplosPOO.Personales.paq1;

/**
 * Adaptación de la clase de ejemplo POO
 * publicada por el Prof. Claudio Barua en el aula virtual
 * de Est. de Datos, FP-UNA
 * 
 * @author dezeta
 *
 */
public abstract class Figura implements Dibujable {

	protected String forma;

	public abstract float calcularArea();

	public Figura() {
		forma = "";
	}

	public String getForma() {
		return forma;
	}

}
