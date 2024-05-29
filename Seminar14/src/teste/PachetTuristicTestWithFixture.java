package teste;

import clase.IPersoana;
import clase.PachetTuristic;
import clase.PersoanaFake;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import teste.dubluri.TesteCuFake;

import static org.junit.Assert.*;

public class PachetTuristicTestWithFixture {
    private PachetTuristic pachetTuristic;

    @Before
    public void setUp() {
        IPersoana persoana = new PersoanaFake();
        ((PersoanaFake) persoana).setVarsta(77);
        this.pachetTuristic = new PachetTuristic(persoana, "Barcelona", 200.0);
    }

    @Test
    @Category(TesteCuFake.class)
    public void AplicaDiscountCuSutaLaSuta() {
        this.pachetTuristic.aplicaDiscountVarstnici(100);
        assertEquals(0.0, this.pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(TesteCuFake.class)
    public void aplicaDiscountCuZero() {
        this.pachetTuristic.aplicaDiscountVarstnici(0);
        assertEquals(200d, this.pachetTuristic.getPret(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(TesteCuFake.class)
    public void aplicaDiscountNegativ(){
        this.pachetTuristic.aplicaDiscountVarstnici(-10);
    }

    @Test(timeout = 10)
    @Category(TesteCuFake.class)
    public void performantaAplicaDiscount(){
        this.pachetTuristic.aplicaDiscountVarstnici(10);
    }

}