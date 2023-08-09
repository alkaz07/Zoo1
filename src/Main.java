import animal.Animal;
import animal.bird.Bird;
import animal.mammal.*;
import animal.fish.*;
import animal.bird.Owl;
import animal.bird.Penguin;
import animal.reptiles.Viper;
import interfacesMove.Crawl;
import interfacesMove.Flyable;
import interfacesMove.Jumpable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  exemple1();
      //  exemple2();
        exemple3();
    }

    private static void exemple3() {
        ArrayList<Animal> animals = readAnimals("animals.txt");
        System.out.println(animals);
        //animals.sort(new ScalesForAnimals());
        animals.sort((a, b) -> Double.compare(a.getWeight(), b.getWeight()));
        System.out.println(animals);

        //int x = Comparator.comparingDouble(Animal::getWeight).compare(animals.get(3), animals.get(4));

    }

    private static  ArrayList<Animal> readAnimals(String fname) {
        ArrayList<Animal> animals = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(new File(fname));
            while (scanner.hasNextLine())
            {
                String s = scanner.nextLine();
                Scanner parser = new Scanner(s);
                String type = parser.next();
                double w = parser.nextDouble();
                animals.add(generateAnimal(type,w));
            }
        } catch (FileNotFoundException e) {
            System.out.println("файл не открылся");
        }
        return animals;
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
        if (type.equals("Cat")) return new Cat(weight);
        if (type.equals("Rabbit")) return new Rabbit(weight);
        return null;
    }
}