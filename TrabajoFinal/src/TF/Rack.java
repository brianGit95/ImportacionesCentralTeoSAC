package TF;

import Enumerados.NombreRack;

import java.util.List;

public class Rack {

    private final String nombre;
    private final List<Accesorio> accesorios;

    public String getNombre() {
        return nombre;
    }

    public List<Accesorio> getAccesorios() {
        return accesorios;
    }

    public Rack(String nombre, List<Accesorio> accesorios) {
        this.nombre = nombre;
        this.accesorios = accesorios;
    }

    public void agregarAccesorio(Accesorio accesorio)
    {
        accesorios.add(accesorio);
    }

    @Override
    public String toString() {
        return "Rack{" +
                "nombre='" + nombre + '\'' +
                ", accesorios=" + accesorios +
                '}';
    }
}
