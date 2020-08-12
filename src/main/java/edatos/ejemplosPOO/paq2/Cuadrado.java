package edatos.ejemplosPOO.paq2;

import edatos.ejemplosPOO.paq1.*;

/**
 * Adaptación de la clase de ejemplo POO
 * publicada por el Prof. Claudio Barua en el aula virtual
 * de Est. de Datos, FP-UNA
 * 
 * @author dezeta
 *
 */
public class Cuadrado extends Figura {
	private float lado;

	public void dibujar() {
		System.out.println("Dibujando un cuadrado");
	}

	public Cuadrado(float l) {
		lado = l;
		forma = "Cuadrada";
	}

	public float calcularArea() {
		return lado * lado;
	}

	public float getPerimetro() {
		return lado * 4;
	}

}
