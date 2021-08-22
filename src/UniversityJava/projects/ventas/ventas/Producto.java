package UniversityJava.projects.ventas.ventas;

public class Producto {
    /* Una vez que se asigna el valor a idProducto ya no se podrá
    modificar, por eso se usa final */
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    private Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio) {
        /* Nos lleva al constructor privado al usar this(); */
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }


}
