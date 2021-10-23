package Lesson7_1;

import java.security.SecureRandom;

public class Dog extends Animal{
    @Override
    protected String name() {
        return "Dog";
    }

    @Override
    protected int speed() {
        return new SecureRandom().nextInt(60);
    }

    @Override
    protected boolean isFlyAble() {
        return false;
    }
}
