package ru.geekbrains.lesson5;
public class Wall extends Obstacle {
    private double height;
    public Wall(double height) {
        this.height = height;
    }

    @Override
    public String action(Contestant contestants)
    {
        return contestants.jump(height);
    }

}
