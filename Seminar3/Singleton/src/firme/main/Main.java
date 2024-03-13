package firme.main;

import companie.Manager;
import firme.ManagerRegistry;

public class Main {
    public static void main(String[] args) {

        ManagerRegistry managerReg1 = ManagerRegistry.getInstance();
        managerReg1.inregistreazaManager("CTS SRL", "Popescu", 1000);
        managerReg1.inregistreazaManager("CTS SRL", "Ionescu", 1000);
        System.out.println(managerReg1.getManager("CTS SRL"));
    }
}
