package edatos.ejemplosPOO.usoInterfaces;

/**
 * Adaptación de la clase de ejemplo POO publicada por el Prof. Claudio Barua en
 * el aula virtual de Est. de Datos, FP-UNA
 * 
 * Ejemplo de uso de clase Medicamento
 * 
 * @author dezeta
 *
 */
public class TestMedicamento {
	public static void main(String[] args) {
		Medicamento m = new Medicamento();

		m.codigo = 123121;
		m.precio = 10000;
		m.descripcion = "Aspirineta";
		System.out.println(m);
	}
}
