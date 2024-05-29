package d.ex8.clase;

public class Proxy implements Creditabil{
    private Creditabil cont;

    public Proxy(Creditabil cont) {
        this.cont = cont;
    }

    @Override
    public void crediteaza() {
        if(((Cont)cont).getMoneda().equals("RON"))
        {
            cont.crediteaza();
        }
        else
        {
            System.out.printf("Nu se poate lua un credit în moneda %s. Banca acceptă doar RON.%n", ((Cont)this.cont).getMoneda());
        }
    }
}
