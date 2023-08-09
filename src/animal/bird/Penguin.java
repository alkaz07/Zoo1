package animal.bird;

import animal.Animal;
import interfacesMove.Jumpable;
import interfacesMove.Swimmable;

public class Penguin extends Bird implements Swimmable, Jumpable {

    public Penguin(double weight) {
        super(weight);
    }

    @Override
    public void move() {
        swim();
        jump();
    }
    @Override
    public void swim() {System.out.println("Пингвин плавает так, как показано в добром советском мультфильме 'Приключения пингвинёнка Лоло'.");}

    @Override
    public void jump() {System.out.println("Пингвин и прыгает так, как показано в добром советском мультфильме 'Приключения пингвинёнка Лоло'.");}

}