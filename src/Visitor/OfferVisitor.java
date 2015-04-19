package Visitor;

/**
 * Created by Ethan and Jeel on 4/19/15.
 */
public class OfferVisitor implements Visitor {

    StringBuilder offer = new StringBuilder();

    @Override
    public void visit(Book book) {
        offer.append("Book " +  book.isbn +  " discount 10 %" + " \n");
    }

    @Override
    public void visit(Vegetable vegetable) {
        offer.append("Vegetable  No discount \n");
    }

    @Override
    public void visit(Fruit fruit) {
        offer.append("Fruits  No discount \n");
    }
}
