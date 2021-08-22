package UniversityJava.topics.coversionobjetos.test;

import UniversityJava.topics.coversionobjetos.domain.EmpleadoConver;
import UniversityJava.topics.coversionobjetos.domain.EscritorConver;
import UniversityJava.topics.coversionobjetos.domain.TipoEscrituraConver;

public class TestConver {
    public static void main(String[] args) {
        EmpleadoConver empleado;
        empleado = new EscritorConver("Juan", 40.5, TipoEscrituraConver.CLASICO);
        System.out.println(empleado);
    }
}
