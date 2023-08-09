public class GoldFish extends Fish{
    public GoldFish(double weight) {
        super(weight);
    }

    @Override
    public void swim() {
        System.out.println("Goldfish плывет в толще воды");
    }
}
