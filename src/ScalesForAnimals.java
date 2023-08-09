import animal.Animal;
import java.util.Comparator;

public class ScalesForAnimals implements Comparator<Animal> {
    @Override
    public int compare(Animal a, Animal b) {
        return Double.compare(a.getWeight(), b.getWeight());
    }
}
