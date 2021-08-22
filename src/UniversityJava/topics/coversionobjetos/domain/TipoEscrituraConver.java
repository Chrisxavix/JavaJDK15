package UniversityJava.topics.coversionobjetos.domain;

public enum TipoEscrituraConver {
    CLASICO("Escritura a Mano"),
    MODERNO("Escritura Digital");

    private final String descripcion;

    private TipoEscrituraConver(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }
}
