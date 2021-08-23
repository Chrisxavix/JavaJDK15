package UniversityJava.topics.excepciones.section2;

public class Aritmetica {
    public static int division(int numerador, int denominador) throws Exception2 {
        if (denominador == 0) {
            /* throw: arrojar */
            throw new Exception2("Divición con denominador en cero");
        }
        return  numerador/denominador;
    }
}
