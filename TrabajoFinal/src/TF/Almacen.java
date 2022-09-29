package TF;

import Enumerados.Calidad;
import Enumerados.Marca;
import Enumerados.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Almacen {

    private final List<Rack> racks;

    List<Rack> getRacks()
    {
        return racks;
    }

    public Almacen()
    {
        this.racks = new ArrayList<>();

        List<Accesorio> accesoriosA = new ArrayList<>();

        accesoriosA.add(new Espejo(Marca.HYUNDAI, Modelo.ELANTRA, 2015, Calidad.ORIGINAL, "lateral"));
        accesoriosA.add(new Faro(Marca.NISSAN,Modelo.SENTRA,2017,Calidad.ORIGINAL,"vidrio"));

        this.racks.add(new Rack("A",accesoriosA));

        List<Accesorio> accesoriosB = new ArrayList<>();

        accesoriosB.add(new Parachoque(Marca.MITSUBISHI,Modelo.XPANDER,2016,Calidad.CHINA,"trasera"));
        accesoriosB.add(new Manija(Marca.TOYOTA,Modelo.YARIS,2018,Calidad.CHINA,"plateado"));

        this.racks.add(new Rack("B",accesoriosB));

        List<Accesorio> accesoriosC = new ArrayList<>();

        accesoriosC.add(new Parachoque(Marca.HYUNDAI,Modelo.TUCSON,2017,Calidad.ORIGINAL,"delantera"));
        accesoriosC.add(new Espejo(Marca.MITSUBISHI,Modelo.OUTLANDER,2019,Calidad.CHINA,"central"));

        this.racks.add(new Rack("C",accesoriosC));

    }


    void listarAccesorios(int opcion)
    {
        System.out.println();
        Rack rack = racks.get(opcion - 1);

        System.out.println("Accesorios del rack " + rack.getNombre() + ":");
        System.out.println("----------------------------------------------------");

        for (Accesorio accesorio : rack.getAccesorios()) {

            if (accesorio instanceof Espejo espejo)
            {
                System.out.println(espejo);
            }

            if (accesorio instanceof Faro faro)
            {
                System.out.println(faro);
            }

            if (accesorio instanceof Manija manija)
            {
                System.out.println(manija);
            }

            if (accesorio instanceof Parachoque parachoque)
            {
                System.out.println(parachoque);
            }
        }
    }


}
