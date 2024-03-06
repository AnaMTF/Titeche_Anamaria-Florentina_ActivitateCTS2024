package firme;

public class Manager {
    private String numeManager;
    private String numeFirma;
    private double salariu;

    protected Manager(String numeManager, String numeFirma, double salariu) {
        this.numeManager = numeManager;
        this.numeFirma = numeFirma;
        this.salariu = salariu;
    }

    public void setNumeManager(String numeManager) {
        this.numeManager = numeManager;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "numeManager='" + numeManager + '\'' +
                ", numeFirma='" + numeFirma + '\'' +
                ", salariu=" + salariu +
                '}';
    }

    public String getNumeManager() {
        return numeManager;
    }
}
