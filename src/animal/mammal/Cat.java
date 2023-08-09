package animal.mammal;

import interfacesBehaviour.Chasing;
import interfacesMove.Jumpable;
import interfacesMove.Runnable;
import interfacesBehaviour.WashUp;

public class Cat extends Mammal implements Jumpable, Runnable, WashUp, Chasing {

        public Cat(double weight) {
            super(weight);
        }

        @Override
        public void move() {
            jump();
        }

        @Override
        public void jump() {
            System.out.println("кошка прыгает на шкаф");
        }

        @Override
        public void run() {
            System.out.println( "кошка бегает за мухой");

        }

        @Override
        public void wash() {
            System.out.println("кошка моет лапки");
        }
        @Override
        public void chasing() {
            System.out.println("кошка охотится на мышку");
        }
    }
}
