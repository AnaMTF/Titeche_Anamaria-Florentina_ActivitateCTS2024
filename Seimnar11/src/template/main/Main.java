package template.main;

import template.clase.AchizitieMedicamentePeBazaDeReteta;

public class Main {
    public static void main(String[] args) {
        AchizitieMedicamentePeBazaDeReteta achizitie1 = new AchizitieMedicamentePeBazaDeReteta("Nozifol-D");
        AchizitieMedicamentePeBazaDeReteta achizitie2 = new AchizitieMedicamentePeBazaDeReteta("Nurofen");
        achizitie1.cumparaMedicament();
        achizitie2.cumparaMedicament();
    }
}
