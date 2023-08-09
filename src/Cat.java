public class Cat {
    public class Squirrel extends Mammal implements Jumpable,Runnable,WashUp,Chasing{

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
