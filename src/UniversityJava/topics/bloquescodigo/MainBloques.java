package UniversityJava.topics.bloquescodigo;

public class MainBloques {
    public static void main(String[] args) {
        BloquesCodigo bloque1 = new BloquesCodigo();
        BloquesCodigo bloque2 = new BloquesCodigo();
        System.out.println("Valor " + bloque1.getIdPersona());
        /* Después del segundo objeto ya no se carga el static,
           ya que solo lo hará una sola vez */
        System.out.println("Valor " + bloque2.getIdPersona());
    }
}
