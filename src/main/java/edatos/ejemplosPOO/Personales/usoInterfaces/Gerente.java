
package edatos.ejemplosPOO.Personales.usoInterfaces;

import java.util.Calendar;
import java.util.Date;

import edatos.ejemplosPOO.Personales.interfaces.Caminante;
import edatos.ejemplosPOO.Personales.interfaces.Trabajador;

/**
 * Adaptación de la clase de ejemplo POO publicada por el Prof. Claudio Barua en
 * el aula virtual de Est. de Datos, FP-UNA
 * 
 * @author dezeta
 *
 */
public class Gerente extends Empleado implements Caminante, Trabajador {
	private int responCargo;

	public Gerente() {
	}

	public Gerente(int ced, String nom, int suel, int responCargo) {
		// super(ced, nom, sueldo);
		cedula = ced; // protected en Persona
		nombre = nom; // protected en Persona
		sueldo = suel; // friendly en Empleado
		this.responCargo = responCargo;
	}

	@Override
	public String toString() {
		return super.toString() + " Adicional por responsab. " + responCargo;
	}

	public int getResponCargo() {
		return responCargo;
	}

	public void setResponCargo(int responCargo) {
		this.responCargo = responCargo;
	}

	public void caminar(int pasos) {
		System.out.println("Gerente Caminando " + pasos + " pasos");
	}

	public void trotar(float km) {
		System.out.println("Gerente trotando " + km + "km");
	}

	public void correr(float km) {
		System.out.println("Gerente corriendo " + km + "km");
	}

	public Date marcarEntrada() {
		Calendar c = Calendar.getInstance();
		return c.getTime();
	}

	public Date marcarSalida() {
		Calendar c = Calendar.getInstance();
		return c.getTime();
	}

	public void trabajar() {
		System.out.println("Gerente trabajando");
	}

	public int cobrarSalario() {
		return sueldo + responCargo;
	}

	@Override
	public int calcularSalario() {
		return sueldo + responCargo;
	}

}
