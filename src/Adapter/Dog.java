package Adapter;

/**
 * Created by Ethan and Jeel on 4/19/2015.
 */
public class Dog implements DogInterface {
    @Override
    public void bark() {
        System.out.println("bark bark");
    }

    @Override
    public void run() {
        System.out.println("Dog is running around");
    }
}
