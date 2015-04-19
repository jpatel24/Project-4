package Visitor;

/**
 * Created by Ethan and Jeel on 4/19/15.
 */
public class Vegetable implements Visitable {

    protected double weight;
    protected double price;

    public Vegetable(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
