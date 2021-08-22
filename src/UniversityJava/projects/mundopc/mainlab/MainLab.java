package UniversityJava.projects.mundopc.mainlab;

import UniversityJava.projects.mundopc.computadora.Computadora;
import UniversityJava.projects.mundopc.dispositivoentrada.Raton;
import UniversityJava.projects.mundopc.dispositivoentrada.Teclado;
import UniversityJava.projects.mundopc.monitor.Monitor;
import UniversityJava.projects.mundopc.orden.Orden;

public class MainLab {
    public static void main(String[] args) {
        Monitor monitorHp = new Monitor("HP", 12);
        Raton ratonCorsair = new Raton("in", "Corsair");
        Teclado tecladoQone = new Teclado("in", "HP");
        Computadora pcGaming = new Computadora("Gaming", monitorHp, tecladoQone, ratonCorsair);
        Computadora pcAsus = new Computadora("Asus", monitorHp, tecladoQone, ratonCorsair);
        Orden orden1 = new Orden();
        orden1.agregarComputadora(pcGaming);
        orden1.agregarComputadora(pcAsus);
        orden1.mostrarOrden();
    }
}
