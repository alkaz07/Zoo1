
public class Tiger extends Mammal implements Jumpable{

    public Tiger(double weight) {
        super(weight);
    }

    @Override
    public void move() {
        jump();
    }

    @Override
    public void jump() {
        System.out.println("Тигр прыгает");
    }
}