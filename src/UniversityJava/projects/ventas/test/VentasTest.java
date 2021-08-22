package UniversityJava.projects.ventas.test;

import UniversityJava.projects.ventas.ventas.Orden;
import UniversityJava.projects.ventas.ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("cuaderno", 12.2);
        Producto producto2 = new Producto("lapiz", 1.2);
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
    }
}
