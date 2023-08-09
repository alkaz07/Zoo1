public class Penguin extends Animal implements Swimmable {

    public Penguin(double weight) {
        super(weight);
    }

    @Override
    public void move() {
        swim();
    }
    @Override
    public void swim() {System.out.println("Пингвин плавает как показано в добром советском мультфильме 'Приключения пингвинёнка Лоло'.");}
}