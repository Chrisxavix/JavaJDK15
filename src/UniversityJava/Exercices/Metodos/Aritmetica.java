package UniversityJava.Exercices.Metodos;

public class Aritmetica {
    int a, b;

    // Constructor vacío
    //En la creación del objeto no pide argumentos
    /*public Aritmetica() {
        System.out.println("Test Constructor");
    }*/

    //Sobrecarga de constructores
    //En la creación del objeto pide argumentos
    /*public Aritmetica(int arg1, int arg2) {
        this.a = arg1;
        this.b = arg2;
        System.out.println("Test Sobrecarga");
    }*/

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
