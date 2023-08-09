public abstract class Penguin extends Animal implements Swimmable {

    public Penguin(double weight) {
        super(weight);
    }

    @Override
    public void move() {
        swim();
    }
}