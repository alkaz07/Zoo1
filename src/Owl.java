public class Owl extends Bird implements Flyable{
    public Owl(double weight) {
        super(weight);
    }

    @Override
    public void move() {
        //System.out.println("сова бесшумно летит");
        fly();
    }

    @Override
    public void fly() {
        System.out.println("сова летит при помощи крыльев");
    }
}
