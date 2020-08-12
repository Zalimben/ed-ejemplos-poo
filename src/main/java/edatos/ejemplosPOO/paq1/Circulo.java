package edatos.ejemplosPOO.paq1;

/**
 * Adaptación de la clase de ejemplo POO
 * publicada por el Prof. Claudio Barua en el aula virtual
 * de Est. de Datos, FP-UNA
 * 
 * @author dezeta
 *
 */
public class Circulo extends Figura {

	private float radio;

	public void dibujar() {
		System.out.println("Dibujando un circulo");
	}

	public Circulo(float r) {
		forma = "Redonda";
		radio = r;
	}

	public float calcularArea() {
		return (float) (Math.PI * radio * radio);
	}
}
