package classesNZ;

import interfacesAM.Jumpable;
import interfacesNZ.Runnable;
import interfacesNZ.Sneakable;
import interfacesNZ.Swimmable;

public class wolf extends Mammal implements Jumpable, Runnable, Swimmable, Sneakable {

    public wolf(double weight) {
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

