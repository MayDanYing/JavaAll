package ru.geekbrains.lesson5;

public class Fish extends Creature implements AbleToSwim {

    public Fish(String name) {
        super("Fish", "Chuchu", 100);
    }

    @Override
    public String swim() {
        return new String("is able to swim");
    }

}
