package edatos.ejemplosPOO.Figuras;

public class Rectangulo extends Figura {

    private final float largo;
    private final float ancho;

    public Rectangulo(float largo, float ancho) {
        this.forma = "Rectangulo";
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public float calcularArea() {
        return this.largo * this.ancho;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Rectangulo");
    }

    @Override
    public float calcularPerimetro() {
        return 2 * (this.largo + this.ancho);
    }
}
