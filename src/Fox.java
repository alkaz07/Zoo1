public class Fox extends Mammal implements Jumpable, Swimmable, Runnable{

    public Fox(double weight) {
        super(weight);
    }

    @Override
    public void move() {
        run();
        jump();
        swim();
    }

    @Override
    public void jump() {
        System.out.println("Лисица высоко прыгает");
    }

    @Override
    public void swim() {
        System.out.println("Лисица редко плавает");
    }

    @Override
    public void run() {
        System.out.println("Лисица быстро бегает");
    }
}
