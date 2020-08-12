
package edatos.ejemplosPOO.usoInterfaces;

/**
 * Adaptación de la clase de ejemplo POO publicada por el Prof. Claudio Barua en
 * el aula virtual de Est. de Datos, FP-UNA
 * 
 * @author dezeta
 *
 */
public class Jefe extends Empleado {
	public static final int SOBRE_SUELDO = SALARIO_MINIMO;

	public Jefe() {
		super();
	}

	public Jefe(int ced, String nom, String ape, byte edad, int sueldo) {
		super(ced, nom, ape, edad, sueldo);
	}

	@Override
	public int calcularSalario() {
		return (int) ((sueldo + SOBRE_SUELDO) * 0.75);
	}

	@Override
	public String toString() {
		return "Jefe{" + super.toString() + '}';
	}

}
