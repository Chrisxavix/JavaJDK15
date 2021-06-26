package UniversityJava.Exercices;

import java.util.Scanner;

public class Exercice01 {
    public static void main(String[] args) {
        // Validación de datos por ingreso
        var entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese el id: ");
        int id = Integer.parseInt(entrada.nextLine());
        System.out.print("Ingrese el precio: ");
        Double precio = Double.parseDouble(entrada.nextLine());
        System.out.println("¿Envío Gratuito?");
        boolean envioGratuito = Boolean.parseBoolean(entrada.nextLine());

        System.out.println("");
        System.out.println("Proporciona el nombre: " + nombre);
        System.out.println("Programacion con Java");
        System.out.println("Proporciona el id: " + id);
        System.out.println("Proporciona el precio: " + precio);
        System.out.println("Proporciona el envio gratuito: " + envioGratuito);
    }
}
