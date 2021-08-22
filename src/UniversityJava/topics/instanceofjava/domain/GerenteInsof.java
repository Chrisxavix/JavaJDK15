package UniversityJava.topics.instanceofjava.domain;

public class GerenteInsof extends EmpleadoInsof {
    
    private String departamento;
    
    public GerenteInsof(String nombre, double sueldo, String departamento){
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
