package UniversityJava.Exercices.Proyecto.Caja;

public class Caja {
    int ancho, alto, profundo;

    public Caja () {
        System.out.println("Constructor Vacío");
    }

    /*public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }*/

    public void calcularVolumen() {
        int volumen = this.ancho * this.alto * this.profundo;
        System.out.println("El volumen es: " + volumen);
    }
}
