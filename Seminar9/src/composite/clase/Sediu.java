package composite.clase;

public interface Sediu {
    void adauga(Sediu s);
    void sterge(Sediu s);
    Sediu getNod(int index);
    void afisare(String indent);
    int numaraAngajati();
}