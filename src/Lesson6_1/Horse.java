package Lesson6_1;

import java.security.SecureRandom;

public class Horse extends Animal {
    public Horse() {
        this.speed = new SecureRandom().nextInt(75);
    }
    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
        this.speed = new SecureRandom().nextInt(75);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }
}
