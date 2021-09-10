package UniversityJava.topics.colecciones;

import java.util.*;

public class ColeccionesSet {
    public static void main(String[] args) {
        /* Los datos son visualizados en desorden */

        /* Declaración normal de la colección */
        Set miSet = new HashSet();

        /* Declaración recomendada por el IDE */
        Set<String> newSet = new HashSet<String>();
        newSet.add("Lunes");
        newSet.add("Martes");
        newSet.add("Miercoles");
        newSet.add("Jueves");
        newSet.add("Viernes");
        newSet.add("Sabado");
        newSet.add("Domingo");

        /* Si quiere una posición del Set se lo transforma a List */
        List<String> stringsList = new ArrayList<>(newSet);
        System.out.println("Cambio de Set a List: " + stringsList.get(0));

        /*Impresión de los elementos*/
        System.out.println("");
        System.out.println(newSet);
        System.out.println("");
        System.out.println("Tamaño: " + newSet.size());
        System.out.println("");
        System.out.println("Por posición: ");

        System.out.println("");
        newSet.forEach(element -> {
            System.out.println("Colección Set: " + element);
        });
    }
}
