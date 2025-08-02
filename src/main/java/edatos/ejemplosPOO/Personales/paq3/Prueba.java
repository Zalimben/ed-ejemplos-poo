package edatos.ejemplosPOO.Personales.paq3;

import edatos.ejemplosPOO.Personales.paq1.Circulo;
import edatos.ejemplosPOO.Personales.paq1.Dibujable;
import edatos.ejemplosPOO.Personales.paq1.Figura;
import edatos.ejemplosPOO.Personales.paq2.Cuadrado;
import edatos.ejemplosPOO.paq1.*;
import edatos.ejemplosPOO.paq2.*;

/**
 * Adaptación de la clase de ejemplo POO
 * publicada por el Prof. Claudio Barua en el aula virtual
 * de Est. de Datos, FP-UNA
 * 
 * @author dezeta
 *
 */
public class Prueba {

	private static void procesarFigura(Figura f) {
		System.out.print(f.getForma() + "->");
		System.out.println("Area " + f.calcularArea());
		f.dibujar();
		System.out.println();
	}

	private static void procesarDibujable(Dibujable d) {
		System.out.println("->Dibujable");
		d.dibujar();
		System.out.println();
	}

	public static void main(String[] a) {
		//Se generan 2 objetos especificos e imprimen en pantalla
		Circulo c1 = new Circulo(10);
		Cuadrado c2 = new Cuadrado(10);

		procesarFigura(c1);
		procesarFigura(c2);
		
		//Tambien se puede usar como Dibujable
		procesarDibujable(c1);
		procesarDibujable(c2);
		
		//Polimorfismo y enlace dinamico.. F es una variable polimorfica
		System.out.println("---- Probando el Polimorfismo y Enlace Dinamico -----");
		Figura f;
		int moneda = 1 + (int) (Math.random() * 99);
		if (moneda < 50) {
			f = new Circulo(10);
		} else {
			f = new Cuadrado(10);
		}
		procesarFigura(f);
	}
}
