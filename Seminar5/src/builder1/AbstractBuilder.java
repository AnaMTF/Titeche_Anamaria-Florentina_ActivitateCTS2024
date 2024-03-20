package builder1;

public interface AbstractBuilder {
    Rezervare build();

    AbstractBuilder adaugaMancare(boolean areMancare);
    AbstractBuilder adaugaMuzica(boolean areMuzica);
    AbstractBuilder adaugaBautura(boolean areBautura);
    AbstractBuilder adaugaScaunErgonomic(boolean areScaunErgonomic);

    AbstractBuilder adaugaGenMuzical(String genMuzical);
}
