package f.ex14.clase;

public abstract class Traseu {
    protected abstract void statia1();
    protected abstract void statia2();
    protected abstract void statia3();
    protected abstract void statia4();
    protected abstract void statia5();
    protected abstract void statia6();

    protected final void parcurge(boolean tur)
    {
        if(tur)
        {
            statia1();
            statia2();
            statia3();
            statia4();
            statia5();
            statia6();
        }
        else
        {
            statia6();
            statia5();
            statia4();
            statia3();
            statia2();
            statia1();
        }
    }
}
