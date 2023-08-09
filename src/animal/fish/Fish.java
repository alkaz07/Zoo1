package animal.fish;

import animal.Animal;
import interfacesMove.Swimmable;

public abstract class Fish extends Animal implements Swimmable {
    public Fish(double weight) {
        super(weight);
    }

    @Override
    public void move() {
        swim();
    }
}
