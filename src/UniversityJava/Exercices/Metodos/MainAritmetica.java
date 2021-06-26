package UniversityJava.Exercices.Metodos;

public class MainAritmetica {

    public static void main(String[] args) {
        Aritmetica figura1 = new Aritmetica();
        figura1.a = 12;
        figura1.b = 3;
        figura1.sumar();
        System.out.println("Retorna: " + figura1.getSuma());
        System.out.println("Envía y Retorna: " + figura1.setSuma(12, 8));
    }
}
