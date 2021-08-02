package UniversityJava.topics.methodoverload;

public class MainOperations {

    public static void main(String[] args) {

        /* Cuando los métodos son static no se debe llamar así:
           MethodOverload test1 = new MethodOverload(); */
        var test = MethodOverload.sumar(7, 5);
        System.out.println("Primera función: " + test);
        var test1 = MethodOverload.sumar(7.2,12.5);
        System.out.println("Primera función: " + test1);
        var test2 = MethodOverload.sumar(7, 5, 12.5);
        System.out.println("Primera función: " + test2);
    }

}
