package edatos.ejemplosPOO.usoInterfaces;

/**
 * Adaptación de la clase de ejemplo POO publicada por el Prof. Claudio Barua en
 * el aula virtual de Est. de Datos, FP-UNA
 * 
 * Ejemplo de creacion de clase
 * 
 * @author dezeta
 *
 */
public class Medicamento {
    int codigo;
    String descripcion;
    int precio;

    @Override
    public String toString() {
        return "Medicamento{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
}
