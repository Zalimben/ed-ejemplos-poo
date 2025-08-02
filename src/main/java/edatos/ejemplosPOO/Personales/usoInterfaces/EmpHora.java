
package edatos.ejemplosPOO.Personales.usoInterfaces;

/**
 * Adaptación de la clase de ejemplo POO publicada por el Prof. Claudio Barua en
 * el aula virtual de Est. de Datos, FP-UNA
 * 
 * @author dezeta
 *
 */
public class EmpHora extends Empleado {
	private int salarioHora;
	private float cantHoras;
	public static final int TOTAL_HORAS = 192;

	public EmpHora() {
	}

	public EmpHora(int ced, String nom, String ape, byte e, int salarioHora, float cantHoras) {
		super(ced, nom, ape, e, 0);
		setSalarioHora(salarioHora);
		setCantHoras(cantHoras);
	}

	public int getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(int salarioHora) {
		// validar que el salarioHora no sea menor que
		// sueldo minimo / TOTAL_HORAS
		this.salarioHora = salarioHora;
	}

	public float getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(float cant) {
		if (cant > TOTAL_HORAS)
			cant = TOTAL_HORAS;
		this.cantHoras = cant;
	}

	@Override
	public int calcularSalario() {
		sueldo = (int) (salarioHora * cantHoras);
		return (int) (salarioHora * cantHoras * 0.75);
	}

	@Override
	public String toString() {
		return "EmpHora{" + super.toString() + " Salario x Hora=" + salarioHora + ", cant Horas trab=" + cantHoras
				+ '}';
	}
}
