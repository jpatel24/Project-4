package Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ethan and Jeel on 4/19/15.
 */
public class Client {
    public static void main(String[] args) {

        List<Visitable> visitableElements = new ArrayList<Visitable>();

        visitableElements.add(new Book("I123",10,2.0));
        visitableElements.add(new Fruit(5,7.0));
        visitableElements.add(new Vegetable(25,8.0));

        BillingVisitor billingVisitor = new BillingVisitor();

        for(Visitable visitableElement : visitableElements){
            visitableElement.accept(billingVisitor);
        }

        OfferVisitor offerVisitor = new OfferVisitor();

        for(Visitable visitableElement : visitableElements){
            visitableElement.accept(offerVisitor);
        }

        System.out.println("Total bill " + billingVisitor.totalPrice);
        System.out.println("Offer  " + offerVisitor.offer);

    }
}
