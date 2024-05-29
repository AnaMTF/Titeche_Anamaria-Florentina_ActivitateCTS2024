package a.ex9.main;

import a.ex9.clase.Internabil;
import a.ex9.clase.Pacient;
import a.ex9.clase.Proxy;
import a.ex9.clase.Spital;

import java.util.List;

public class Main {
    private static final List<String> listaNume = List.of("Gigi", "Andrei", "Maria", "Ionuț", "Gabriel", "Amelia", "Săndel", "Eliza", "Liviu", "Cristian");
    private static String getNume()
    {
        return listaNume.get((int)(Math.random() * listaNume.size()));
    }
    public static void main(String[] args) {

        Internabil spital = new Spital();
        spital.interneaza(new Pacient(getNume(), Math.random() < 0.5f));
        Internabil proxy = new Proxy(spital);
        for(int i=0; i<listaNume.size(); i++)
        {
            proxy.interneaza(new Pacient(getNume(), Math.random() < 0.5f));
        }
    }
}
