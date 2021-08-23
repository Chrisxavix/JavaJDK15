package UniversityJava.topics.equalstostringhashcode.domain;

import java.util.Objects;

public class EmpleadoObject {
    protected String nombre;
    protected double sueldo;

    public EmpleadoObject(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obtenerDetalles(){
        return "Nombre: " + this.nombre + ", sueldo: " + this.sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpleadoObject that = (EmpleadoObject) o;
        return Double.compare(that.sueldo, sueldo) == 0 && nombre.equals(that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, sueldo);
    }
}
