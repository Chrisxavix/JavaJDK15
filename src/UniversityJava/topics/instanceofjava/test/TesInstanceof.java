package UniversityJava.topics.instanceofjava.test;

import UniversityJava.topics.instanceofjava.domain.EmpleadoInsof;
import UniversityJava.topics.instanceofjava.domain.GerenteInsof;

public class TesInstanceof {
    public static void main(String[] args) {
       EmpleadoInsof empleado = new EmpleadoInsof("Juan", 5000);
       determinarTipo(empleado);
       empleado = new GerenteInsof("Karla", 10000, "Contabilidad");
       determinarTipo(empleado);
    }
    
    public static void determinarTipo(EmpleadoInsof empleado){
        /* Instance of
           Determina de dónde es la referencia */
        if (empleado instanceof GerenteInsof) {
            System.out.println("De tipo Gerente");
            System.out.println("Departamento: " + ((GerenteInsof) empleado).getDepartamento());
        } else if (empleado instanceof  EmpleadoInsof) {
            System.out.println("De tipo Empleado");
        } else if (empleado instanceof Object) {
            System.out.println("De tipo Objeto");
        }
    }
}
