package animal.mammal;

import animal.Animal;
import interfacesBehaviour.ColorChange;
import interfacesMove.Jumpable;
import interfacesMove.Runnable;
import interfacesMove.Swimmable;

public class Rabbit extends Animal implements Runnable, Jumpable, Swimmable, ColorChange {

    public Rabbit(double weight) {
        super(weight);
    }

    @Override
    public void move() {

    }

    @Override
    public void jump() {
        System.out.println("Rubbit is the best jumper!");
    }

    @Override
    public void run() {
        System.out.println("Rubbit loves to run");

    }

    @Override
    public void swim() {
        System.out.println("Rubbit has to swim :((");

    }

    @Override
    public void colorChange() {
        System.out.println("animal.mammal.Rabbit has two fur coats");
    }
}
