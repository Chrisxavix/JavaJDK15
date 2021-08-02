package UniversityJava.topics.methodoverload;


public class MethodOverload {
    /* Method Overload o Sobrecarga de métodos
       Usar el mismo nombre del métodopero con diferentes parámetros
       Si es público los demás igual */

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double sumar(double a, double b, double c) {
        return a + b + c;
    }

}
