public class Wolf extends Mammal implements Jumpable,Runnable,Swimmable,Sneakable {

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
        System.out.println("Волк крадётся");
    }
    @Override
        public void jump() {
            System.out.println("Волк прыгает");
        }
        @Override
        public void run() {
            System.out.println("Волк бежит");
        }
        @Override
        public void swim() {
            System.out.println("Волк плавает");
                }
    @Override
    public void sneak() {
        System.out.println("Волк крадётся");
    }
}

