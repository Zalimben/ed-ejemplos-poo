package edatos.ejemplosPOO.Animales;

import edatos.ejemplosPOO.Animales.interfaces.Felinos;

/**
 * Clase que representa al yaguareté, un felino de gran tamaño. Hereda de la clase Animales e
 * implementa la interfaz Felinos.
 *
 * @author szalimben
 */
public class Yaguarete extends Animales implements Felinos {

    public Yaguarete() {
        this.alimento = "Carne";
    }

    @Override
    public String especie() {
        return "Panthera onca";
    }
}
