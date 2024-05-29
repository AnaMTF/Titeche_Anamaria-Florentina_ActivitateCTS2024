package e.ex9.clase;

public interface Organizabil {
    void adauga(Organizabil organizabil);
    void sterge(Organizabil organizabil);
    Organizabil get(int index);
    void afiseaza(String indent);
}
