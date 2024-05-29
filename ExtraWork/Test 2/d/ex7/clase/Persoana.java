package d.ex7.clase;

public class Persoana {
    private int varsta;
    private boolean urmaritPolitie;
    private boolean creanteBanci;

    public Persoana(boolean creanteBanci, boolean urmaritPolitie, int varsta) {
        this.creanteBanci = creanteBanci;
        this.urmaritPolitie = urmaritPolitie;
        this.varsta = varsta;
    }

    public int getVarsta() {
        return varsta;
    }

    public boolean isUrmaritPolitie() {
        return urmaritPolitie;
    }

    public boolean isCreanteBanci() {
        return creanteBanci;
    }
}
