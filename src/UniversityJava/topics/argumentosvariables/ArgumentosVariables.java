package UniversityJava.topics.argumentosvariables;

public class ArgumentosVariables {
    private static int cont = 0;
    private static int cont2 = 0;

    public static void main(String[] args) {
        numeros(1, 3);
        numeros(1, 3, 6);
        variosParametros("Chris", 1, 3, 6);
    }

    public static void variosParametros(String nombre, int... numeros) {
        System.out.println("Nombre: " + nombre);
        cont2++;
        for (int numero : numeros) {
            System.out.println("Valor " + cont2 + ": " + numero);
        }
        System.out.println("");
    }

    public static void numeros(int... numeros) {
        cont++;
        for (int numero : numeros) {
            System.out.println("Valor " + cont + ": " + numero);
        }
        System.out.println("");
    }
}
