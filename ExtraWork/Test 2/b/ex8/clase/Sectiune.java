package b.ex8.clase;

public interface Sectiune {
    void adauga(Sectiune... sectiune);
    void sterge(Sectiune... sectiune);
    Sectiune getSectiune(int index);
    void afisare(String indent);
}
