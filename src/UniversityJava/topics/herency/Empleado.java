package UniversityJava.topics.herency;

public class Empleado extends Persona{
    /* Como la clase Empleado no tendrá clases hijas que hereden se usa private,
    en caso de que si hereden se usa protected */
    private int idEmpleado;
    private double sueldo;
    /* Una variable static se asocia con la clase y no con los objetos */
    private static int contadorEmpleado;

    /* Sobrecarga de constructores */
    public Empleado() {
        this.idEmpleado = ++Empleado.contadorEmpleado;
        /* o se puede usar
        this.idEmpleado = ++contadorEmpleado; */
    }

    public Empleado(String nombre, double sueldo) {
        /* Sobrecarga de constructores
        This(); y super(); no deben ir ambos, al usar this estoy
         llamando al constructor sin parámetros para validar el this.idEmpleado */

        this();
        /*super(nombre);
         Entonces para reemplazar al super(nombre) uso
         this.nombre que trade desde Persona, mismo que está
          declarado como protected para usar al hacer herencia */
        this.nombre = nombre;
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
