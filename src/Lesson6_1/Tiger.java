package Lesson6_1;

import java.security.SecureRandom;

public class Tiger extends Animal {
    public Tiger() {
        this.speed = new SecureRandom().nextInt(100);
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
        this.speed = new SecureRandom().nextInt(100);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }
}
