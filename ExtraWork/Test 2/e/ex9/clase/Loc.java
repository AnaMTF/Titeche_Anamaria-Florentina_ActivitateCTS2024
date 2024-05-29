package e.ex9.clase;

public class Loc implements Organizabil{
    private int loc;
    private static int index = 1;
    private static final int MAX_INDEX = 15;

    public Loc()
    {
        this.loc = index++;
        if(index==MAX_INDEX+1)
        {
            index = 1;
        }
    }

    @Override
    public void adauga(Organizabil organizabil) {
        throw new UnsupportedOperationException("Locurile sunt noduri frunză.");
    }

    @Override
    public void sterge(Organizabil organizabil) {
        throw new UnsupportedOperationException("Locurile sunt noduri frunză.");
    }

    @Override
    public Organizabil get(int index) {
        throw new UnsupportedOperationException("Locurile sunt noduri frunză.");
    }

    @Override
    public void afiseaza(String indent) {
        System.out.printf("%sLocul %d%n", indent, this.loc);
    }
}
