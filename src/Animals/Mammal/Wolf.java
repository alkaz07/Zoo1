package Animals.Mammal;

import Animals.Mammal.Mammal;
import Interfaces.Jumpable;
import Interfaces.Runnable;
import Interfaces.Sneakable;
import Interfaces.Swimmable;

public class Wolf extends Mammal implements Jumpable, Runnable, Swimmable, Sneakable {

    public Wolf(double weight) {
        super(weight);
    }
    @Override
        public void move() {
            run();
            swim();
            sneaking();
            jump();
        }

    private void sneaking() {
        System.out.println("���� �������");
    }
    @Override
        public void jump() {
            System.out.println("���� �������");
        }
        @Override
        public void run() {
            System.out.println("���� �����");
        }
        @Override
        public void swim() {
            System.out.println("���� �������");
                }
    @Override
    public void sneak() {
        System.out.println("���� �������");
    }
}

