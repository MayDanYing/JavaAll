package ru.geekbrains.lesson4;

public class Creature implements Contestant {

    private String species;
    private String name;
    private int distanceMaxLimit;
    private double heightMaxLimit;
    boolean continueCompetition;

    public Creature(String species, String name, int distanceMaxLimit, double heightMaxLimit) {
        this.species = species;
        this.name = name;
        this.continueCompetition = true;
        this.distanceMaxLimit = distanceMaxLimit;
        this.heightMaxLimit = heightMaxLimit;
        this.continueCompetition = true;
    }


    public String run(int distance) {
        if (distance <= distanceMaxLimit) {
            return  (species + " " + name + " made the distance to the finish line!");
        } else {
            continueCompetition = false;
            return  (species + " " + name + " didn't manage to the finish line:(");

        }
    }
    public String jump(double height) {
        if (height <= heightMaxLimit) {
            return  (species + " " + name + " jumped high over the wall.");
        } else {
            continueCompetition = false;
            return  (species + " " + name + " failed:(");
        }
    }


    public boolean competitionContinues() {
        return continueCompetition;
    }

    public void info() {
        System.out.println(species + " " + name + " " + continueCompetition);
    }

    public boolean isContinueCompetition() {
        return continueCompetition;
    }
}
