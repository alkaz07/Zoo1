package classesAM;

import classesAM.Mammal;
import interfacesAM.Huntable;
import interfacesAM.Jumpable;
import interfacesNZ.Runnable;
import interfacesNZ.Swimmable;

public class Fox extends Mammal implements Jumpable, Swimmable, Runnable, Huntable {

    public Fox(double weight) {
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
        System.out.println("Лисица высоко прыгает");
    }

    @Override
    public void swim() {
        System.out.println("Лисица редко плавает");
    }

    @Override
    public void run() {
        System.out.println("Лисица быстро бегает");
    }

    @Override
    public void hunt() {
        System.out.println("Лисица тихо охотится");
    }
}
