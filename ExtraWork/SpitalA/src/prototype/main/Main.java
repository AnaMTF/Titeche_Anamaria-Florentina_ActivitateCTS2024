package prototype.main;

import prototype.clase.PrototipReteta;
import prototype.clase.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        List<String> ingrediente= new ArrayList<>();
        ingrediente.add("paracetamol");
        ingrediente.add("brufen");
        ingrediente.add("zinc");

        Reteta reteta1 = new Reteta("Nurofen",43,ingrediente);
        PrototipReteta reteta2 = reteta1.copiaza();
        System.out.println(reteta1);
        System.out.println(reteta2);
        ((Reteta)reteta2).setNumeMedicament("Ibuprofen");
        PrototipReteta reteta3 = ((Reteta) reteta2).clone();
        System.out.println(reteta2);
        System.out.println(reteta3);
    }
}
