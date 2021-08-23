package UniversityJava.topics.excepciones.section01;

import UniversityJava.topics.excepciones.section2.Aritmetica;

public class TestExceptions {
    public static void main(String[] args) {

        /* Error controlado */
        int resultado = 0;
        try {
            resultado = Aritmetica.division(10, 0);
        } catch (Exception e) {
            e.printStackTrace(System.out);
            /* Impresión de manera individual */
            System.out.println("Error: " + e.getMessage());
        }
    }
}
