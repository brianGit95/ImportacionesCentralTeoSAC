package TF;

import Enumerados.Calidad;
import Enumerados.Marca;
import Enumerados.Modelo;

public class Accesorio {

    Marca marca;
    Modelo modelo;
    int anio;
    Calidad calidad;

    public Accesorio(Marca marca, Modelo modelo, int anio, Calidad calidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.calidad = calidad;
    }

    @Override
    public String toString() {
        return "Accesorio{" +
                "marca=" + marca +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", calidad='" + calidad + '\'' +
                '}';
    }
}
