package Lesson7_1;

import java.security.SecureRandom;

public class Horse extends Animal{
    @Override
    protected String name() {
        return "Horse";
    }

    @Override
    protected int speed() {
        return new SecureRandom().nextInt(75);
    }

    @Override
    protected boolean isFlyAble() {
        return false;
    }
}
