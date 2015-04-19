package Visitor;

/**
 * Created by Ethan and Jeel on 4/19/15.
 */
public interface Visitor {

    void visit(Book book);

    void visit(Vegetable vegetable);

    void visit(Fruit fruit);
}

