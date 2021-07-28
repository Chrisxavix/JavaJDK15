package UniversityJava.topics.usethis;

public class UseThis {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Maggot");
        System.out.println("Result: " + persona1);
        System.out.println("ResultN: " + persona1.nombre);
        System.out.println("ResultA: " + persona1.apellido);
    }
}

class Persona {
    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido= apellido;
        System.out.println("Constructor Persona: " + this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir {
    public void imprimir(Persona persona) {
        System.out.println("Clase Imprimir: " + persona);
        System.out.println("Clase Imprimir con el operador this: " + this);
    }
}