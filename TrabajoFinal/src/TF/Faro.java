package TF;

import Enumerados.Calidad;
import Enumerados.Marca;
import Enumerados.Modelo;

public class Faro extends Accesorio {

    String disenio;

    public Faro(Marca marca, Modelo modelo, int anio, Calidad calidad, String disenio) {
        super(marca, modelo, anio, calidad);
        this.disenio = disenio;
    }

    @Override
    public String toString() {
        return "Faro{" + super.toString() +
                "disenio='" + disenio + '\'' +
                '}';
    }
}
