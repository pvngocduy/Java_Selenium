package Lesson7_1;

import java.util.ArrayList;
import java.util.List;

public class TestSpeed {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        List<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(bird);
        list.add(horse);
        list.add(tiger);
        int maxSpeed = 0;
        String nameAnimal = null;
        for (Animal animal: list) {
            if (animal.isFlyAble()==false) {
                if (animal.speed()>maxSpeed) {
                    maxSpeed = animal.speed();
                    nameAnimal = animal.name();
                }
            }
        }
        System.out.printf("Winner is "+ nameAnimal+" with speed %d", maxSpeed);
    }
}
