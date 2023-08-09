
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
    
}
