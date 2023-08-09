
public class Squirrel extends Mammal implements Jumpable, Swimmable{

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

    @Override
    public void swim() {
        System.out.println("белка плывет по поверхности");
    }
}
