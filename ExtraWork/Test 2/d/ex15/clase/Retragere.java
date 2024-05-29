package d.ex15.clase;

public class Retragere implements Executabil{
    private ContBancar contBancar;
    private float suma;

    public Retragere(ContBancar contBancar, float suma) {
        this.contBancar = contBancar;
        this.suma = suma;
    }

    @Override
    public void execute() {
        this.contBancar.retrage(this.suma);
    }

    @Override
    public void undo() {
        this.contBancar.depune(this.suma);
        System.out.printf("Se introduce suma de %.2f RON retrasă anterior.%n", this.suma);
    }
}
