package Lesson6_2;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class TestSpeed {
    public static void main(String[] args) {
//        Horse horse = new Horse();
//        Tiger tiger = new Tiger();
//        Dog dog = new Dog();
//        List<Animal> list = new ArrayList<>();
//        list.add(horse);
//        list.add(tiger);
//        list.add(dog);
//        int maxSpeed = 0;
//        String nameAnimal = "";
//        for (Animal animal:list){
//            if(animal.getSpeed()>maxSpeed){
//                maxSpeed=animal.getSpeed();
//                nameAnimal = animal.getClass().getName();
//            }
//        }
//        System.out.println(nameAnimal+" Speed: "+maxSpeed);
        Animal_Builder.Builder builder = new Animal_Builder.Builder();
        Animal_Builder animal1 = builder.whatName("Tiger")
                .isFlyAble(false).whatSpeed(new SecureRandom().nextInt(100)).builder();
        Animal_Builder animal2 = builder.whatName("Falcon")
                .isFlyAble(true).whatSpeed(new SecureRandom().nextInt(120)).builder();
        Animal_Builder animal3 = builder.whatName("Horse")
                .isFlyAble(false).whatSpeed(new SecureRandom().nextInt(130)).builder();
        Animal_Builder animal4 = builder.whatName("Bird")
                .isFlyAble(true).whatSpeed(new SecureRandom().nextInt(60)).builder();
        List<Animal_Builder> list = new ArrayList<>();
        list.add(animal1);
        list.add(animal2);
        list.add(animal3);
        list.add(animal4);
        int maxSpeed=0;
        String nameAnimal="";
        for (Animal_Builder animal : list){
            if(!animal.isFlyAble()){
                if(animal.getSpeed()>maxSpeed){
                    maxSpeed=animal.getSpeed();
                    nameAnimal = animal.getName();
                }
            }
        }
        System.out.println("Winner is "+nameAnimal+" with Speed "+maxSpeed);
    }
}
