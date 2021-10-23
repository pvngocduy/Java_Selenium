package Lesson6_1;

import java.util.ArrayList;
import java.util.List;

public class TestSpeed {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Horse horse = new Horse();
        Tiger tiger = new Tiger();
        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(horse);
        animals.add(tiger);
        int maxSpeed = 0;
        String name = null;
        for (Animal a: animals){
            if(a.getSpeed()>maxSpeed){
                maxSpeed = a.getSpeed();
                name = a.getClass().getSimpleName();
            }
        }
        System.out.println("Winner is "+name+" with Speed "+maxSpeed);
    }
}
