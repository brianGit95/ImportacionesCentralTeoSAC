package TF;

import Enumerados.Calidad;
import Enumerados.Marca;
import Enumerados.Modelo;

public class Parachoque  extends  Accesorio {

    String posicion;

    public Parachoque(Marca marca, Modelo modelo, int anio, Calidad calidad, String posicion) {
        super(marca, modelo, anio, calidad);
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Parachoque{" +
                super.toString() +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
