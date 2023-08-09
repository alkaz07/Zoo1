public class Hedgehog extends Animal implements Runnable, Defendable{
    public Hedgehog(double weight) {
        super(weight);
    }

    @Override
    public void move() {
        run();
        System.out.println("ёжик носится");

    }

    @Override
    public void run() {

    }

    @Override
    public void defend() { roll();
        System.out.println("ёжик защищается");
    }

    @Override
    public void roll() {

    }
}
