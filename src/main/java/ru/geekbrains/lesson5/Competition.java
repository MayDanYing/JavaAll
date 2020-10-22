package ru.geekbrains.lesson5;
//создание массива препятствий
public class Competition {

    private Obstacle[] obstacles;

    public Competition(Obstacle... obstacles) {
        this.obstacles = obstacles;}

    void action(Competitors competitors) {
        Contestant[] contestants = competitors.getContestants();
        for (Contestant cont:contestants) {
            for (Obstacle obst:obstacles) {
                competitors.setResult(obst.action(cont));
                if(!cont.isContinueCompetition()) {
                    break;
                }
            }
        }
    }
}