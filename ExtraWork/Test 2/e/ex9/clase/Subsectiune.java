package e.ex9.clase;

import java.util.ArrayList;
import java.util.List;

public class Subsectiune implements Organizabil{
    private String nume;
    private List<Organizabil> locuri;
    private static final List<String> SUBSECTIUNI = new ArrayList<>(List.of("Nord", "Sud", "Est", "Vest", "Copii", "VIP"));
    private static int index = 0;

    public Subsectiune()
    {
        this.nume = SUBSECTIUNI.get(index++);
        if(index==SUBSECTIUNI.size())
        {
            index = 0;
        }
        this.locuri = new ArrayList<>();
    }


    @Override
    public void adauga(Organizabil organizabil) {
        this.locuri.add(organizabil);
    }

    @Override
    public void sterge(Organizabil organizabil) {
        this.locuri.remove(organizabil);
    }

    @Override
    public Organizabil get(int index) {
        return this.locuri.get(index);
    }

    @Override
    public void afiseaza(String indent) {
        System.out.printf("%sSubsecțiunea %s are următoarele locuri:%n", indent, this.nume);
        this.locuri.forEach(loc -> loc.afiseaza("\t\t\t"));
    }
}
