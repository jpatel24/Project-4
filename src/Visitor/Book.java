package Visitor;

/**
 * Created by Ethan and Jeel on 4/19/15.
 */
public class Book implements Visitable {

    protected String isbn;
    protected double quantity;
    protected double price;

    public Book(String isbn, double quantity, double price) {
        this.isbn = isbn;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
