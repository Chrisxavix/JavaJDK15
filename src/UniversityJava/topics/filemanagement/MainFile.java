package UniversityJava.topics.filemanagement;

import java.io.IOException;

public class MainFile {

    public static void main(String[] args) throws IOException {
        var nombreArchivoCrear = "pruebaCrear.txt";
        var nombreArchivoEscribir = "pruebaEscribir.txt";
        var nombreArchivoSobreescribir = "pruebaSobreEscribir.txt";
        var contenidoV1 = "Hola Maggot xD v1";
        var contenidoV2 = "Hola Maggot xD v2";
        /* Crea el archivo */
        FileManagement.crearArchivo(nombreArchivoCrear);
        FileManagement.escribirArchivo(nombreArchivoEscribir, contenidoV1);
        FileManagement.anexarArchivo(nombreArchivoSobreescribir, contenidoV2);
        FileManagement.leerArchivo(nombreArchivoSobreescribir);
    }
}
