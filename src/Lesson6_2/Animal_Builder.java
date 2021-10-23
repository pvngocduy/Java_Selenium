package Lesson6_2;

public class Animal_Builder {
    private final String name;
    private final boolean flyAble;
    private final int speed;

    public boolean isFlyAble() {
        return flyAble;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    private Animal_Builder(Builder builder){
        this.name = builder.name;
        this.flyAble = builder.flyAble;
        this.speed = builder.speed;
    }
    public static class Builder{
        private String name;
        private boolean flyAble;
        private int speed;
        public Builder whatName(String name){
            this.name = name;
            return this;
        }
        public Builder isFlyAble(Boolean bl){
            this.flyAble = bl;
            return this;
        }
        public Builder whatSpeed(int speed){
            this.speed = speed;
            return this;
        }
        public Animal_Builder builder(){
            return new Animal_Builder(this);
        }
    }

    @Override
    public String toString() {
        return "Animal_Builder{" +
                "name='" + name + '\'' +
                ", flyAble=" + flyAble +
                ", speed=" + speed +
                '}';
    }
}
