package d.ex15.clase;

public class ContBancar {
    private String detinator;
    private float sold;

    public ContBancar(String detinator, float sold) {
        this.detinator = detinator;
        this.sold = sold;
    }

    public void depune(float suma)
    {
        this.sold += suma;
        System.out.printf("%s a depus %.2f. Sold curent: %.2f%n", this.detinator, suma, this.sold);
    }

    public void retrage(float suma)
    {
        if(this.sold >= suma)
        {
            this.sold -= suma;
            System.out.printf("%s a retras %.2f. Sold curent: %.2f%n", this.detinator, suma, this.sold);
        }
        else
        {
            System.out.printf("%s a încercat să retragă %.2f, însă soldul era insuficient.%n", this.detinator, suma);
        }
    }

    public void interogare()
    {
        System.out.printf("Soldul lui %s: %.2f%n", this.detinator, this.sold);
    }
}
