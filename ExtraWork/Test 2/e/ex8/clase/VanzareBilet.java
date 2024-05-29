package e.ex8.clase;

public class VanzareBilet implements Vandabil{
    private int varsta;

    public VanzareBilet(int varsta) {
        this.varsta = varsta;
    }

    public int getVarsta() {
        return varsta;
    }

    @Override
    public void vinde() {
        System.out.printf("S-a vândut biletul cuiva în vârstă de %d ani.%n", this.varsta);
    }
}
