package UniversityJava.Exercices;

import java.util.Scanner;

public class Exercice03 {
    public static void main(String[] args) {
        // Usando Switch anidado

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un nombre: ");
        var test = entrada.nextLine();

        switch (test){
            case "Chris": case "Test":
                System.out.println("Es Chris o Test: " + test);
                break;
            case "Juan":
                System.out.println("Es Juan: " + test);
                break;
            default:
                System.out.println("No existe");
        }
    }
}
