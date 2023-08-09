public class Cat {
    public class Squirrel extends Mammal implements Jumpable,Runnable{

        public Squirrel(double weight) {
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
            System.out.println( "кошка бегает за мышкой");

        }
    }
}
