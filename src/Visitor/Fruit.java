package Visitor;

/**
 * Created by Ethan and Jeel on 4/19/15.
 */
public class Fruit implements Visitable {

    protected double quantity;
    protected double price;

    public Fruit(double quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
