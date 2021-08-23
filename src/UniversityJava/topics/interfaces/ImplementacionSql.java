package UniversityJava.topics.interfaces;

/* Usar implements cuando se usa interfaces
   Usar abstract en la clase para que se quite los errores, así:
   public abstract class ImplementacionSql implements IAccesoDatos*/
public class ImplementacionSql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar SQL");
    }

    @Override
    public void listar() {
        System.out.println("listar SQL");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizar SQL");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar SQL");
    }
}
