package UniversityJava.projects.catalogopeliculas.datos;

import UniversityJava.projects.catalogopeliculas.domain.Pelicula;
import UniversityJava.projects.catalogopeliculas.excepciones.AccesoDatosEx;
import UniversityJava.projects.catalogopeliculas.excepciones.EscrituraDatosEx;
import UniversityJava.projects.catalogopeliculas.excepciones.LecturaDatosEx;

import java.util.List;

public interface IAccesoDatos {
    boolean existen(String nombreRecurso) throws AccesoDatosEx;

    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

    void crear(String nombreRecurso) throws AccesoDatosEx;

    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
