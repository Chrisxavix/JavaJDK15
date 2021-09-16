package UniversityJava.topics.colecciones;

import java.util.*;

public class ColeccionesList {
    public static void main(String[] args) {
        /* Forma de declarar
           importar de util el List */
        List newList = new ArrayList();
        newList.add("valueOne");
        System.out.println("El portador de la casa azul: " + newList.get(0));
        System.out.println("");
        /* Sintaxis recomendad por el IDE */
        for (Object ele : newList) {
            System.out.println("asdmlasdk" + ele) ;
        }
        List<String> miLista = new ArrayList<String>();
        /*Usando List y add se va guardando en orden*/
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        imprimir(miLista);

        /* En ves de usar miLista[0] para visualizar
           información sobre una posición, se usa:
           miLista.get(0) */
        System.out.println("Ingresando a un valor: " + miLista.get(0));


        /*Recorre con foreach, opción 1*/
        System.out.println("");
        for (String element:  miLista) {
            System.out.println("forEach, opcion 1: " + element);
        }

        System.out.println("");
        /*Recorre con foreach, opción 2*/
        miLista.forEach(element -> {
            System.out.println("forEach, opcion 2: " + element);
        });

        System.out.println("");
        for (int i = 0; i < miLista.size(); i++) {
            System.out.println("Con Bucle for: " + miLista.get(i));
        }
    }

    /* Recibir por parámetro */
    public static void imprimir(Collection coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("Elemento de la Lista: " + elemento);
        });
    }
}
