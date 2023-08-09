package animal.bird;

import animal.bird.Bird;
import interfacesMove.Flyable;

// By Vladimir
public class Eagle extends Bird implements Flyable {
    public Eagle(double weight) {
        super(weight);
    }

    public void fly(){
        System.out.println("Умеет парить в воздухе");
    }

    public void move() {
        System.out.println("Если только недалеко, а так летают");
    }

}
