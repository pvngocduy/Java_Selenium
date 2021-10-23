package Lesson6_2;

import java.security.SecureRandom;

public class Dog extends Animal {
    @Override
    public int getSpeed(){
        int randomSpeed = new SecureRandom().nextInt(60);
        return randomSpeed;
    }
}
