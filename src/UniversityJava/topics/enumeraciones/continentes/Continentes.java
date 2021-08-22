package UniversityJava.topics.enumeraciones.continentes;

public enum Continentes {
    Africa(53),
    Europa(46),
    Asia(44),
    America(34),
    Oseania(14);

    private final int paises;

    Continentes(int paises) {
        this.paises = paises;
    }

    public int getPaises() {
        return this.paises;
    }
}
