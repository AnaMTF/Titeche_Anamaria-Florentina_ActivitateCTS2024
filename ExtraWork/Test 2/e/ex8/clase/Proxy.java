package e.ex8.clase;

public class Proxy implements Vandabil{
    private Vandabil bilet;

    public Proxy(Vandabil bilet) {
        this.bilet = bilet;
    }

    @Override
    public void vinde() {
        VanzareBilet bilet = (VanzareBilet) this.bilet;
        if(bilet.getVarsta() > 13)
        {
            bilet.vinde();
        }
        else
        {
            System.out.printf("Nu se poate vinde un bilet unei persoane de %d ani.%n", bilet.getVarsta());
        }
    }
}
