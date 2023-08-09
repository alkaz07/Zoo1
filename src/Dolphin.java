
public class Dolphin extends Mammal implements Swimmable {
    public Dolphin (double weight) {
        super(weight);
    }

    @Override
    public void move () {

    }

    @Override
    public void swim () {
        System.out.println("The dolphin is swimming");
    }
}