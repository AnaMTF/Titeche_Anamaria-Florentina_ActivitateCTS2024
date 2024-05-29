package d.ex15.clase;

public class Depunere implements Executabil{
    private ContBancar contBancar;
    private float suma;

    public Depunere(ContBancar contBancar, float suma) {
        this.contBancar = contBancar;
        this.suma = suma;
    }

    @Override
    public void execute() {
        this.contBancar.depune(this.suma);
    }

    @Override
    public void undo() {
        this.contBancar.retrage(this.suma);
        System.out.printf("Se scoate suma de %.2f RON depusă anterior.%n", this.suma);
    }
}
