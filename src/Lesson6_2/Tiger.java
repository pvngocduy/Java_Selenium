package Lesson6_2;

import java.security.SecureRandom;

public class Tiger extends Animal {
    @Override
    public int getSpeed(){
        int randomSpeed = new SecureRandom().nextInt(100);
        return randomSpeed;
    }
}
