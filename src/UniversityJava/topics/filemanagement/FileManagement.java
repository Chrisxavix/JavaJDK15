package UniversityJava.topics.filemanagement;

import java.io.*;

public class FileManagement {

    public static void crearArchivo(String nombreArchivo) throws FileNotFoundException {
        File archivo = new File(nombreArchivo);
        PrintWriter salida = new PrintWriter("./src/UniversityJava/topics/filemanagement/" + archivo);
        salida.close();
    }

    public static void escribirArchivo(String nombreArchivo, String contenido) throws FileNotFoundException {
        File archivo = new File(nombreArchivo);
        PrintWriter salida = new PrintWriter("./src/UniversityJava/topics/filemanagement/" + archivo);
        salida.println(contenido);
        salida.close();
    }

    public static void anexarArchivo(String nombreArchivo, String contenido) throws IOException {
        File archivo = new File(nombreArchivo);
        PrintWriter salida = new PrintWriter(new FileWriter("./src/UniversityJava/topics/filemanagement/" + archivo, true));
        salida.println(contenido);
        salida.close();
    }

    public static void leerArchivo(String nombreArchivo) throws IOException {
        File archivo = new File(nombreArchivo);
        BufferedReader entrada = new BufferedReader(new FileReader("./src/UniversityJava/topics/filemanagement/" + archivo));
        String lectura = entrada.readLine();
        while (lectura != null) {
            System.out.println("lectura: " + lectura);
            lectura = entrada.readLine();
        }
        entrada.close();
    }
}
