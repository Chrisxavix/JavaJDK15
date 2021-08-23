package UniversityJava.topics.abstractclass;

public class TestFiguras {
    public static void main(String[] args) {
        /*No se puede crear objetos de una clase abstracta, como:
          FiguraGeometrica test1 = new FiguraGeometrica(); */
        /* Polimorfismo */
        /* Asignación de un tipo hijo a un tipo padre, conocido como
           Upcasting
              Padre                         Hijo
           FiguraGeometrica figura = new Rectangulo("Rectángulo"); */
        FiguraGeometrica figura = new Rectangulo("Rectángulo");
        figura.dibujar();
    }
}
