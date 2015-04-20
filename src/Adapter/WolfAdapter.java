package Adapter;
/**
 * Created by Ethan and Jeel on 4/19/2015.
 */
public class WolfAdapter implements DogInterface {

    private Wolf wolf;

    public WolfAdapter(Wolf wolf){
        this.wolf = wolf;
    }

    @Override
    public void bark() {
        wolf.howl();
    }

    @Override
    public void run() {
        wolf.hunt();
    }
}
