package UniversityJava.Exercices.Proyecto.Caja;

public class CajaMain {
    public static void main(String[] args) {

        // Con valores en vacío
        Caja caja0 = new Caja();
        caja0.ancho = 8;
        caja0.alto = 7;
        caja0.profundo = 7;
        caja0.calcularVolumen();
        System.out.println("Test Commit");

        // Con Valores SobreCargados en el constructor
        /*Caja caja1 = new Caja(8, 7, 7);
        caja1.calcularVolumen();*/
    }
}
