package Visitor;

/**
 * Created by Ethan and Jeel on 4/19/15.
 */
public class BillingVisitor implements Visitor {

    double totalPrice = 0.0;

    @Override
    public void visit(Book book) {
        totalPrice += (book.quantity * book.price);
    }

    @Override
    public void visit(Vegetable vegetable) {
        totalPrice += (vegetable.weight * vegetable.price);
    }

    @Override
    public void visit(Fruit fruit) {
        totalPrice += (fruit.quantity * fruit.price);
    }
}
