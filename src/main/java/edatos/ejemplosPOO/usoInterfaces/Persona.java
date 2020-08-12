package edatos.ejemplosPOO.usoInterfaces;

/**
 * Adaptación de la clase de ejemplo POO publicada por el Prof. Claudio Barua en
 * el aula virtual de Est. de Datos, FP-UNA
 * 
 * Definicion de la clase Persona con propiedades y metodos
 * 
 * @author dezeta
 *
 */
public class Persona {
	protected int cedula;
	protected String nombre;
	protected String apellido;
	protected byte edad;

	/**
	 * Constructor for objects of class Persona
	 */
	public Persona() {
		nombre = "NN";
		apellido = "NN";
	}

	public Persona(int ced, String nom, String ape, byte e) {
		setCedula(ced);
		setNombre(nom);
		setApellido(ape);
		setEdad(e);
	}

	/**
	 * Metodo que permite obtener la cedula de la persona
	 * 
	 * @return la cedula de la persona
	 */
	public int getCedula() {
		return cedula;
	}

	public void setCedula(int ced) {
		cedula = ced;
	}

	public String toString() {
		return cedula + " " + nombre + " " + apellido + " edad " + edad;
	}

	public void setNombre(String nom) {
		nombre = nom;
	}

	public String getNombre() {
		return nombre;
	}

	public void setApellido(String ape) {
		apellido = ape;
	}

	public String getApellido() {
		return apellido;
	}

	public void setEdad(byte ed) {
		edad = ed;
	}

	public byte getEdad() {
		return edad;
	}

}
