package UniversityJava.projects.mundopc.monitor;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorRatones;

    private Monitor() {
        this.idMonitor = ++Monitor.contadorRatones;
    }

    public Monitor(String marca, double tamano) {
        this();
        this.marca = marca;
        this.tamano = tamano;
    }

    public int getMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return this.tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Monitor{ idMonitor: " + idMonitor + ", marca:'" + marca + "', tamano:" + tamano + "}";
    }
}
