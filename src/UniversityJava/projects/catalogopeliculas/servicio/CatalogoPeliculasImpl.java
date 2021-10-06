package UniversityJava.projects.catalogopeliculas.servicio;

import UniversityJava.projects.catalogopeliculas.datos.AccesoDatosImpl;
import UniversityJava.projects.catalogopeliculas.datos.IAccesoDatos;


public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
    }

    @Override
    public void listarPeliculas() {

    }

    @Override
    public void buscarPelicula(String buscar) {

    }

    @Override
    public void iniciarCatalogoPeliculas() {

    }
}
