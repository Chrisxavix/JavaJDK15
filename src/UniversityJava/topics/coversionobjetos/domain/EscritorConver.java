package UniversityJava.topics.coversionobjetos.domain;

public class EscritorConver extends EmpleadoConver {
    final TipoEscrituraConver tipoEscrituraConver;

    public EscritorConver(String nombre, double sueldo, TipoEscrituraConver tipoEscrituraConver) {
        super(nombre, sueldo);
        this.tipoEscrituraConver = tipoEscrituraConver;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Escritura: " + this.tipoEscrituraConver.getDescripcion();
    }

    @Override
    public String toString() {
        return "EscritorConver{Nombre: " + nombre + ", sueldo: " + sueldo
                + ", tipoEscrituraConver: " + tipoEscrituraConver + "}";
    }
}
