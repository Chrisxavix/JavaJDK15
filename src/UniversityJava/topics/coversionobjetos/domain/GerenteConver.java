package UniversityJava.topics.coversionobjetos.domain;

public class GerenteConver extends EmpleadoConver {
    
    private String departamento;
    
    public GerenteConver(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", departamento:" + this.departamento;
    }
    
}
