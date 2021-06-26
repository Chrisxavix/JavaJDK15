package UniversityJava.Exercices;

public class Exercice06 {
    public static void main(String[] args) {
        // Ciclo For
        var finalValue = 5;

        for (int i = 1; i <= finalValue; i++) {
            if ( i%2 != 0) {
                // Usando continue va a la siguiente iteración, como omitiendo
                 continue;
            }
            System.out.println("Par: " + i);
        }
        System.out.println("");
        for (int i = 1; i <= finalValue; i++) {
            if ( i%2 == 0) {
                System.out.println("Par: " + i);
                // Usando break solo encuentra el primero
                break;
            }
        }
    }
}
