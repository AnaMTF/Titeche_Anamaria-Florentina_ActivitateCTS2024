package a.ex14.clase;

public class Pacient {
    private String nume;
    private int stareSanatate;

    public Pacient(String nume)
    {
        this.nume = nume;
    }

    public void setStareSanatate(int stareSanatate) {
        this.stareSanatate = stareSanatate;
    }

    public String getNume() {
        return nume;
    }

    public int getStareSanatate() {
        return stareSanatate;
    }
}
