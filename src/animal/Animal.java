package animal;

public abstract class Animal {
    double weight;

    public Animal(double weight) {
        this.weight = weight;
    }

    public abstract void move();

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "weight=" + weight +
                '}';
    }
}
