package ru.geekbrains.lesson4;

public class Run extends Obstacle {
    private int distance;

    public Run(int distance)
    {
        this.distance = distance;
    }

    @Override
    public String action(Contestant contestants) {
        return contestants.run(distance);
    }
}
