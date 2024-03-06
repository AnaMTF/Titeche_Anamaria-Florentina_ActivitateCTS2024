package companie;

public class Manager {
    private String nume;
    private double salariu;
    private int nrSubordonati;
    private static Manager instanta=null; //lazy initialization
    //private static Manager instanta=new Manager("Ion", 10000, 10); //eager initialization

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public int getNrSubordonati() {
        return nrSubordonati;
    }

    public void setNrSubordonati(int nrSubordonati) {
        this.nrSubordonati = nrSubordonati;
    }

    private Manager(String nume, double salariu, int nrSubordonati) {
        this.nume = nume;
        this.salariu = salariu;
        this.nrSubordonati = nrSubordonati;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                ", nrSubordonati=" + nrSubordonati +
                '}';
    }

//    public static Manager getInstance(){  //eager initialization
//        return instanta;
//    }

    public synchronized static Manager getInstance (String name, double salariu, int nrSubordonati){  //lazy initialization
        if(instanta==null){
            instanta=new Manager(name,salariu,nrSubordonati);
        }
        return instanta;
    }
    public static Manager getInstance(){
        return  instanta = getInstance("Ion", 10000, 10);
    }
}
