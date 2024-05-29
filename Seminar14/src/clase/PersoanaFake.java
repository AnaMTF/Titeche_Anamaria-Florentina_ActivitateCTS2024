package clase;

public class PersoanaFake implements IPersoana{
    private String sex;
    private int varsta;
    private boolean CNP;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setCNP(boolean CNP) {
        this.CNP = CNP;
    }

    @Override
    public String getSex() {
        return this.sex;
    }

    @Override
    public int getVarsta() {
        return this.varsta;
    }

    @Override
    public boolean checkCNP() {
        return this.CNP;
    }
}
