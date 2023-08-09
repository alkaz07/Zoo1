package animal.reptiles;

import animal.Animal;
import interfacesBehaviour.Bite;
import interfacesMove.Crawl;

public  class Viper extends Animal implements Crawl, Bite {

    public Viper (double weight) {
        super(weight);
    }

    @Override
    public void move() {
        crawl();
    }

    @Override
    public void crawl() {
        System.out.println("Ползает бесшумно по земле");
    }
    public void bite(){
        System.out.println("Кусает больно ядом");
    }
}