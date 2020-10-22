package ru.geekbrains.lesson5;

public class Creature implements Contestant {

    private String species;
    private String name;
    private int distanceMaxLimit;
    private double heightMaxLimit;
    private int swimmingDistance;
    private int flyingHeight;
    boolean continueCompetition;


    public Creature(String species, String name, int distanceMaxLimit, double heightMaxLimit) {
        this.species = species;
        this.name = name;
        this.continueCompetition = true;
        this.distanceMaxLimit = distanceMaxLimit;
        this.heightMaxLimit = heightMaxLimit;

    }

    public Creature(String species, String name, int swimmingDistance) {
        this.species = species;
        this.name = name;
        this.continueCompetition = true;
        this.swimmingDistance = swimmingDistance;
    }

    public Creature(String species, String name,int distanceMaxLimit, int flyingHeight) {
        this.species = species;
        this.name = name;
        this.distanceMaxLimit = distanceMaxLimit;
        this.continueCompetition = true;
        this.flyingHeight = flyingHeight;
    }

    public String run(int distance) {
        if (distance <= distanceMaxLimit) {
            return  (species + " " + name + " made the running distance!");
        } else {
            continueCompetition = false;
            return  (species + " " + name + " wasn't able to run well enough:(");
        }
    }

    public String swim(int swimDist) {
        if (swimDist <= swimmingDistance) {
            return  (species + " " + name + " was able to swim the distance!");
        } else {
            continueCompetition = false;
            return  (species + " " + name + " failed the swimming distance:(");
        }
    }


    public String fly(int flyHeight) {
        if (flyHeight <= flyingHeight) {
            return  (species + " " + name + " was able to fly over the abyss!");
        } else {
            continueCompetition = false;
            return  (species + " " + name + " failed to fly over the abyss:(");
        }    }

    @Override
    public String getResult() {
        return (species + " " + name + " can't ");
    }

    public String jump(double height) {
        if (height <= heightMaxLimit) {
            return  (species + " " + name + " jumped high over the wall.");
        } else {
            continueCompetition = false;
            return  (species + " " + name + " failed to jump over the wall:(");
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
