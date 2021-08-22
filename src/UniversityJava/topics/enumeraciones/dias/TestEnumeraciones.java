package UniversityJava.topics.enumeraciones.dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Día 1: " + Dias.Lunes);
        indicarDiaSemana(Dias.Lunes);
    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias){
        case Lunes:
            System.out.println("Primer día de la semana");
            break;
            case Martes:
                System.out.println("Segundo día de la semana");
                break;
        }

    }
}
