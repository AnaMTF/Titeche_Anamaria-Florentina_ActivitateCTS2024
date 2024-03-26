package singletonRegistry.pantof.clase;

public class Pantof implements PantofGeneric{
    private String numePantof;
    private String materialPantof;
    private int marimePantof;
    private int stoc;

    public Pantof(String numePantof, String materialPantof, int marimePantof, int stoc) {
        this.numePantof = numePantof;
        this.materialPantof = materialPantof;
        this.marimePantof = marimePantof;
        this.stoc = stoc;
    }

    @Override
    public String getNumePantof() {
        return this.numePantof;
    }

    @Override
    public int getMarime() {
        return this.marimePantof;
    }

    @Override
    public int getStoc() {
        return this.stoc;
    }

    @Override
    public void afiseazaDescrierePantof() {
        System.out.println("mesaj" + this.numePantof + this.stoc + this.materialPantof + this.marimePantof);
    }

    @Override
    public String getMaterialPantof() {
        return this.materialPantof;
    }

    @Override
    public void cresteStoc(int nrPantofi) {
        int stocInitial = this.stoc;
        this.stoc += nrPantofi;
        System.out.println("mesaj" +stocInitial + this.stoc);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pantof{");
        sb.append("numePantof='").append(numePantof).append('\'');
        sb.append(", materialPantof='").append(materialPantof).append('\'');
        sb.append(", marimePantof=").append(marimePantof);
        sb.append(", stoc=").append(stoc);
        sb.append('}');
        return sb.toString();
    }
}
