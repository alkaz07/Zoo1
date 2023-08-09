
public class Tiger extends Mammal implements Jumpable,Runnable,Swimmable,Sneakable{

    public Tiger(double weight) {
        super(weight);
    }

    @Override
    public void move() {
        run();
        swim();
        sneak();
        jump();
    }

    @Override
    public void jump() {
        System.out.println("Тигр прыгает");
    }
    @Override
    public void run() {
        System.out.println("Тигр бежит");
    }
    @Override
    public void swim() {
        System.out.println("Тигр плавает");
    }
    @Override
    public void sneak() {
        System.out.println("Тигр крадётся");
    }
    @Override
    public void hunt() {
        System.out.println("Тигр охотится");
    }
}