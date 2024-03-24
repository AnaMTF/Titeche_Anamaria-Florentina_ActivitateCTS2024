package prototype.spital.main;

import prototype.spital.clase.PrototipReteta;
import prototype.spital.clase.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ingrediente= new ArrayList<>();
        ingrediente.add("paracetamol");
        ingrediente.add("brufen");
        ingrediente.add("zinc");

        Reteta reteta1 = new Reteta("Nurofen",43,ingrediente);
        PrototipReteta reteta2 = reteta1.copiaza();
        System.out.println(reteta1);
        System.out.println(reteta2);
        ((Reteta)reteta2).setNumeMedicament("Ibuprofen");
        System.out.println(reteta2);
    }
}
