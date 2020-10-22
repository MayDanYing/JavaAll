package ru.geekbrains.lesson5;

public class Bird extends Creature implements AbleToFly {

    public Bird(String name) {
        super("Bird", "Chiky", 100, 50);
    }

    @Override
    public String fly() {

        return new String("is able to fly");
    }
}
