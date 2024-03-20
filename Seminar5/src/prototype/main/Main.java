package prototype.main;

import prototype.AbstractPrototype;
import prototype.Client;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> accesorii = new ArrayList<>();
        accesorii.add("bratara");
        accesorii.add("cercei");
        Client client1 = new Client("Ana", 20,accesorii );
        AbstractPrototype client2 = client1.copiaza();
        System.out.println(client1);
        ((Client)client2).setVarsta(30);
        System.out.println(client2);
    }
}
