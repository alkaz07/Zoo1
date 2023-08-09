
public class Tiger extends Mammal implements Jumpable{

    public Tiger(double weight) {
        super(weight);
    }

    @Override
    public void move() {
        run();
        swim();
        sneaking();
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
    public void sneaking() {
        System.out.println("Тигр крадётся");
    }
}
