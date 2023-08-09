package animal.bird;

import interfacesBehaviour.MakeSounds;
import interfacesMove.Flyable;
import interfacesMove.Huntable;

public class Crow extends Bird implements Flyable, Huntable, MakeSounds {


    public Crow(double weight) {
        super(weight);
    }

    public void eat(int n) {
        System.out.println(this + " сьела " + n + " кг корма в день");
    }

    @Override
    public void move() {
        move();
        {
            System.out.println(this + "двигается на 1 шаг");
        }
    }

    @Override
    public void fly() {
        System.out.println(this + "летает");
    }

    @Override
    public void hunt() {
        System.out.println(this + "охотится");
    }

    @Override
    public void makeSounds() {
        System.out.println(this + "издает звуки");
    }
}
