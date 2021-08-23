package UniversityJava.topics.interfaces.test;

import UniversityJava.topics.interfaces.IAccesoDatos;
import UniversityJava.topics.interfaces.ImplementacionSql;
import UniversityJava.topics.interfaces.ImplementsPostgresql;

public class TestInterfaces {
    public static void main(String[] args) {
        /*Definir variables del tipo interface*/
        /* No se puede crear objetos de una interface */
        IAccesoDatos conexionsql = new ImplementacionSql();
        IAccesoDatos conexionPosgresql = new ImplementsPostgresql();
        /* Se puede hacer */
        /*conexionsql.listar();
        conexionPosgresql.listar();
        o: */
        imprimir(conexionsql);
        imprimir(conexionPosgresql);
    }

    public static void imprimir(IAccesoDatos datos) {
        datos.listar();
    }
}
