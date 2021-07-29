package UniversityJava.topics.herency;

public class Empleado extends Persona{
    /* Como la clase Empleado no tendrá clases hijas que hereden se usa private,
    en caso de que si hereden se usa protected */
    private int idEmpleado;
    private double sueldo;
    /* Una variable static se asocia con la clase y no con los objetos */
    private static int contadorEmpleado;

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleado;
        /* o se puede usar
        this.idEmpleado = ++contadorEmpleado; */
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + this.idEmpleado +
                /* o usar:
                "Persona(nombre)=" + this.getNombre() +
                ya que al estar declarado público en la clase
                padre (Persona) se puede usar

                o acceder de manera directa a la clase padre con super
                "Persona(nombre)=" + super.nombre

                o llamar el método toString() de la clase padre
                 "Persona(nombre)=" + super.toString() +

                o un atributo en específico:
                "Persona(nombre)=" + this.nombre +  */
                "Persona=" + super.toString() +
                ", sueldo=" + this.sueldo +
                '}';
    }

}
