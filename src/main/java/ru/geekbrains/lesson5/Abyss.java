package ru.geekbrains.lesson5;

public class Abyss extends Obstacle {

    private int flyHeight;

    public Abyss(int flyHeight) {
        this.flyHeight = flyHeight;
    }

    @Override
    public String action(Contestant contestants) {

            if (contestants instanceof AbleToFly) {
                return ((AbleToFly) contestants).fly();
            }
        return new String(contestants.getResult() + "fly over the abyss");
    }
}

