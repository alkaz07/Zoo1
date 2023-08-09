import animal.Animal;
import animal.mammal.Bat;
import animal.mammal.Fox;
import animal.mammal.Hedgehog;
import animal.fish.*;
import animal.bird.Owl;
import animal.bird.Penguin;
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
        if (type.equals("animal.mammal.Bat")) return new Bat(weight);
        if (type.equals("animal.mammal.Fox")) return new Fox(weight);
        if (type.equals("animal.bird.Owl")) return new Owl(weight);
        if (type.equals("animal.classesAM.GoldFish")) return new GoldFish(weight);
       // if (type.equals("animal.mammal.Tiger")) return new animal.mammal.Tiger(weight);
        if (type.equals("animal.bird.Penguin")) return new Penguin(weight);
        if (type.equals("animal.mammal.Hedgehog")) return new Hedgehog(weight);
      //  if (type.equals("animal.mammal.Cat")) return new animal.mammal.Cat(weight);
        return null;
    }
}