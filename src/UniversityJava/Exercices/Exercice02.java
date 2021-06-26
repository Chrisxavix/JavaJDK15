package UniversityJava.Exercices;

import java.util.Scanner;

public class Exercice02 {
    public static void main(String[] args) {
        // Área y perímetro

        Scanner scanner = new Scanner(System.in);

        System.out.print("Proporciona el alto: ");
        int alto = Integer.parseInt(scanner.nextLine());
        System.out.print("Proporciona el ancho: ");
        int ancho = Integer.parseInt(scanner.nextLine());
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
