package Lesson7_1;

import java.security.SecureRandom;

public class Bird extends Animal{
    @Override
    protected String name() {
        return "Bird";
    }

    @Override
    protected int speed() {
        return new SecureRandom().nextInt(40);
    }

    @Override
    protected boolean isFlyAble() {
        return true;
    }
}
