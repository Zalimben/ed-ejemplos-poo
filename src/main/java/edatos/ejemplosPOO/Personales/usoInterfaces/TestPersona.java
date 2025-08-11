package edatos.ejemplosPOO.Personales.usoInterfaces;

/**
 * Adaptación de la clase de ejemplo POO publicada por el Prof. Claudio Barua en
 * el aula virtual de Est. de Datos, FP-UNA
 * 
 * Ejemplo de uso de clase Persona
 * 
 * @author dezeta
 * @author szalimben
 *
 */
public class TestPersona {
	public TestPersona() {
		probarPersona();
	}

	public static void main(String[] args) {
		new TestPersona();
	}

	private void probarPersona() {
		// Caminante c = new Persona();
		// c.correr();
		Persona p1 = new Persona();
		System.out.println(p1);
		p1.setCedula(1123234);
		p1.setNombre("Luisa");
		p1.setApellido("Acosta");
		p1.setEdad((byte) 24);
		System.out.println(p1.toString());

		Persona p2 = new Persona(123456, "Juan", "Vera", (byte) 34);
		System.out.println(p2);
	}

}
