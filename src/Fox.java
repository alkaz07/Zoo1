public class Fox extends Mammal implements Jumpable, Swimmable{

    public Fox(double weight) {
        super(weight);
    }

    @Override
    public void move() {
        jump();
        swim();
    }

    @Override
    public void jump() {
        System.out.println("Лисица высоко прыгает");
    }

    @Override
    public void swim() {
        System.out.println("Лисица редко плавает");
    }
}
