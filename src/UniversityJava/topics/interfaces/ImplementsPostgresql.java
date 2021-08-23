package UniversityJava.topics.interfaces;

public class ImplementsPostgresql implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("insertar PosgreSql");
    }

    @Override
    public void listar() {
        System.out.println("listar PosgreSql");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizar PosgreSql");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar PosgreSql");
    }
}
