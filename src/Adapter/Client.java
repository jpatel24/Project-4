package Adapter;

/**
 * Created by Ethan and Jeel on 4/19/2015.
 */
public class Client {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Wolf wolf = new Wolf();

        DogInterface wolfAdapter = new WolfAdapter(wolf);

        System.out.print("Dog: ");
        dog.bark();
        dog.run();

        System.out.print("Wolf: ");
        wolfAdapter.bark();
        wolfAdapter.run();
    }
}
