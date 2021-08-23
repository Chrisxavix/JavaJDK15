package UniversityJava.topics.interfaces;

/* IAccesoDatos: La I por la inicial de Interface */
public interface IAccesoDatos {
    /* Los atributos que se agreguen serán constantes, al ser
       declarado como:
       int MAX_REGISTRO = 10;
       se es reflejado como:
       public static final int MAX_REGISTRO = 10;

       Se debe asignar valores, ya que una interface
       no tiene constructores */
    int MAX_REGISTRO = 10;

    /* Aunque se agregue el método como:
       void insertar();
       se asume que es:
       public abstract void insertar(); */

    void insertar();

    void listar();

    void actualizar();

    void eliminar();
}
