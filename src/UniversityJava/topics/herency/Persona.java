package UniversityJava.topics.herency;

public class Persona {
    /* Protected porque va a heredar */
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    public Persona(){

    }

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    /* Getter */
    public String getNombre() {
        return this.nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    /* Setter */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", genero=" + genero +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
