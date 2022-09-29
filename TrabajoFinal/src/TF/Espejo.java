package TF;

import Enumerados.Calidad;
import Enumerados.Marca;
import Enumerados.Modelo;

public class Espejo extends Accesorio {

    String tipo;

    public Espejo(Marca marca, Modelo modelo, int anio, Calidad calidad, String tipo) {
        super(marca, modelo, anio, calidad);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Espejo{" +
                super.toString() +
                "tipo='" + tipo + '\''+
                '}';
    }
}
