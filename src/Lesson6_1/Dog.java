package Lesson6_1;

import java.security.SecureRandom;
import java.util.Random;

public class Dog extends Animal{
    public Dog() {
        this.speed = new SecureRandom().nextInt(60);
    }
    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
        this.speed = new SecureRandom().nextInt(60);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }
}
