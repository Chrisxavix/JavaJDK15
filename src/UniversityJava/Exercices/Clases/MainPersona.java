package UniversityJava.Exercices.Clases;

public class MainPersona {
    public static void main(String[] args) {
        // Instanciar de la clase Persona
        // Primer Objeto
        Persona persona1 = new Persona();

        // Setear los datos
        persona1.nombre = "Chris";
        persona1.apellido = "Chillo";
        persona1.desplegarInfo();

        System.out.println("");
        // Segundo Objeto
        Persona persona2 = new Persona();
        persona2.apellido = "Fehn";
        persona2.nombre = "Dani";
        persona2.desplegarInfo();
    }
}
