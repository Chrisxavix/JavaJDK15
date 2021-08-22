package UniversityJava.projects.mundopc.orden;

import UniversityJava.projects.mundopc.computadora.Computadora;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Error, se excedió del límite " + Orden.MAX_COMPUTADORAS);
        }
    }

    public void mostrarOrden() {
        System.out.println("Id de la  orden: " + this.idOrden);
        System.out.println("Computadoras de la orden: ");
        System.out.println("");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println("------------------------------");
            /*System.out.println(this.computadoras[i]);*/
            System.out.println("Id          : " + this.computadoras[i].getIdComputadora());
            System.out.println("Nombre      : " + this.computadoras[i].getNombre());
            System.out.println("Monitor");
            System.out.println("Id          : " + this.computadoras[i].getMonitor().getMonitor());
            System.out.println("Marca       : " + this.computadoras[i].getMonitor().getMarca());
            System.out.println("Tamaño      : " + this.computadoras[i].getMonitor().getTamano());
            System.out.println("Teclado");
            System.out.println("Id          : " + this.computadoras[i].getTeclado().getIdTeclado());
            System.out.println("Marca       : " + this.computadoras[i].getTeclado().getMarca());
            System.out.println("Tipo Entrada: " + this.computadoras[i].getTeclado().getTipoEntrada());
            System.out.println("Ratón");
            System.out.println("Id          : " + this.computadoras[i].getRaton().getIdRaton());
            System.out.println("Marca       : " + this.computadoras[i].getRaton().getMarca());
            System.out.println("Tipo Entrada: " + this.computadoras[i].getRaton().getTipoEntrada());
        }
    }
}
