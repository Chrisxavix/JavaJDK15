package UniversityJava.topics.equalstostringhashcode.test;

import UniversityJava.topics.equalstostringhashcode.domain.EmpleadoObject;

import java.util.Objects;

public class TestClaseObject {
    public static void main(String[] args) {
        EmpleadoObject empleado1 = new EmpleadoObject("Juan", 5000);
        EmpleadoObject empleado2 = new EmpleadoObject("Juan", 5000);

        if (empleado1 == empleado2) {
            System.out.println("Tienen la misma referencia en memoria");
        } else {
            System.out.println("Tienen distinta referencia en memoria");
        }
        if (empleado1.equals(empleado2)) {
            System.out.println("Los objetos son iguales en contenido");
        } else {
            System.out.println("Los objetos son distintos en contenido");
        }
        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("El valor hashcode es igual");
        } else {
            System.out.println("El valor hashcode es distinto");
        }
    }
}
