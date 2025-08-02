package edatos.ejemplosPOO.Personales.interfaces;

import java.util.Date;

/**
 * Adaptación de la clase de ejemplo POO publicada por el Prof. Claudio Barua en
 * el aula virtual de Est. de Datos, FP-UNA
 * 
 * Interface que define operaciones comunes a todos los trabajadores
 * 
 * @author dezeta
 *
 */
public interface Trabajador {
	
	public Date marcarEntrada();

	public Date marcarSalida();

	public void trabajar();

	public int cobrarSalario();
}
