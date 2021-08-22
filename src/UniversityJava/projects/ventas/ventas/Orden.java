package UniversityJava.projects.ventas.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTS = 10;

    public Orden() {
        /* El ++ antes de la variable significa un preincremento */
        this.idOrden = ++Orden.contadorOrdenes;
        /* Inicializa el array */
        this.productos = new Producto[Orden.MAX_PRODUCTS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < 10 ) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el máximo de productos de: " + Orden.MAX_PRODUCTS);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
             total += this.productos[i].getPrecio();
             /* opción 1
             Producto producto = this.productos[i];
             total+= producto.getPrecio();
             opción 2
             Producto producto = this.productos[i];
             total = total + productos.getPrecio(); */
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Id de la orden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("El total de la orden: $" + String.format("%.2f", totalOrden));
        System.out.println("Productos de la orden: ");
        System.out.println("");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println("-----------------------------------------");
            System.out.println("Id Producto        : " + this.productos[i].getIdProducto());
            System.out.println("Nombre del Producto: " + this.productos[i].getNombre());
            System.out.println("Precio del Producto: $" + this.productos[i].getPrecio());

            /* Llama al método toString de Producto */
            /*System.out.println(this.productos[i]);*/
        }
    }

}
