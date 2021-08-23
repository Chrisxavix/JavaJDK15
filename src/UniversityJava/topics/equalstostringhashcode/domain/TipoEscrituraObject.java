package UniversityJava.topics.equalstostringhashcode.domain;

public enum TipoEscrituraObject {
    CLASICO("Escritura a Mano"),
    MODERNO("Escritura Digital");

    private final String descripcion;

    private TipoEscrituraObject(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }
}
