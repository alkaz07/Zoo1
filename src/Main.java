import classesAM.*;
import classesNZ.Owl;
import classesNZ.Penguin;
import interfacesAM.Flyable;

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
        if (type.equals("classesAM.Bat")) return new Bat(weight);
        if (type.equals("classesAM.Fox")) return new Fox(weight);
        if (type.equals("classesNZ.Owl")) return new Owl(weight);
        if (type.equals("classesAM.GoldFish")) return new GoldFish(weight);
       // if (type.equals("classesNZ.Tiger")) return new classesNZ.Tiger(weight);
        if (type.equals("classesNZ.Penguin")) return new Penguin(weight);
        if (type.equals("classesAM.Hedgehog")) return new Hedgehog(weight);
      //  if (type.equals("classesAM.Cat")) return new classesAM.Cat(weight);
        return null;
    }
}