package TF;

import Enumerados.Calidad;
import Enumerados.Marca;
import Enumerados.Modelo;

public class Manija extends Accesorio {

    String color;

    public Manija(Marca marca, Modelo modelo, int anio, Calidad calidad, String color) {
        super(marca, modelo, anio, calidad);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Manija{" + super.toString() +
                "color='" + color + '\'' +
                '}';
    }
}
