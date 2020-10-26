package ru.geekbrains.lesson5;
public class HumanBeing extends Creature implements AbleToSwim{

        public HumanBeing(String name) {
            super("Human", "James", 2000, 1.0);   //in meters
        }

    @Override
    public String swim() {
        return new String("is able to swim");
    }
}
