package UniversityJava.topics.herency;

import java.util.Date;

public class Cliente extends Persona{
    private int idCLiente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    /* Los atributos String nombre, char genero, int edad, String direccion
       vienen desde el constructor de la clase padre */
    public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        /* Si se manda a llamar al constructor padre
           con super() debe ir en la primera línea */
        super(nombre, genero, edad, direccion);
        this.idCLiente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCLiente() {
        return this.idCLiente;
    }

    /* No se usa el set porque es un incremental, no será
       editado */
    /*public void setIdCLiente(int idCLiente) {
        this.idCLiente = idCLiente;
    }*/

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCLiente=" + idCLiente +
                ", fechaRegistro=" + fechaRegistro +
                ", vip=" + vip +
                ", Persona=" + super.toString() +
                '}';
    }
}
