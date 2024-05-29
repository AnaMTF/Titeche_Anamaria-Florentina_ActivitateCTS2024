package b.ex7.clase;

public class NotaDePlata implements Printabil {
    private float total;
    public NotaDePlata(float total)
    {
        this.total = total;
    }
    @Override
    public void tipareste() {
        System.out.printf("Totalul notei de plată este: %.2f%n", this.total);
    }
}
