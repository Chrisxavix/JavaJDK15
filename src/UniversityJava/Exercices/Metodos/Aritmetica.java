package UniversityJava.Exercices.Metodos;

public class Aritmetica {
    int a, b;

    public void sumar() {
        int resultado = a + b;
        System.out.println("La suma es: " + resultado);
    }

    // Retorna el valor a la clase MainAritmetica
    public int getSuma() {
        // int resultado = a + b;
        // return resultado;
        // o usar:
        return this.a + this.b;
    }

    public int setSuma(int setA, int setB) {
        this.a = setA;
        this.b = setB;
        // return a + b;
        return this.getSuma();
    }
}
