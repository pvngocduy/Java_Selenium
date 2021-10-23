package Lesson7_1;

import java.security.SecureRandom;

public class Tiger extends Animal{
    @Override
    protected String name() {
        return "Tiger";
    }

    @Override
    protected int speed() {
        return new SecureRandom().nextInt(100);
    }

    @Override
    protected boolean isFlyAble() {
        return false;
    }
}
