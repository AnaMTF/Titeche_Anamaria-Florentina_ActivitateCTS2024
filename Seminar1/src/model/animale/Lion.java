package model.animale;

public class Lion extends Animal {
    public Lion(int age, String name, int nrPicioare) {
        super(age, name, nrPicioare);
    }

    @Override
    public void eat(String food) {
        var sb = new StringBuilder();
        sb.append("The lion ");
        sb.append(getName());
        sb.append(" eats ");
        sb.append(food);
        System.out.println(sb.toString());
    }
}
