package f.ex14.clase;

public class Autobuz extends Traseu{
    private int linie;
    private String sofer;
    private String[] statii;
    private boolean tur;

    public Autobuz(int linie, String sofer, String... statii) {
        this.linie = linie;
        this.sofer = sofer;
        this.statii = statii;
        this.tur = true;
    }

    @Override
    protected void statia1() {
        System.out.printf("%d condus de %s a ajuns în stația: %s%n", this.linie, this.sofer, this.statii[0]);
    }

    @Override
    protected void statia2() {
        System.out.printf("%d condus de %s a ajuns în stația: %s%n", this.linie, this.sofer, this.statii[1]);
    }

    @Override
    protected void statia3() {
        System.out.printf("%d condus de %s a ajuns în stația: %s%n", this.linie, this.sofer, this.statii[2]);
    }

    @Override
    protected void statia4() {
        System.out.printf("%d condus de %s a ajuns în stația: %s%n", this.linie, this.sofer, this.statii[3]);
    }

    @Override
    protected void statia5() {
        System.out.printf("%d condus de %s a ajuns în stația: %s%n", this.linie, this.sofer, this.statii[4]);
    }

    @Override
    protected void statia6() {
        System.out.printf("%d condus de %s a ajuns în stația: %s%n", this.linie, this.sofer, this.statii[5]);
    }

    public void parcurge()
    {
        super.parcurge(tur);
        this.tur =! this.tur;
    }
}
