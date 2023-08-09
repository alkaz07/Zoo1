import classesAM.Mammal;
import interfacesAM.Flyable;

public class Bat extends Mammal implements Flyable {
    public Bat(double weight) {
        super(weight);
    }

    @Override
    public void move() {
        System.out.println("Летучая мышь летит");
    }

    @Override
    public void fly() {
        System.out.println("здесь алгоритм полета летучей мыши");
    }
}
