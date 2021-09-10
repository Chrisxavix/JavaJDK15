package UniversityJava.topics.colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {
    public static void main(String[] args) {
        /* Forma de declarar */
        Map testMap = new HashMap();

        /* Sugerencia de declaración dada por el Id */
        Map<String, String> miMap = new HashMap<String, String>();
        miMap.put("Nombre", "Lucas");
        miMap.put("Apellido", "Torres");
        miMap.put("Teléfono", "154654");

        /* Llamar un elemento */
        String element = (String) miMap.get("Nombre");
        System.out.println("Elemento: " + element);
        System.out.println("");

        /* Listar el mapa */
        imprimirKeys(miMap.keySet());
        imprimirValores(miMap.values());


        System.out.println("");
        /*Recorre con foreach, opción 2*/
        miMap.forEach((key, value) -> {
            System.out.println("forEach. Key: " + key + ", value: " + value);
        });
    }

    /* Recibir por parámetro */
    public static void imprimirValores(Collection coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("Elemento de la lista, Valores: " + elemento);
        });
    }

    /* Recibir por parámetro */
    public static void imprimirKeys(Collection coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("Elemento de la lista, Keys: " + elemento);
        });
    }
}
