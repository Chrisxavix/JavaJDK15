package UniversityJava.projects.mundopc.dispositivoentrada;

public class Raton extends DispositivosEntrada {
    private final int idRaton;
    /* Darle un identificador propio */
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        /* Llama el constructor de la clase padre con super */
        super(tipoEntrada, marca);
        /* Agregando el contador de ratón */
        this.idRaton = ++Raton.contadorRatones;
    }

    public int getIdRaton() {
        return this.idRaton;
    }

    @Override
    public String toString() {
        return "Raton{ idRaton: " + idRaton + "} " + super.toString();
    }
}
