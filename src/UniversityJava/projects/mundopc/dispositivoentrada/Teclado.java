package UniversityJava.projects.mundopc.dispositivoentrada;

public class Teclado extends DispositivosEntrada{
    private final int idTeclado;
    /* Darle un identificador propio */
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    public int getIdTeclado() {
        return this.idTeclado;
    }

    @Override
    public String toString() {
        return "Teclado{ idTeclado: " + idTeclado + "} " + super.toString();
    }
}
