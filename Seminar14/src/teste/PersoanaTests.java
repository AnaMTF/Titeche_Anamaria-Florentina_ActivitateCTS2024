package teste;

import clase.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import teste.dubluri.TesteCuFake;
import teste.dubluri.TesteFaraFake;

import static org.junit.Assert.*;

public class PersoanaTests {

    @org.junit.Test
    @Category(TesteFaraFake.class)
    public void getSexReturnM() {
        Persoana persoana1= new Persoana("Mihai", "1021103123456");
        assertEquals("M", persoana1.getSex());
    }

    @org.junit.Test
    @Category(TesteFaraFake.class)
    public void getSexReturnF() {
        Persoana persoana1= new Persoana("Maria", "2021103123456");
        assertEquals("F", persoana1.getSex());
    }

    @org.junit.Test
    @Category(TesteFaraFake.class)
    public void testSuperiorBoundary(){
        Persoana persoana2= new Persoana("Maria", "8021103123456");
        assertEquals("F", persoana2.getSex());
    }

    @org.junit.Test
    @Category(TesteFaraFake.class)
    public void getSexCrossCheck(){
        Persoana persoana=new Persoana("Maria","60893674912");
        String expected=(persoana.CNP.charAt(0)%2==0? "F": "M");
        assertEquals(expected,persoana.getSex());
    }

    @org.junit.Test(expected= IllegalArgumentException.class)
    @Category(TesteFaraFake.class)
    public void getSexErrorCondition(){
        Persoana persoana=new Persoana("Maria","s0893674912");
        persoana.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    @Category(TesteFaraFake.class)
    public void getErrorEmptyString(){
        Persoana persoana=new Persoana("Maria", "");
        persoana.getSex();
    }

    @org.junit.Test(timeout = 200)
    @Category(TesteFaraFake.class)
    public void getPerformance(){
        Persoana persoana=new Persoana("Ana", "68790985673543");
        persoana.getSex();
    }

    @org.junit.Test
    @Category(TesteFaraFake.class)
    public void getConformance(){
        Persoana persoana=new Persoana("Maria", "18790985673543");
        String expected=persoana.getSex();
        assertTrue(expected.equals("F")||expected.equals("M"));
    }

    @org.junit.Test
    @Category(TesteFaraFake.class)
    public void getSexOrder(){
        Persoana persoana=new Persoana("Maria", "28790985673543");
        Persoana persoana1=new Persoana("Marius", "18790985673543");
        String expected=persoana.getSex();
        assertTrue(persoana1.getSex().compareTo(persoana.getSex()) > 0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    @Category(TesteFaraFake.class)
    public void getSexNullValue(){
        Persoana persoana=new Persoana("Maria", null);
        persoana.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    @Category(TesteFaraFake.class)
    public void getSexZeroValue(){
        Persoana persoana=new Persoana("Maria", "0000000000000");
        persoana.getSex();
    }
}