package classesAM;

public abstract class Animal {
    double weight;

    public Animal(double weight) {
        this.weight = weight;
    }

    public abstract void move();
}
