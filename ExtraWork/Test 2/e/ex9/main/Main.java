package e.ex9.main;

import e.ex9.clase.*;

import java.util.Random;

public class Main {
    static final int NR_MAX_SECTIUNI = 10;
    static final int NR_MAX_SUBSECTIUNI = 15;
    static final int NR_MAX_LOCURI = 20;
    static final Random rng = new Random();

    static Organizabil getIerarhie(String numeStadion)
    {
        Organizabil stadion = new Stadion(numeStadion);
        int nrSectiuni = rng.nextInt(NR_MAX_SECTIUNI)+1;
        for (int i = 0; i < nrSectiuni; i++) {
            Organizabil sectiune = new Sectiune();
            int nrSubsectiuni = rng.nextInt(NR_MAX_SUBSECTIUNI)+1;
            for (int i1 = 0; i1 < nrSubsectiuni; i1++) {
                Organizabil subsectiune = new Subsectiune();
                int nrLocuri = rng.nextInt(NR_MAX_LOCURI);
                for (int i2 = 0; i2 < nrLocuri; i2++) {
                    Organizabil loc = new Loc();
                    subsectiune.adauga(loc);
                }
                sectiune.adauga(subsectiune);
            }
            stadion.adauga(sectiune);
        }
        return stadion;
    }

    public static void main(String[] args) {
        Organizabil stadion = getIerarhie("Ilie Oană");
        stadion.afiseaza(null);
    }
}
