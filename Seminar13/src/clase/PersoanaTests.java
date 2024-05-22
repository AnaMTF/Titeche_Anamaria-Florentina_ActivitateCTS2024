package clase;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTests {

    @org.junit.Test
    public void getSexReturnM() {
        Persoana persoanaM = new Persoana("Ionel", "1034573829124");
        assertEquals("M",persoanaM.getSex());
    }

    @org.junit.Test
    public void getSexReturnF() {
        Persoana persoanaF = new Persoana("Ana", "2034573829124");
        assertEquals("F",persoanaF.getSex());
    }

   @org.junit.Test
    public void getSexSuperiorBoundary() {
        Persoana persoana = new Persoana("Andreea", "8034573829124");
        assertEquals("F",persoana.getSex());
    }

    @org.junit.Test
    public void getSexCrossCheck() {
        Persoana persoana = new Persoana("Alina", "6023456789123");
        assertEquals((persoana.CNP.charAt(0) % 2 == 0 ? "F": "M"),persoana.getSex());
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexErrorCondition() {
        Persoana persoana = new Persoana("Alina", "a023456789123");
        persoana.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexEmptyString(){
        Persoana persoana = new Persoana("Ana", "");
        persoana.getSex();
    }

    @org.junit.Test(timeout = 200)
    public void getSexPerformance(){
        Persoana persoana = new Persoana("Alina", "6023456789123");
        persoana.getSex();
    }

    @org.junit.Test
    public void getSexConformance(){
        Persoana persoana = new Persoana("Alina", "1023456789123");
        assertTrue(persoana.getSex().equals("F")||persoana.getSex().equals("M"));
    }

    @org.junit.Test
    public void getSexOrder(){
        Persoana persoanaF = new Persoana("Ana", "2023456789123");
        Persoana persoanaM = new Persoana("Ionut", "1023456789123");
        assertTrue(persoanaM.getSex().compareTo(persoanaF.getSex()) > 0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexNullCnp(){
        Persoana persoana = new Persoana("Ana", null);
        persoana.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexZeroValue(){
        Persoana persoana = new Persoana("Ana", "0123456789123");
        persoana.getSex();
    }


}