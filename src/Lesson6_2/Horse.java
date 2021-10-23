package Lesson6_2;

import java.security.SecureRandom;

public class Horse extends Animal {
    @Override
    public int getSpeed(){
        int randomSpeed = new SecureRandom().nextInt(75);
        return randomSpeed;
    }
}
