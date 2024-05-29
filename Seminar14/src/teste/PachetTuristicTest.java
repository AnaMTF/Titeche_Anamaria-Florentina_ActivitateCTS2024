package teste;

import clase.IPersoana;
import clase.PachetTuristic;
import clase.Persoana;
import clase.PersoanaFake;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import teste.dubluri.TesteCuFake;
import teste.dubluri.TesteFaraFake;

import static org.junit.Assert.*;

public class PachetTuristicTest {

    @Test
    @Category(TesteFaraFake.class)
    public void corectitudineAplicaDiscountVarstnici() {
        IPersoana persoana = new Persoana("Maria", "2023456789123");
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Barcelona", 100.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(90, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(TesteFaraFake.class)
    public void boundaryAplicaDiscountVarstnici(){
        IPersoana persoana = new Persoana("Maria", "2590304789123");
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Barcelona", 100.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(90, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(TesteCuFake.class)
    public void AplicaDiscountVarstnici(){
        IPersoana persoanaFake = new PersoanaFake();
        ((PersoanaFake) persoanaFake).setVarsta(75);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Barcelona", 200.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(180, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(TesteCuFake.class)
    public void falseAplicaDiscountVarstnici(){
        IPersoana persoanaFake = new PersoanaFake();
        ((PersoanaFake) persoanaFake).setVarsta(55);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Barcelona", 200.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(200, pachetTuristic.getPret(), 0.01);
    }

}