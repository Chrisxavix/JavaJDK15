package UniversityJava.topics.herency;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Empleado test = new Empleado("Juan", 5000);
        Cliente test1 = new Cliente(new Date(), false, "Chris", 'm', 12, "M4");
        /* Creado objetos desde persona con los constructores definidos */
        Persona sobrecargaVacio = new Persona();
        Persona sobrecargaConUnParametro = new Persona("Chris");
        Persona sobrecargaConvariosParametros = new Persona("Chris", 'm', 12, "M4");
        System.out.println("Empleado: Información de clase hija y padre: " + test);
        System.out.println("Cliente: Información de clase hija y padre: " + test1);
    }
}
