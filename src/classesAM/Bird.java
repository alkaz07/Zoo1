package classesAM;

import classesAM.Animal;

public abstract class Bird extends Animal {

    public Bird(double weight) {
        super(weight);
    }

    public void bringEgg(int n){
        System.out.println(this+" отложила "+n+" яиц");
    }
}
