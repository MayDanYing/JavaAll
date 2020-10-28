package ru.geekbrains.lesson7;

public abstract class Fruit {
    private final float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float onePieceWeight() {
        return weight;
    }
}