package adapter.softVechi;

import java.util.ArrayList;
import java.util.List;

public class Bucatarie implements SoftBucatarie{
    private List<Produs> listaProduse;

    public Bucatarie() {
        this.listaProduse = new ArrayList<>();
    }

    public void adaugaProdus(Produs produs){
        this.listaProduse.add(produs);
    }

    @Override
    public void printareBon() {
        float totalBon = 0;
        System.out.println("Bonul contine urmatoarea lista de produse: ");
        for(Produs produs: listaProduse){
            System.out.println(produs);
            totalBon += produs.getPret();
        }
        System.out.println("Total: " + totalBon);
    }
}
