package TF;

import Enumerados.Calidad;
import Enumerados.Marca;
import Enumerados.Modelo;

import java.util.Scanner;

public class View {

    static void menuOpciones(Almacen almacen)
    {
        Scanner sc = new Scanner(System.in);

        String[] opciones = new String[]{"Registrar accesorio","Buscar accesorio","Listar accesorios"};
        int salir = opciones.length + 1;
        int opcion = 1;


        while ( opcion != salir){

            System.out.println();
            System.out.println("Importaciones Central TEO S.A.C");
            System.out.println("-----------------------------");
            System.out.println("Que accion quieres realizar?");
            System.out.println();

            for (int i = 0; i < opciones.length ; i++) {
                System.out.println( (i+1) + ". " + opciones[i]);
            }

            System.out.println(salir + ". Salir");
            System.out.println();
            System.out.print("Ingrese una opcion porfavor: ");

            try {
                opcion = sc.nextInt();

                if (opcion >= 1 && opcion <= opciones.length)
                {
                    switch (opcion) {
                        case 1 -> registarAccesorio(sc, almacen);
                        case 2 -> menuBuscarAccesorio(sc, almacen);
                        case 3 -> menuListarAccesorios(sc, almacen);
                    }
                }
            }

            catch (Exception ex){
                System.out.println("Por favor ingrese un numero entre 1 y " + salir);
                sc.next();
            }
        }

    }

    static void registarAccesorio(Scanner sc,Almacen almacen)
    {
        int salir = almacen.getRacks().size() + 1;

        int opcion = 1;

        while (opcion != salir){

            System.out.println();
            System.out.println("Ingrese el rack donde va ingresar : ");
            System.out.println("------------------------------");

            for (int i = 0; i < almacen.getRacks().size() ; i++) {
                System.out.println( (i+1) + ". Rack " + almacen.getRacks().get(i).getNombre());
            }

            System.out.println(salir + ". Salir");
            System.out.println();
            System.out.print("Ingrese una opcion porfavor: ");

            try {
                opcion = sc.nextInt();

                if (opcion >= 1 && opcion <= almacen.getRacks().size())
                {
                    menuAccesoriosRegistrarRack(sc,almacen,opcion);
                }

            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
                System.out.print("Por favor ingrese un numero entre 1 y " + salir);
                sc.next();
            }
        }



    }
    static void menuBuscarAccesorio(Scanner sc,Almacen almacen)
    {
        int salir = almacen.getRacks().size() + 1;

        int opcion = 1;

        while (opcion != salir){

            System.out.println();
            System.out.println("Ingrese el rack donde buscar : ");
            System.out.println("------------------------------");

            for (int i = 0; i < almacen.getRacks().size() ; i++) {
                System.out.println( (i+1) + ". Rack " + almacen.getRacks().get(i).getNombre());
            }

            System.out.println(salir + ". Salir");
            System.out.println();
            System.out.print("Ingrese una opcion porfavor: ");

            try {
                opcion = sc.nextInt();

                if (opcion >= 1 && opcion <= almacen.getRacks().size())
                {
                    menuAccesoriosBuscarRack(sc,almacen,opcion);
                }

            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
                System.out.print("Por favor ingrese un numero entre 1 y " + salir);
                sc.next();
            }
        }
    }


    static void menuAccesoriosBuscarRack(Scanner sc,Almacen almacen,int indiceRack)
    {
        String[] accesorios = new String[]{"Espejo","Faro","Manija","Parachoque"};
        int salir = accesorios.length + 1;

        int opcion = 1;

        while (opcion != salir){

            System.out.println();
            System.out.println("Ingrese el accesorio a buscar : ");
            System.out.println("------------------------------");

            for (int i = 0; i < accesorios.length ; i++) {
                System.out.println( (i+1) + ". "+accesorios[i]);
            }

            System.out.println(salir + ". Salir");
            System.out.println();
            System.out.print("Ingrese una opcion porfavor: ");

            try {
                opcion = sc.nextInt();

                if (opcion >= 1 && opcion <= accesorios.length)
                {
                    buscarAccesorioRack(almacen,indiceRack,accesorios[opcion - 1],opcion);
                }

            }catch (ExcepcionAccesoriosBusqueda ex){
                System.out.println(ex.getMessage());
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
                System.out.print("Por favor ingrese un numero entre 1 y " + salir);
                sc.next();
            }
        }

    }


    static void menuAccesoriosRegistrarRack(Scanner sc,Almacen almacen,int indiceRack)
    {
        String[] accesorios = new String[]{"Espejo","Faro","Manija","Parachoque"};
        int salir = accesorios.length + 1;

        int opcion = 1;

        while (opcion != salir){

            System.out.println();
            System.out.println("Ingrese el accesorio a registrar : ");
            System.out.println("------------------------------");

            for (int i = 0; i < accesorios.length ; i++) {
                System.out.println( (i+1) + ". "+accesorios[i]);
            }

            System.out.println(salir + ". Salir");
            System.out.println();
            System.out.print("Ingrese una opcion porfavor: ");

            try {
                opcion = sc.nextInt();

                if (opcion >= 1 && opcion <= accesorios.length)
                {
                    registrarAccesorioRack(sc,almacen,indiceRack,opcion);
                }

            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
                System.out.print("Por favor ingrese un numero entre 1 y " + salir);
                sc.next();
            }
        }

    }

    static void menuListarAccesorios(Scanner sc,Almacen almacen)
    {
        int salir = almacen.getRacks().size() + 1;
        int opcion = 1;

        while (opcion != salir){

            System.out.println();
            System.out.println("Ingrese el rack : ");
            System.out.println("------------------------------");

            for (int i = 0; i < almacen.getRacks().size() ; i++) {
                System.out.println( (i+1) + ". Rack " + almacen.getRacks().get(i).getNombre());
            }

            System.out.println(salir + ". Salir");
            System.out.println();
            System.out.print("Ingrese una opcion porfavor: ");

            try {
                opcion = sc.nextInt();

                if (opcion >= 1 && opcion <= almacen.getRacks().size())
                {
                    almacen.listarAccesorios(opcion);
                }

            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
                System.out.print("Por favor ingrese un numero entre 1 y " + salir);
                sc.next();
            }
        }

    }


    static void buscarAccesorioRack(Almacen almacen, int indiceRack, String nombreAccesorio, int opcionAccesorio) throws ExcepcionAccesoriosBusqueda  {

        Rack rack = almacen.getRacks().get(indiceRack - 1);
        System.out.println();
        System.out.println(nombreAccesorio+"s" + " en el rack : " + rack.getNombre());
        System.out.println("---------------------------------");

        switch (opcionAccesorio) {
            case 1 -> {
                boolean sinEspejos = true;
                for (Accesorio accesorio : rack.getAccesorios()) {

                    if (accesorio instanceof Espejo espejo) {
                        sinEspejos = false;
                        System.out.println(espejo);
                    }

                }
                if (sinEspejos) {
                    throw new ExcepcionAccesoriosBusqueda("ningun espejo.");
                }
            }
            case 2 -> {
                boolean sinFaro = true;
                for (Accesorio accesorio : rack.getAccesorios()) {

                    if (accesorio instanceof Faro faro) {
                        sinFaro = false;
                        System.out.println(faro);
                    }

                }

                if (sinFaro) {
                    throw new ExcepcionAccesoriosBusqueda("ningun faro.");
                }

            }
            case 3 -> {
                boolean sinManijas = true;
                for (Accesorio accesorio : rack.getAccesorios()) {

                    if (accesorio instanceof Manija manija) {
                        sinManijas = false;
                        System.out.println(manija);
                    }

                }

                if (sinManijas) {
                    throw new ExcepcionAccesoriosBusqueda("ninguna manija.");
                }
            }
            case 4 -> {
                boolean sinParachoques = true;
                for (Accesorio accesorio : rack.getAccesorios()) {

                    if (accesorio instanceof Parachoque parachoque) {
                        sinParachoques = false;
                        System.out.println(parachoque);
                    }

                }
                if (sinParachoques) {
                    throw new ExcepcionAccesoriosBusqueda("ningun parachoques.");
                }
            }
        }
    }


    static void registrarAccesorioRack(Scanner sc,Almacen almacen,int indiceRack,int opcionAccesorio)
    {
        Marca marcaElegida = menuMarcas(sc);
        if(marcaElegida == null) return;

        Modelo modeloElegido = menuModelosMarca(sc,marcaElegida);
        if(modeloElegido == null) return;

        Calidad calidadElegida = menuCalidad(sc);
        if(calidadElegida == null) return;

        System.out.print("Ingresa el anio del accesorio: ");
        int anio = sc.nextInt();

        Accesorio accesorio = null;

        switch (opcionAccesorio) {
            case 1 -> {

                System.out.print("Ingresa el tipo del espejo (lateral o central): ");
                String tipo = sc.next();

                accesorio = new Espejo(marcaElegida,modeloElegido,anio,calidadElegida,tipo);

            }
            case 2 -> {

                System.out.print("Ingresa el disenio del faro (vidrio/plastico): ");
                String disenio = sc.next();

                accesorio = new Faro(marcaElegida,modeloElegido,anio,calidadElegida,disenio);

            }
            case 3 -> {

                System.out.print("Ingresa el color de la manija: ");
                String color = sc.next();

                accesorio = new Manija(marcaElegida,modeloElegido,anio,calidadElegida,color);

            }
            case 4 -> {

                System.out.print("Ingresa la posicion de la manija (trasera/delantera): ");
                String posicion = sc.next();

                accesorio = new Parachoque(marcaElegida,modeloElegido,anio,calidadElegida,posicion);

            }
        }


        almacen.getRacks().get(indiceRack - 1).agregarAccesorio(accesorio);

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("Accesorio registrado correctamente.");
        System.out.println("------------------------------------");

    }

    static Marca menuMarcas(Scanner sc)
    {
        Marca[] marcas = new Marca[]{Marca.HYUNDAI,Marca.MITSUBISHI,Marca.NISSAN,Marca.TOYOTA};
        int salir = marcas.length + 1;

        int opcion = 1;

        while (opcion != salir){

            System.out.println();
            System.out.println("Ingrese la marca del accesorio : ");
            System.out.println("------------------------------");

            for (int i = 0; i < marcas.length ; i++) {
                System.out.println( (i+1) + ". "+marcas[i]);
            }

            System.out.println(salir + ". Salir");
            System.out.println();
            System.out.print("Ingrese una opcion porfavor: ");

            try {
                opcion = sc.nextInt();

                if (opcion >= 1 && opcion <= marcas.length)
                {
                    return marcas[opcion - 1];
                }

            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
                System.out.print("Por favor ingrese un numero entre 1 y " + salir);
                sc.next();
            }
        }

        return null;

    }

    static Modelo menuModelosMarca(Scanner sc,Marca marca)
    {
        Modelo[] modelos = modelosMarca(marca);

        int salir = modelos.length + 1;

        int opcion = 1;

        while (opcion != salir){

            System.out.println();
            System.out.println("Ingrese el modelo de la marca : ");
            System.out.println("------------------------------");

            for (int i = 0; i < modelos.length ; i++) {
                System.out.println( (i+1) + ". "+modelos[i]);
            }

            System.out.println(salir + ". Salir");
            System.out.println();
            System.out.print("Ingrese una opcion porfavor: ");

            try {
                opcion = sc.nextInt();

                if (opcion >= 1 && opcion <= modelos.length)
                {
                    return modelos[opcion - 1];
                }

            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
                System.out.print("Por favor ingrese un numero entre 1 y " + salir);
                sc.next();
            }
        }

        return null;
    }

    static Calidad menuCalidad(Scanner sc)
    {
        Calidad[] calidades = new Calidad[]{Calidad.ORIGINAL,Calidad.CHINA};

        int salir = calidades.length + 1;

        int opcion = 1;

        while (opcion != salir){

            System.out.println();
            System.out.println("Ingrese la calidad del accesorio: ");
            System.out.println("------------------------------");

            for (int i = 0; i < calidades.length ; i++) {
                System.out.println( (i+1) + ". "+calidades[i]);
            }

            System.out.println(salir + ". Salir");
            System.out.println();
            System.out.print("Ingrese una opcion porfavor: ");

            try {
                opcion = sc.nextInt();

                if (opcion >= 1 && opcion <= calidades.length)
                {
                    return calidades[opcion - 1];
                }

            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
                System.out.print("Por favor ingrese un numero entre 1 y " + salir);
                sc.next();
            }
        }

        return null;
    }

    static Modelo[] modelosMarca(Marca marca)
    {

        return switch (marca) {
            case MITSUBISHI -> new Modelo[]{Modelo.XPANDER, Modelo.NEWASX, Modelo.OUTLANDER};
            case TOYOTA -> new Modelo[]{Modelo.YARIS, Modelo.COROLLA, Modelo.FORTUNER};
            case HYUNDAI -> new Modelo[]{Modelo.ELANTRA, Modelo.TUCSON, Modelo.ACCENT};
            case NISSAN -> new Modelo[]{Modelo.SENTRA, Modelo.VERSA, Modelo.XTRAIL};
        };

    }


}
