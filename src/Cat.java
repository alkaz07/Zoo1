public class Cat {
    public class Squirrel extends Mammal implements Jumpable{

        public Squirrel(double weight) {
            super(weight);
        }

        @Override
        public void move() {
            jump();
        }

        @Override
        public void jump() {
            System.out.println("белка прыгает");
        }
    }
}
