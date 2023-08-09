import animal.Animal;
import animal.bird.Owl;
import animal.bird.Penguin;
import animal.fish.GoldFish;
import animal.mammal.Bat;
import animal.mammal.Cat;
import animal.mammal.Fox;
import animal.mammal.Hedgehog;
import interfacesMove.Flyable;

public class Main {
    public static void main(String[] args) {
        exemple1();
    }

    private static void exemple1() {
        Flyable[] fliers = new Flyable[4];
        fliers[0] = new Owl(10);
        fliers[1] = new Bat(0.3);
        fliers[2] = new Bat(0.4);
        fliers[3] = new Bat(0.25);
        for (Flyable f: fliers   ) {
            f.fly();
        }
    }

    public static Animal generateAnimal(String type, double weight)
    {
        if (type.equals("Bat")) return new Bat(weight);
        if (type.equals("Fox")) return new Fox(weight);
        if (type.equals("Owl")) return new Owl(weight);
        if (type.equals("GoldFish")) return new GoldFish(weight);
       if (type.equals("Tiger")) return new Tiger(weight);
        if (type.equals("Penguin")) return new Penguin(weight);
        if (type.equals("Hedgehog")) return new Hedgehog(weight);
      /if (type.equals("Cat")) return new Cat(weight);
        return null;
    }
}