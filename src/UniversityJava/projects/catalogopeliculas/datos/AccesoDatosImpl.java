package UniversityJava.projects.catalogopeliculas.datos;

import UniversityJava.projects.catalogopeliculas.domain.Pelicula;
import UniversityJava.projects.catalogopeliculas.excepciones.AccesoDatosEx;
import UniversityJava.projects.catalogopeliculas.excepciones.EscrituraDatosEx;
import UniversityJava.projects.catalogopeliculas.excepciones.LecturaDatosEx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existen(String nombreRecurso) throws AccesoDatosEx {
        File archivo = new File(nombreRecurso);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
        File archivo = new File(nombreRecurso);
        List<Pelicula> pelicula = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return pelicula;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {

    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        return null;
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {

    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosEx {

    }
}
