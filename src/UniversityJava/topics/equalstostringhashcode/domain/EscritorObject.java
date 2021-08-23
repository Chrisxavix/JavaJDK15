package UniversityJava.topics.equalstostringhashcode.domain;

public class EscritorObject extends EmpleadoObject {
    final TipoEscrituraObject tipoEscritura;

    public EscritorObject(String nombre, double sueldo, TipoEscrituraObject tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", tipoEscritura: " + tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura=" + tipoEscritura + '}' + " " + super.toString();
    }

    public TipoEscrituraObject getTipoEscritura(){
        return this.tipoEscritura;
    }
}
