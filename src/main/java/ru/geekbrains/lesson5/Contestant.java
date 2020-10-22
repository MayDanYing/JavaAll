package ru.geekbrains.lesson5;

public interface Contestant {

    public Contestant[] contestants = new Contestant[0];

    public String jump(double height);

    public String run(int distance);

    public String swim(int swimmingDistance);

    public String fly(int flyingHeight);

    public String getResult();

    boolean isContinueCompetition();
}
