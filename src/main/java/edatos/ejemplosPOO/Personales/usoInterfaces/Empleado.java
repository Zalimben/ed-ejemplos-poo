package edatos.ejemplosPOO.Personales.usoInterfaces;

/**
 * Adaptación de la clase de ejemplo POO publicada por el Prof. Claudio Barua en
 * el aula virtual de Est. de Datos, FP-UNA
 * 
 * Definicion de la subclase Empleado que hereda de Persona
 * 
 * @author dezeta
 *
 */
public abstract class Empleado extends Persona {
	protected int sueldo;
	public static final int SALARIO_MINIMO = 2192839;

	public abstract int calcularSalario();

	public Empleado() {
		super();
	}

	public Empleado(int ced, String nom, String ape, byte e, int sueldo) {
		super(ced, nom, ape, e); // setCedula(ced), etc
		setSueldo(sueldo);
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		// se puede validar
		if (sueldo < 0)
			sueldo = 0;
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return super.toString() + " Sueldo: " + sueldo;
	}

}
