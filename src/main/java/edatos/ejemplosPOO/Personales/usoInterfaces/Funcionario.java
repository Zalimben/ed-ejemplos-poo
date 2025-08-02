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
public class Funcionario extends Empleado implements Caminante, Trabajador {
	private int beneficio;

	public Funcionario() {
	}

	public Funcionario(int ced, String nom, int suel, int beneficio) {
		// super(ced, nom, suel);
		cedula = ced;
		nombre = nom;
		sueldo = suel;
		this.beneficio = beneficio;
	}

	@Override
	public String toString() {
		return super.toString() + " Beneficio: " + beneficio; // To change body
																// of generated
																// methods,
																// choose Tools
																// | Templates.
	}

	public int getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(int beneficio) {
		this.beneficio = beneficio;
	}

	public void caminar(int pasos) {
		System.out.println("Funcionario Caminando " + pasos + " pasos");
	}

	public void trotar(float km) {
		System.out.println("Funcionario Trotando " + km + "km");
	}

	public void correr(float km) {
		System.out.println("Funcionario Corriendo " + km + "km");
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
		System.out.println("Funcionario trabajando");
	}

	public int cobrarSalario() {
		return sueldo + beneficio;
	}

	@Override
	public int calcularSalario() {
		return sueldo + beneficio;
	}

}
