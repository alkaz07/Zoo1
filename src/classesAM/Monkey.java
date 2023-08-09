package classesAM;

import classesAM.Mammal;
import interfacesAM.Igrimacable;
import interfacesAM.Jumpable;
import interfacesNZ.Swimmable;

public class Monkey extends Mammal implements Jumpable, java.lang.Runnable, Swimmable, Igrimacable {
    public Monkey(double weight) {
        super(weight);
    }

    @Override
    public void move() {
        run();
        jump();
        swim();
    }

    @Override
    public void jump() {
        System.out.println("Прыгаю по лианам");
    }

    @Override
    public void swim() {
        System.out.println("Купаюсь, плещусь в воде");
    }

    @Override
    public void run() {
        System.out.println("Бегаю, помогая руками");
    }

    @Override
    public void grimace() {
        System.out.println("Строю всем рожи");
    }
}
