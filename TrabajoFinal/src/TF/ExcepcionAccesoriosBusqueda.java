package TF;

public class ExcepcionAccesoriosBusqueda extends Exception {

    public ExcepcionAccesoriosBusqueda(String accesorio) {
        super("No se encontro " + accesorio);
    }
}
