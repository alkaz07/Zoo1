import animal.Animal;
import animal.bird.Bird;
import animal.mammal.Bat;
import animal.mammal.Cat;
import animal.mammal.Fox;
import animal.mammal.Hedgehog;
import animal.fish.*;
import animal.bird.Owl;
import animal.bird.Penguin;
import animal.reptiles.Viper;
import interfacesMove.Crawl;
import interfacesMove.Flyable;
import interfacesMove.Jumpable;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
      //  exemple1();
        exemple2();
    }

    private static void exemple2() {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(generateAnimal("Penguin", 7));
        animals.add(generateAnimal("Viper", 0.9));
        animals.add(generateAnimal("Tiger", 200));

        for (Animal a: animals    ) {
            if(a instanceof Crawl)
                ((Crawl) a).crawl();

            if(a instanceof Jumpable)
                ((Jumpable) a).jump();

            if(a instanceof Bird)
                ((Bird) a).bringEgg(1);
        }
        ScalesForAnimals scales = new ScalesForAnimals();   //создаем объект, который
                            //относится к классу, у которого точно есть метод сравнения животных
        animals.sort(scales);   //использует метод сравнения животных, имеющийся у объекта scales
        System.out.println(animals);


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
        if (type.equals("Tiger")) return new animal.mammal.Tiger(weight);
        if (type.equals("Penguin")) return new Penguin(weight);
        if (type.equals("Hedgehog")) return new Hedgehog(weight);
        if (type.equals("Viper")) return new Viper(weight);
        if (type.equals("Cat")) return new animal.mammal.Cat(weight);
        return null;
    }
}