package UniversityJava.topics.bloquescodigo;

public class BloquesCodigo {
    private final int idPersona;
    private static int contadorPersonas;

    /* Bloque de inicialización static
       Se carga una sola vez */
    static {
        System.out.println("Static");
        /* No se puede y debe usar el operador this
           Solo se habilitan variables static, por ende
           idPersona no puede ser inicializada */
        ++BloquesCodigo.contadorPersonas;
        /* idPersona = 10; */
    }

    /* Bloque de inicialización no static
       Se carga cada que se crea un objeto  */
    {
        System.out.println("No static");
        this.idPersona = BloquesCodigo.contadorPersonas++;
    }

    public BloquesCodigo() {
        System.out.println("Constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }
}
