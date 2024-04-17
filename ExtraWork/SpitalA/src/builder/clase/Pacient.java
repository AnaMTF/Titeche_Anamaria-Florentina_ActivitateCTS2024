package builder.clase;

public class Pacient {
    boolean arePatRabatabil;
    boolean areMicDejun;
    boolean arePapuciCamera;
    boolean areHalatInterior;

    protected Pacient(boolean arePatRabatabil, boolean areMicDejun, boolean arePapuciCamera, boolean areHalatInterior) {
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejun = areMicDejun;
        this.arePapuciCamera = arePapuciCamera;
        this.areHalatInterior = areHalatInterior;
    }

    protected boolean isArePatRabatabil() {
        return arePatRabatabil;
    }

    protected void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    protected boolean isAreMicDejun() {
        return areMicDejun;
    }

    protected void setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }

    protected boolean isArePapuciCamera() {
        return arePapuciCamera;
    }

    protected void setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
    }

    protected boolean isAreHalatInterior() {
        return areHalatInterior;
    }

    protected void setAreHalatInterior(boolean areHalatInterior) {
        this.areHalatInterior = areHalatInterior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejun=").append(areMicDejun);
        sb.append(", arePapuciCamera=").append(arePapuciCamera);
        sb.append(", areHalatInterior=").append(areHalatInterior);
        sb.append('}');
        return sb.toString();
    }
}
