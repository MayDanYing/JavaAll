package ru.geekbrains.lesson5;
// массив участников

public class Competitors {

    private String name;
    private Contestant[] contestants;
    private StringBuilder results;

    public Competitors(String name, Contestant... contestants) {
        this.name = name;
        this.contestants = contestants;
        this.results = new StringBuilder();
    }

    public void setResult(String result) {
        results.append(result).append("\n");
    }

    public String getName() {
        return name;
    }

    public Contestant[] getContestants() {
        return contestants;
    }

    public void Info() {
          System.out.print(results);
    }
}
