import classesAM.Animal;
import interfacesNZ.Swimmable;

public abstract class Fish extends Animal implements Swimmable {
    public Fish(double weight) {
        super(weight);
    }

    @Override
    public void move() {
        swim();
    }
}
