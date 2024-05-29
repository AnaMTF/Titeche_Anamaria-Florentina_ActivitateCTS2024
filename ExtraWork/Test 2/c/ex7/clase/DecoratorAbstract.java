package c.ex7.clase;

public abstract class DecoratorAbstract implements Printabil{
    protected Printabil bon;
    protected DecoratorAbstract(Printabil bon){this.bon = bon;}
}
