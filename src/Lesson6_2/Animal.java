package Lesson6_2;

import java.security.SecureRandom;

public class Animal {
    public int getSpeed(){
        int randomSpeed = new SecureRandom().nextInt(50);
        return randomSpeed;
    }
}
